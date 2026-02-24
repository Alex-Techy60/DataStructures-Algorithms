# r = int(input("Enter the number of rows :  "))
# c = int(input("Enter the numbers of columns :  "))
# matrix = []
# for i in range(0,r):
#     a = []
#     for j in range(0,c):
#         a.append(int(input("Enter the value :  ")))
#     matrix.append(a)
# print("The given matrix is :  ")
# for i in range(0,r):
#     for j in range(0,c):
#         print(matrix[i][j], end=" ")
#     print()
# print("It's transpose is :  ")
# for i in range(0,r):
#     for j in range(0,c):
#         print(matrix[j][i], end=" ")
#     print()
# r = int(input("Enter the number of rows of first matrix :  "))
# c = int(input("Enter the numbers of columns of second matrix :  "))
# matrix1 = []
# for i in range(0,r):
#     a = []
#     for j in range(0,c):
#         a.append(int(input("Enter the values in first matrix :  ")))
#     matrix1.append(a)
# matrix2 = []
# for i in range(0,r):
#     a = []
#     for j in range(0,c):
#         a.append(int(input("Enter the values in second matrix :  ")))
#     matrix2.append(a)
# print("The first matrix is :  ")
# for i in range(0,r):
#     for j in range(0,c):
#         print(matrix1[i][j], end=" ")
#     print()
# print("The second matrix is :  ")
# for i in range(0,r):
#     for j in range(0,c):
#         print(matrix2[i][j], end=" ")
#     print()
# matrixsum = []
# for i in range(0,r):
#     a = []
#     for j in range(0,c):
#         a.append(matrix1[i][j] + matrix2[i][j])
#     matrixsum.append(a)
# print("Their sum is :  ")
# for i in range(0,r):
#     for j in range(0,c):
#         print(matrixsum[i][j], end=" ")
#     print()


























# str = input("Enter your sentence :    ")
# l1 = str.split(" ")
# l2 = []
# for i in l1:
#     for j in range(0,len(i)):
#         if(i[j]!=i[len(i)-1-j]): 
#             break
#     else:
#         l2.append(i)
# max = 1
# index = -1
# for i in l2:
#     if(len(i)>max):
#         max = len(i)
#     index += 1
# print(f"The longest word is {l2[index]} and it's length is {max}")
























# '(', ')', '{', '}', '[' and ']'
# str = input("Enter your brakets :  ")
# l1 = []
# for i in range(0,len(str)):
#     l1.append(str[i])
# print(l1)
# tup = ('(', '{', '[', ']', '}', ')')
# for i in l1:
#     idx = tup.index(i) #1
#     if(tup[len(tup)-1-idx] in l1):
#         l1.remove(i)
#         l1.remove(tup[len(tup)-1-idx])
#     else:
#         print("false")
#         break
# else :
#     print("True")























# l1 = [1,4,2,6,4,5]
# largest = 0
# for i in range(0,len(l1)):
#     if(l1[largest]<l1[i]):
#         largest = i
# print(l1[largest])
# l1 = [2,9,2,6,4,0]
# for i in range(len(l1)):
#     for j in range(len(l1)):
#         if(l1[i]==l1[j]):
#             continue
#         elif(l1[i]<l1[j]):
#             break
#     else:
#         print(l1[i])
#         break












































# def factorial(n):
#     if (n==1 or n==0):
#         return (1)
#     return n*factorial(n-1)


# print(factorial(3))























# def fibonacci(n):
#     if(n==1):
#         return 0
#     if(n==2):
#         return 1
#     term = fibonacci(n-1)+fibonacci(n-2)
#     return term
# n = int(input("Enter\n"))
# print(fibonacci(n))





















# import keyword
# print(keyword.kwlist)  # This will print all Python keywords


















# user_input = input("Enter the expression you wanna evaluate\n")
# evaluation = eval(user_input)
# print(evaluation)















































# n = int(input())
# a,b = 0,1
# for i in range(0,n,2):
#     print(a, b)
#     a = a+b
#     b = a+b





























# import time
# name = input("Enter your name\n")
# currTime = time.strftime('%H:%M:%S')
# print(currTime)
# if(12>int(time.strftime('%H'))>4):
#     print(f"Good morning, {name}")
# elif(12<=int(time.strftime('%H'))<17):
#     print("Good Afternoon, {name}")
# elif(17<=int(time.strftime("%H"))<22):
#     print(f"Good Evening, {name}")
# else:
#     print(f"Good night, {name}")























# a = input("Enter a number :  ")
# try:
#     print(int(a)**2)
# except ValueError:
#     print("Value error occurred")
# finally:
#     print("This program is completed")
# n = int(input("Enter a number between 50 to 70"))
# if(n<50 or n>70):
#     raise ValueError("the value enter isn't in the range")






























# with open("harry.txt", 'r') as f:
#     lines = f.readlines()  
#     for line in lines:
#         print(line.strip())  


























# class Student:
#     name = "Unspecified"
#     def __init__(self, name, age, occupation):
#         self.name = name
#         self.age = age
#         self.occupation = occupation
#     def intro(self):
#         print(f"{self.name} is {self.age} years old {self.occupation}")
# a1 = Student("Alex", 18, "Software Developer")
# a1.intro()
# a2 = Student("Emma", 20, "CyberSecurity Expert")
# a2.intro()
# a3 = Student("Lisa", 21, "Full Stack developer")
# a3.intro()


























# def check_age(age):
#     if age < 18:
#         raise ValueError("Age must be 18 or older.")
#     return "Age is valid!"

# try:
#     print(check_age(16))
# except ValueError as e:
#     print(e)































# a = [1,2,3]
# b = {1,2,3}
# c = (1,2,3)
# d = {"a":1, "b":2, "c":3}
# print(type(a))
# print(type(b))
# print(type(c))
# print(type(d))
# print(5|2)
# print("aaaaabcd".strip("a"))




















