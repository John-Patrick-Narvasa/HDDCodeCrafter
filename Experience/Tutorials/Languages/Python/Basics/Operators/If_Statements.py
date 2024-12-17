


temperature = int(input("Enter temperature: "))
unit = int(input("Enter unit: "))

if unit == "Celsius":
    if temperature > 20:
        print("Stay hydrated")
    elif temperature < 10:
        print("Wear a jacket")
    else:
        print("It is perfect")

if unit == "Fahrenheit":
    if temperature > 68:
        print("Stay hydrated")
    elif temperature < 48:
        print("Wear a jacket")
    else:
        print("It is perfect")