import math
print("What operation do you want?")
operator = input("Enter either +, -, *, / or, **: ")

while True:
         
    n1 = float(input("Enter first number: "))
    n2 = float(input("Enter second number: "))

    if operator == '+':
      print(n1, operator, n2, "=", n1+n2)

    elif operator == '-':
      print(n1, operator, n2, "=", n1-n2)

    elif operator == '*':
      print(n1, operator, n2, "=", n1*n2)

    elif operator == '/':
      print(n1, operator, n2, "=", n1/n2)

    elif operator == '**':
        print(n1, operator, n2, "=", n1**n2)
    
    else:
      print("Invalid operator")