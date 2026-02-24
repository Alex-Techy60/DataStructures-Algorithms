r1 = int(input("Enter the number of rows of the first matrix :  "))
c1 = int(input("Enter the number of columns of the first matrix :  "))
matrix_1 = []
for i in range(0,r1):
    l = []
    for j in range(0,c1):
        l.append(int(input(f"Enter the element at {i} , {j} position :  ")))
    matrix_1.append(l)
r2 = int(input("Enter the number of rows of the second matrix :  "))
c2 = int(input("Enter the number of columns of the second matrix :  "))
matrix_2 = []
for i in range(0,r2):
    l = []
    for j in range(0,c2):
        l.append(int(input(f"Enter the element at {i} , {j} position :  ")))
    matrix_2.append(l)
product = []
