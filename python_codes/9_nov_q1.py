str = "New to Python or choosing between Python 2 and Python 3? Read Python 2 or Python 3."
l1 = str.split(" ")
dict = {}
s = set(l1)
l2 = list(s)
l2.sort()
print(s)
for i in l2:
    c = 0
    for j in l1:
        if(i==j):
            c += 1
            dict[i]=c
for i in dict.keys():
    print(i, ":", dict[i])
        