import random
def func(comp_choice, user_choice, comp_score, user_score):
    if(user_choice == -1 and comp_choice == 0):
        print('''
              You Lost the round,
              your choice =  rock
              computer choice = paper
              ''')
        comp_score+=1
    elif(user_choice == -1 and comp_choice == 1):
        print('''
              You won the round,
              your choice =  rock
              computer choice = scissor
              ''')
        user_score+=1
    elif(user_choice == 0 and comp_choice == -1):
        print('''
              You won the round,
              your choice =  paper
              computer choice = rock
              ''')
        user_score+=1
    elif(user_choice == 0 and comp_choice == 1):
        print('''
              You won the round,
              your choice =  paper
              computer choice = scissor
              ''')
        comp_score+=1
    elif(user_choice == 1 and comp_choice == -1):
        print('''
              You lost the round,
              your choice =  scissor
              computer choice = rock
              ''')
        comp_score+=1
    elif(user_choice == 1 and comp_choice == 0):
        print('''
              You won the round,
             your choice =  scissor
              computer choice = paper
              ''')
        user_score+=1
    elif(user_choice == -1 and comp_choice == -1):
        print("""
              It's a tie
              You both chose Rock
              """)
    elif(user_choice == 0 and comp_choice == 0):
        print("""
              It's a tie
              You both chose Paper
              """)
    elif(user_choice == 1 and comp_choice == 1):
        print("""
              It's a tie
              You both chose Scissor
              """)
    if(comp_score == 3):
        print(f'''
              You Lost the match
              Your score = {user_score}
              Computer score = {comp_score}
              ''')
        
        return
    elif(user_score == 3):
        print(f'''
            You won the match
            Your score = {user_score}
            Computer score = {comp_score}
            ''')
        return
    a = input("Enter your next choice :  ")
    comp_choice = random.choice(list(numbers))
    func(comp_choice, dict[a], comp_score, user_score)
print('''
      This is a rock paper scissor game
      You have to choose r for rock, p for paper and s for scissors
      ''')
dict = {"r" : -1, "p" : 0, "s" : 1}
numbers = {-1,0,1}
a = input("Enter your first choice :  ")
comp_choice = random.choice(list(numbers))
comp_score = int(0)
user_score = int(0)
func(comp_choice, dict[a], comp_score, user_score)
print('''
      Wanna play again?
      y/n :  
      ''')
replay = input()
if(replay=="y"):
    comp_score == 0
    user_score == 0
    a = input("Enter your first choice :  ")
    func(comp_choice, dict[a], comp_score, user_score)
else:
    print('''
          Thank you,
          See you again
          ''')