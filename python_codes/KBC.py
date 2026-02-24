import random
congrating = {"Yay!", "Congratulations", "You did it", "Correct", "Yahoo!", "Wohoo", "Go on"}
questions = ["Who played the role of Hermione Granger in the Harry Potter film series?\n (a) Katherine Langford\n (b) Emilia Clarke\n (c) Emma Watson\n (d) Mia Khalifa\n", "Which footballer holds the record for most goals and assists in a calender year?\n (a) Anthony\n (b) Cristiano Ronaldo\n (c) Lionel Messi\n (d) Robert Lewandowski\n", "The only country to hold both 20 overs world cup and 50 overs world cup TOGETHER\n (a) Australia\n (b) England\n (c) India\n (d) South Africa\n", "In the Marvel Cinematic Universe, the role of 'Captain America', was played by whom?\n (a) Chris Evans\n (b) Robert Downey Jr\n (c) Elizabeth Olsen\n (d) Chris Hemsworth\n", "Our glorious victory in kargil war came on which date?\n (a) 1 January, 1999\n (b) 26 January, 1998\n (c) 30 January, 2000\n (d) 26 July, 1999\n", "According to Greek Mythology, who is considered as the 'God of Sea'?\n (a) Zeus\n (b) Hades\n (c) Poseidon\n (d) Hercules", "In the famous movie series 'The Pirates of the Carribean', who is the lead character, played by Johnny Deep?\n (a) Will Turner\n (b) Captain Jack Sparrow\n (c) Hctor Barbossa\n (d) Elizabeth Swann\n", "Which country comes second in terms of winning most number of FIFA world cups?\n (a) Brazil\n (b) England\n (c) Germany\n (d) Argentina\n", "Who is the founder of the company 'Alibaba'?\n (a) Daniel Zhang Yong\n (b) Ma Huateng\n (c) Eric S Yuan\n (d) Jack Ma\n", "According to Norse Mythology, during Ragnarok, Who killed all father Odin?\n (a) Fenrir\n (b) Hela\n (c) Jomungandr (world serpent)\n (d) Surtur\n", "Which country surrendered in front of Hitler's Germany in World War II?\n (a) Soviet Union (Russia)\n (b) Great Britain\n (c) France\n (d) United States of America\n", "The only country to win both Cricket and Football world cup?\n (a) England\n (b) New Zealand\n (c) Australia\n (d) India\n", "In the famous movie series Marvel Cinematic Universe, where do Thor, Loki, Odin and other gods live, (you can also take reference through norse mythology)?\n (a) Midgard\n (b) Jotunheim\n (c) Asgard\n (d) Hel", "Name the Famous battle, in which Napoleon Bonaparte lost his final battle, ending 23 years of continous warfare between Napoleon's France and other power of Europe like British, German, Dutch, etc.\n (a) the battle of Waterloo\n (b) The Battle of britain day\n (c) World War I\n (d) Battle of Agincourt\n", "The First Olympics games were held in which city?\n (a) London, England\n (b) Ney York, USA\n (c) Melbourne, Australia\n (d) Athens, Greece\n", "According to Mahabharata, Who was the only Kaurav to stand against the harsh unclothing of Draupadi?\n (a) Yuyutsu\n (b) Vikarna\n (c) Karna\n (d) Duhsashan\n", "Who was the prime minister of britain when they won the famous Battle of the Britain Day against Nazis (Hitler's Germany)\n (a) Clement Attlee\n (b) Winston Churchill\n (c) Neville Chamberlain\n (d) Harold Macmillan"]
dict = {questions[0]:"c", questions[1]:"c", questions[2]:"b", questions[3]:"a", questions[4]:"d", questions[5]:"c", questions[6]:"b", questions[7]:"c", questions[8]:"d", questions[9]:"a", questions[10]:"c", questions[11]:"a", questions[12]:"c", questions[13]:"a", questions[14]:"d", questions[15]:"b", questions[16]:"b"}
amount = [[1000,2000,3000,5000,10000],[20000,40000,80000,160000,320000],[640000,1250000,2500000,5000000,10000000],[70000000]]
lifelines = ["Call your friend", "Ask the expert", "50:50", "Flip the question"]
options = ["a","b","c","d"]
w = 0
i = 0
j = 0
ans = True
while ans:
    print(questions[i])
    print("Enter your answer (kindly, just enter a,b,c or d, enter 'l' for accessing lifelines, or write quit if you wanna quit)\n")
    user_input = input()
    options.remove(dict[questions[i]])
    if(user_input == dict[questions[i]]):
        print(f"{random.choice(list(congrating))}, that's the correct answer\n")
        print(f"You have won {amount[w][j]}, till now")
        options.append(dict[questions[i]])
        i += 1
        j += 1
        if(j==4):
            j = 0
            w += 1
        if(w==3 and j==1):
            j = 0
            ans = False
        print("The next question on your computer screen is\n")
    elif(user_input == "l"):
        print(f"Which lifeline you wanna access, you currently have {len(lifelines)} lifelines")
        if("Call your friend" in lifelines):
            print("Enter 1 for 'call your friend'")
        if("Ask the expert" in lifelines):
            print("Enter 2 for 'Ask the expert'")
        if("50:50" in lifelines):
            print("Enter 3 for '50:50'")
        if("Flip the question" in lifelines):
            print("4 for 'Filp The question'")
        user_input = int(input())
        options.append(dict[questions[i]])
        if(user_input == 1 and "Call your friend" in lifelines):
            lifelines.remove("Call your friend")
            print("You can consult any of your friend for this question only")
        elif(user_input == 2 and "Ask the expert" in lifelines):
            lifelines.remove("Ask the expert")
            print("You can ask an expert, currently, we have three experts available to assist you")
            print("Expert A : Alex\nExpert B : Suggu\nExpert C :\Mr. Sugyan Singh")
            user_input = input(("Enter a for talking expert A, b for expert B and c for Expert C"))
            if(user_input=="a"):
                print("you can consult Alex for this question")
            elif(user_input=="b"):
                print("you can consult Suggu for this question")
            else:
                print("Mr. Sugyan Singh is here to share his wisdom to help you solve this problem")
        elif(user_input == 3 and "50:50" in lifelines):
            lifelines.remove("50:50")
            print("Okay, so two wrong options will get eliminated")
            s = {"a","b","c","d"}
            s.remove(dict[questions[i]])
            print(f"The options {s.pop()} and {s.pop()} is wrong")
        elif(user_input == 4 and "Flip the question" in lifelines):
            lifelines.remove("Flip the question")
            print("Flipping the question")
            i += 1
        else:
            print("I'm sorry, either the input is invalid, or you have already used your that lifeline, kindly revisit the question")
    elif(user_input in options):
        print(f"Fuck mera bhai! It's hard to say you that you lost, the correct answer was {dict[questions[i]]}")
        j = 0
        ans = False
    elif(user_input == "quit"):
        print("Okay, you've quitted successfully, bujdil aadmi")
        ans = False
    else:
        print("Sorry, wrong input, kindly, reread the question, (ache se padh question, bhosdike)")
        print("the question was\n")
print(f"Your winning is {amount[w][j]}")