str1 = input("Enter first string :  ")
l1 = len(str1)
str2 = input("Enter second string :  ")
l2 = len(str2)
if(l1>l2):
    sizes = l2
    sizel = l1
else:
    sizes = l1
    sizel = l2
hammering_distance = 0
for i in range(sizes):
    if(str1[i]!=str2[i]):
        hammering_distance += 1
if(l1!=l2):
    hammering_distance += sizel-sizes
print(hammering_distance)