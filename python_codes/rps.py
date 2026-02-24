import random
choise=["rock","paper","scissors"]
player_point=0
computer_point=0
while True:
    player=input("rock/paper/scissors : ")
    computer=random.choice(choise)
    print(f"player :{player}")
    print(f"computer :{computer}")
    if(player=="rock" and computer=="scissors" ):
        print("""
        
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""")
        print("you won")
        player_point+=1
    elif(player=="scissors"and computer=="paper"):
        print("""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""")

        print("you won")
        player_point+=1
    elif(player=="paper" and computer=="rock"):
        print("""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""")
        print("you won")
        player_point+=1
    elif(player==computer):
        print ("""
 _   _      
| | (_)     
| |_ _  ___ 
| __| |/ _ 
| |_| |  __/
 \__|_|\___|
              """)
        
        print("its draw")
       
   

   
    elif(player=="scissors"and computer=="rock"):
         print("""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""")
         print("you lose")
         computer_point+=1
    elif(player=="paper"and computer=="scissors"):
         print("""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""")
         print("you lose")
         computer_point+=1
    elif(player=="rock" and computer=="paper"):
         print("""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""")
         print("you lose")
         computer_point+=1
         
         

    if(player_point==3 or computer_point==3):
        print("match over")
        if(player_point>computer_point):
            print("you won the match")
        else:
            print("you lost the match")
        print(f"your points : {player_point} and computer point: {computer_point}")
        player_point=0
        computer_point=0
        if not input("want to play agin? (y/n):")=="y":
           
            break
