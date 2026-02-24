class Students:
    college_name = "IIIT Dharwad"
    name = "Anonymous"
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

s1 = Students("Alex", 98)
print(s1.name, s1.marks)
s2 = Students("Suggu", 97)
print(s2.name, s2.marks)
s3 = Students("Sugyan", 96)
print(s3.name, s3.marks)