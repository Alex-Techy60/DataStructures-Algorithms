def fibonacci(n, a, b):
    if(n==0):
        return
    if(n==1):
        print(a)
        return
    print(a)
    print(b)
    a = a + b
    b = a + b 
    fibonacci(n-2, a, b)
n = int(input("Enter the number of terms\n"))
a = int(input("Enter the first term\n"))
b = int(input("Enter the second term\n"))
print(f"The fibonacci series of {n} terms, starting with {a} and {b} is :")
fibonacci(n, a, b)