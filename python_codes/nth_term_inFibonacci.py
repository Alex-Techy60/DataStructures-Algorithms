def fibonacci(n):
    if(n==1):
        return 0
    if(n==2):
        return 1
    term = fibonacci(n-1)+fibonacci(n-2)
    return term
n = int(input("Enter\n"))
print(fibonacci(n))