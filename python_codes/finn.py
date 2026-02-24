stud = {}
stud["Alex"]=["Enlish", "App dev", "Web Dev", "DSA", "Data Science and AI"]
stud["Suggu"]=["English", "AI and Machine Learning", "Web dev", "Game dev"]
stud["Sugyan"]=["App dev", "Game dev", "AI and Machine Learning", "CyberSecurity"]
stud["Finn"]=["English", "Game dev", "Web dev", "DSA", "CyberSecurity"]
common_courses = {"English", "Web dev", "DSA"}
a = int(0)
print(stud.values())
for i in stud.keys():
    for j in common_courses:
        if j in stud[i]:
            a = a+1
        else :
            print(f"{i} - Incomplete : missing subject = {j}")
            
    if(a==3):
        print(f"{i} - Complete")
    a=0