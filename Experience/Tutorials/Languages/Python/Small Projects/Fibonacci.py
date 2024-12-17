n1 = 0
n2 = 1
count = 0

while True:
    print(n1, end=',')
    nth = n1 + n2
    #update values
    n1 = n2
    n2 = nth
    count += 1

print()

