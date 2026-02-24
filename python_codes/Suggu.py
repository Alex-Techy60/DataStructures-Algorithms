set_A = {9,10,20,60,75,95,100}
set_B = {5,11,15,20,75,95,99}
for i in set_A:
    if i in set_B:
        print(f"{i}, is common")
        for i in set_A:
    if i not in set_B:
        print(f"{i}, is Unique to set_A")
for i in set_B:
    if i not in set_A:
        print(f"{i}, is Unique to set_B")