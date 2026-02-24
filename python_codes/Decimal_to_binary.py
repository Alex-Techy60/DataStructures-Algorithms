n = int(input("Enter a number :  "))
s = int(0)
count = int(0)
while n>0:
    a = n%2
    s = s*10+a
    if a==0 and s==0:
        count = count+1
    n = int(n/2)

b = 0
while s>0:
    a = int(s%10)
    b = b*10+a
    s = int(s / 10)
for i in range(0,count):
    b = b*10
    
print(b)