# While loop

x = -2
while x <= 5:
    print('*' * x) # initial value
    x += 1  # increment value (processing)

print("finish")

# For loop

for x in range(5, 10):
    print(x)


for x in range(5, 10, 2):
    print(x)    

prices  = [10, 20 , 30] 

# calculate total of prices use for loop
total = 0
item  = x
for x in prices:
    total += x
print(f"Total: {total}")

# Nested Loops


for x in range(4): # x = 0, 0, 0 , 1, 1, 1, 2, 2, 2, 3, 3, 3 
    for y in range(3): # y = 0, 1, 2 (3 times) (when it finishes, x increases by 1 because it is an inner loop)
        print(f'({x}, {y})')


for y in range(5):
    for x in range(4):
        print(f'({x}, {y})')



numbers = [2, 2, 2, 5, 5]
for x_count in numbers:
    output = ''
    for count in range(x_count):
        output += 'x'
    print(output)