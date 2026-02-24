import javax.swing.*;

import SudokuSolver.SudokuSolver;

import java.awt.*;
import java.awt.event.*;

public class SudokuGUI {
    private static final int SIZE = 9;

    private static void animateSolution(JTextField[][] cells, char[][] solved) {
        Timer timer = new Timer(100, null); // slower for visible animation
        final int[] index = { 0 };

        timer.addActionListener(e -> {
            if (index[0] < 81) {
                int i = index[0] / 9;
                int j = index[0] % 9;

                cells[i][j].setText(Character.toString(solved[i][j])); // update cell text here
                Color originalBg = cells[i][j].getBackground();
                cells[i][j].setBackground(Color.CYAN);

                // After short delay, revert background to dark gray
                Timer innerTimer = new Timer(200, ev -> {
                    cells[i][j].setBackground(originalBg);
                });
                innerTimer.setRepeats(false);
                innerTimer.start();

                index[0]++;
            } else {
                ((Timer) e.getSource()).stop();
            }
        });

        timer.start();
    }

    private static boolean isSafe(char[][] board, int row, int col, char ch) {
        if (ch == '.')
            return true; // blank cells are always okay
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == ch)
                return false;
            if (i != row && board[i][col] == ch)
                return false;
        }
        // Check 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if ((r != row || c != col) && board[r][c] == ch)
                    return false;
            }
        }
        return true;
    }

    private static void highlightConflicts(char[][] board, JTextField[][] cells) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.' || isSafe(board, i, j, ch)) {
                    cells[i][j].setBackground(Color.DARK_GRAY);
                } else {
                    cells[i][j].setBackground(Color.RED);
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(SIZE, SIZE));
        gridPanel.setBounds(50, 30, 500, 500);

        JTextField[][] cells = new JTextField[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JTextField tf = new JTextField();
                tf.setHorizontalAlignment(JTextField.CENTER);
                tf.setFont(new Font("SansSerif", Font.BOLD, 20));
                tf.setBackground(Color.DARK_GRAY);
                tf.setForeground(Color.WHITE);
                tf.setCaretColor(Color.WHITE);
                tf.setBorder(BorderFactory.createLineBorder(Color.GRAY));

                cells[i][j] = tf;
                final int row = i;
                final int col = j;

                tf.addKeyListener(new KeyAdapter() {
                    public void keyPressed(KeyEvent e) {
                        int keyCode = e.getKeyCode();
                        int newRow = row;
                        int newCol = col;

                        switch (keyCode) {
                            case KeyEvent.VK_UP:
                                newRow = (row > 0) ? row - 1 : row;
                                break;
                            case KeyEvent.VK_DOWN:
                                newRow = (row < 8) ? row + 1 : row;
                                break;
                            case KeyEvent.VK_LEFT:
                                newCol = (col > 0) ? col - 1 : col;
                                break;
                            case KeyEvent.VK_RIGHT:
                                newCol = (col < 8) ? col + 1 : col;
                                break;
                            default:
                                return;
                        }

                        cells[newRow][newCol].requestFocus();
                    }
                });

                tf.addKeyListener(new KeyAdapter() {
                    public void keyTyped(KeyEvent e) {
                        char ch = e.getKeyChar();
                        if ((Character.isDigit(ch) && ch != '0') || ch == '.') {
                            SwingUtilities.invokeLater(() -> {
                                int nextCol = (col + 1) % 9;
                                int nextRow = row + (col + 1) / 9;
                                if (nextRow < 9) {
                                    cells[nextRow][nextCol].requestFocus();
                                }
                            });
                        }
                    }
                });

                gridPanel.add(tf);
            }
        }

        JButton solveButton = new JButton("Solve");
        solveButton.setBounds(250, 550, 100, 40);
        solveButton.setBackground(Color.GRAY);
        solveButton.setForeground(Color.WHITE);

        // Bind Enter key to Solve action on the root pane
        JRootPane rootPane = frame.getRootPane();

        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "solveSudoku");

        rootPane.getActionMap().put("solveSudoku", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveButton.doClick(); // Simulates the solve button being clicked
            }
        });

        solveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[][] board = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        String text = cells[i][j].getText().trim();
                        if (text.isEmpty()) {
                            board[i][j] = '.';
                        } else {
                            board[i][j] = text.charAt(0);
                        }
                    }
                }

                highlightConflicts(board, cells); // highlight input conflicts

                SudokuSolver solver = new SudokuSolver();
                solver.solveSudoku(board);

                highlightConflicts(board, cells); // highlight conflicts in solution (if any)

                animateSolution(cells, board); // pass solved board here to animate and update cells gradually
            }
        });

        frame.add(gridPanel);
        frame.add(solveButton);
        frame.setVisible(true);
    }
}