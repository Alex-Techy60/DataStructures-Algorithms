import random

def print_board(board):
    for row in board:
        print(" | ".join(row))
        print("-" * 9)

def check_winner(board, player):
    
    for i in range(3):
        if all(board[i][j] == player for j in range(3)) or all(board[j][i] == player for j in range(3)):
            return True

    
    if all(board[i][i] == player for i in range(3)) or all(board[i][2 - i] == player for i in range(3)):
        return True
    
    return False

def is_draw(board):
    return all(board[i][j] != " " for i in range(3) for j in range(3))

def get_computer_move(board):
    empty_cells = [(i, j) for i in range(3) for j in range(3) if board[i][j] == " "]
    return random.choice(empty_cells)

def tic_tac_toe():
    board = [[" " for _ in range(3)] for _ in range(3)]
    
    print("Welcome to Tic-Tac-Toe! You are 'X', Computer is 'O'.")
    print_board(board)

    while True:
        
        while True:
            try:
                row, col = map(int, input("Enter your move (row and column: 0 1 2): ").split())
                if board[row][col] == " ":
                    board[row][col] = "X"
                    break
                else:
                    print("Cell already taken, try again!")
            except (ValueError, IndexError):
                print("Invalid input, enter row and column as numbers between 0 and 2.")

        print_board(board)

        
        if check_winner(board, "X"):
            print("🎉 You win! 🎉")
            break
        if is_draw(board):
            print("It's a draw! 🤝")
            break

        
        print("Computer is making a move...")
        row, col = get_computer_move(board)
        board[row][col] = "O"
        print_board(board)

        
        if check_winner(board, "O"):
            print("💻 Computer wins! Better luck next time. 😢")
            break
        if is_draw(board):
            print("It's a draw! 🤝")
            break

tic_tac_toe()
