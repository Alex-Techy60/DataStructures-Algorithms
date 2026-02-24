def sum_numbers(girl_input):
    numbers = girl_input.split('+')
    s = int(0)
    for num in numbers:
        s += int(num)
    return s
girl_input = input("Enter your text :  ")
print(f"The sum of these numbers are :  {sum_numbers(girl_input)}")