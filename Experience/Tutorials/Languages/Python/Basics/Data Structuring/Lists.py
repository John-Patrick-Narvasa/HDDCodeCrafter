names = ["John", "Corey", "Adam", "Steve", "Rick", "Thomas"]
print(names) # 
print(names[0]) # John
print(names[1]) # Corey

print(names[-1]) # Thomas
print(names[-2]) # Rick

# Slicing
print(names[2:]) # ['Adam', 'Steve', 'Rick', 'Thomas']
print(names[2:4]) # ['Adam', 'Steve']
print(names[:4]) # ['John', 'Corey', 'Adam', 'Steve']
# 
print(names[::2]) # ['John', 'Adam', 'Thomas']
print(names[1::2]) # ['Corey', 'Steve', 'Thomas']
print(names[::-1]) # ['Thomas', 'Rick', 'Steve', 'Adam', 'Corey', 'John']


# finding
numbers = [1, 2, 3, 4, 5]

print(max(numbers))

max = numbers[0]
for number in numbers:
    if number > max:
        max = number
print(max)

#matrix
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print(matrix[1][1]) # prints 5

for row in matrix:
    for item in row:
        print(item) # prints 1, 2, 3, 4, 5, 6, 7, 8, 9