common_modules = {"thermodynamics", "mechanics", "solids"}
physics_students = {}
chemistry_students = {}
s = {"Alex", "Suggu", "Sugyan", "Finn"}
physics_students["Alex"] = ["mechanics", "electrostats", "modern physics", "optics"]
physics_students["Suggu"] = ["magnetism", "electrostats", "modern physics", "optics"]
chemistry_students["Sugyan"] = ["mole concept", "thermodynamics", "solids", "organic"]
chemistry_students["Finn"] = ["inorganic", "thermodynamics", "solids", "organic"]
common_students = []
for i in common_modules:
    for a in s:
        if a in physics_students.keys():
            if i in physics_students[a]:
                common_students.append(a)
                break
        elif a in chemistry_students.keys():
            if i in chemistry_students[a]:
                common_students.append(a)
                break
common_students.sort()
print(common_students)