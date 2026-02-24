s = input("Enter a string :  ")
def perm(s, news):
    if(len(s)==0):
        print(news)
        return
    for i in range(0, len(s)):
        perm(s[0:i]+s[i+1:], news+s[i])
perm(s, "")