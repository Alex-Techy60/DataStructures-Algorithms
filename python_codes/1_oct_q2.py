list1 = ["Alex", "Sugyan", "Suggu", "Finn", "Alex", "Alex", "Suggu"]
s = set()
for i in list1:
    s.add(i)
list2 = []
for i in s:
    list2.append(i)
list2.sort()
print(list2)

