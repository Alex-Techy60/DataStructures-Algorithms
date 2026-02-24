n = int(5)
for i in range(0,5):
    for j in range(0,n-1-i):
        print(" ", end = "")
    for j in range(0,i+1):
        print("*", end = " ")
    print()
for i in range(3,-1,-1):
    for j in range(0,n-1-i):
        print(" ", end = "")
    for j in range(0,i+1):
        print("*", end = " ")
    print()