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

def tic_tac_toe():
    board = [[" " for _ in range(3)] for _ in range(3)]
    players = ["X", "O"]
    turn = 0

    while True:
        print_board(board)
        player = players[turn % 2]
        print(f"Player {player}, enter your move (row and column: 0 1 2): ")

        try:
            row, col = map(int, input().split())
            if board[row][col] == " ":
                board[row][col] = player
                if check_winner(board, player):
                    print_board(board)
                    print(f"Player {player} wins!")
                    break
                elif is_draw(board):
                    print_board(board)
                    print("It's a draw!")
                    break
                turn += 1
            else:
                print("Cell already taken, try again!")
        except (ValueError, IndexError):
            print("Invalid input, enter row and column as numbers between 0 and 2.")

tic_tac_toe()
