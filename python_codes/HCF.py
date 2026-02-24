a = int(input("Enter first number :  "))
b = int(input("Enter second number :  "))
if(b>a):
    for i in range(a,0,-1):
        if(b%i==0 and a%i==0):
           print(f"HCF of the given numbers is :  {i}")
           break
else :
    for i in range(b,0,-1):
        if(a%i==0 and b%i==0):
           print(f"HCF of the given numbers is :  {i}")
           break