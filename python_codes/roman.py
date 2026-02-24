class roman:
    def intToRoman(self,n, a, str):
        if(n//a==0):
            pass
        elif(1<=n//a<=3):
            for i in range(0,n//a):
                str += dict[a]
        elif(n//a==4):
            str += dict[a]+dict[5*a]
        elif(5<=n//a<=8):
            str += dict[5*a]
            for i in range(5,n//a):
                str += dict[a]
        elif(n//a==9):
            str += dict[a]+dict[a*10]
        if(a==1):
            print(str)
            return
        self.intToRoman(n%a, a//10, str)

dict = {1:"I", 5:"V", 10:"X", 50:"L", 100:"C", 500:"D", 1000:"M"}
n = int(input("Enter a number\n"))
a=roman()
a.intToRoman(n,1000,"")
