class counts():
    def counting(self, word):
        u, l, s, v, c = 0, 0, 0, 0, 0
        for char in word:
            if(char.isupper()):
                u += 1
            elif(char.islower()):
                l += 1
            if(char == " "):
                s += 1
            elif(char in {"a","e","i","o","u"}):
                v += 1
            else:
                c += 1
        print(f"The number of uppercase is, {u}")
        print(f"The number of lowercase is, {l}")
        print(f"The number of spaces is, {s}")
        print(f"The number of vowels is, {v}")
        print(f"The number of consonents is, {c}")
a = counts()
a.counting(input("Enter your word\n"))