for i in range(2,2):
    print("2")
else:
    print("3")
n = int(input("Enter a number :  "))
list = []
for m in range(1,n+1):
    count = 0
    for i in range(1,m+1):
        if(m%i == 0):
            count = count + 1
    if(count == 2):
        list.append(m)
print(list)
print("the sum is ", sum(list))