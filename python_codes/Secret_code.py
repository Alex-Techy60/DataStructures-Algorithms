import random
import string
alphabet_set = set(string.ascii_lowercase)
command = input("Enter whether you wanna code or decode?\n")
if(command=="code"):
    word = input("Alright, enter the word you wanna code\n")
    coded_word = ""
    if(len(word)<3):
        coded_word = word[1]+word[0]
    if(len(word)>=3):
        for i in range(3):
            coded_word += random.choice(list(alphabet_set))
        coded_word += word[1:]+word[0]
        for i in range(3):
            coded_word += random.choice(list(alphabet_set))
    print(coded_word)
if(command=="decode"):
    word = input("Alright, enter the word you wanna decode\n")
    if(len(word)<3):
        decoded_word = word[1]+word[0]
    else:
        decoded_word = word[-4]+word[3:-4]
    print(decoded_word)