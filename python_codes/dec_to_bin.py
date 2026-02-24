def decToBin(n):
    if(n==1):
        return 1
    elif(n==0):
        return 0
    return (decToBin(n//2)*10 + n%2)
n = int(input("Enter a number :  "))
print(decToBin(n))