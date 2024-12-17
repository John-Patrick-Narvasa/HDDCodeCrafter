numbers = [1, 2, 3, 4, 5]



print(numbers.sort()) # [1, 2, 3, 4, 5]

print(numbers.reverse()) # [5, 4, 3, 2, 1]

print(numbers.copy()) # [1, 2, 3, 4, 5]

print(numbers.append(6)) # [1, 2, 3, 4, 5, 6]

print(numbers.insert(0,0)) # [0, 1, 2, 3, 4, 5, 6]

print(numbers.append(6)) # [0, 1, 2, 3, 4, 5, 6, 6]

print(numbers.extend(7, 8, 9)) # [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(numbers.remove(2)) # [1, 3, 4, 5, 6, 7, 8, 9]

print(numbers.pop()) # [1, 2, 3, 4, 5, 6, 7, 8]

print(numbers.clear()) # []