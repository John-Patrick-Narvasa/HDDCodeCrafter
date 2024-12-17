def calling_someone(name, age):
    print(f'Hello, {name.capitalize()}! You are currently {age} years old.')

name = input("Enter your name: ")

if not name.strip():
    print("Name cannot be empty.")

else:
    try:
        age = int(input("Enter your age: "))
        if age <= 0:
            print("Invalid input, enter positive number...")
        else:
            age_after_five_years = age + 5
            calling_someone(name, age)
            print(f"In 5 years, you will be {age_after_five_years} years old.")
    except ValueError:
        print("Invalid input, please enter a number")

    #elif name != str:
    #print("invalid input, enter proper name.")
    



    