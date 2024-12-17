tuple = (1, 2, 3, 4, 5)

tuple.index(3) # 2
tuple.count(4) # 1
len(tuple) # 5

print(tuple)

#Unpacking (shortcut)

coordinates = (1, 2, 3, 4, 5)

x = coordinates[0]
y = coordinates[1]
z = coordinates[2]
    #unpacking version
x, y, z, a, b = coordinates # x = 1, y = 2, z = 3, a = 4, b = 5

print(x, y, z, a, b)