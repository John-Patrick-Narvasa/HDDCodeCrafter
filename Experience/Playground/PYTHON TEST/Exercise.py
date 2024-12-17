#Certainly! Here's another exercise involving functions:
#
#Exercise: Temperature Conversion
#
#Write a program that converts temperatures between Celsius and Fahrenheit using functions. The program should prompt the user to enter the temperature and the unit of measurement (Celsius or Fahrenheit), and then convert and display the temperature in the other unit.
#
#Instructions:
#1. Define a function called `Celsius_to_fahrenheit` that takes one parameter: `Celsius`. This function should convert and return the temperature from Celsius to Fahrenheit using the formula `fahrenheit = (Celsius * 9/5) + 32`.
#2. Define a function called `fahrenheit_to_Celsius` that takes one parameter: `fahrenheit`. This function should convert and return the temperature from Fahrenheit to Celsius using the formula `Celsius = (fahrenheit - 32) * 5/9`.
#3. Prompt the user to enter the temperature and store it in a variable called `temperature`.
#4. Prompt the user to enter the unit of measurement (Celsius or Fahrenheit) and store it in a variable called `unit`.
#5. If the unit is "Celsius", call the `Celsius_to_fahrenheit` function with the provided temperature to convert it to Fahrenheit.
#6. If the unit is "Fahrenheit", call the `fahrenheit_to_Celsius` function with the provided temperature to convert it to Celsius.
#7. Display the converted temperature to the user.
#
#Example Output:
#```
#Enter the temperature: 25
#Enter the unit of measurement (Celsius or Fahrenheit): Celsius
#The temperature in Fahrenheit is: 77.0
#
#Enter the temperature: 98.6
#Enter the unit of measurement (Celsius or Fahrenheit): Fahrenheit
#The temperature in Celsius is: 37.0
#```
#
#Note: Make sure to handle any potential errors that may occur when converting user input to numeric values.
#
#Feel free to give it a try! If you need any help or have any questions, feel free to ask.


tempurature = input('Enter the temperature')
unit = input('Enter unit of measurement (Celsius or Fahrenheit?)')

if unit.lower() == 'Celsius':
    input_celsius = input('How many celsius?')

    def Celsius_to_fahrenheit(Celsius):
        c_to_f = 9/5 * Celsius + 32
        return c_to_f

    Celsius = int(input_celsius)
    c_to_f_con = Celsius_to_fahrenheit(Celsius)
    print('The tempurature in Fahrenheit is: ', c_to_f_con)

elif unit.lower() == 'Fahrenheit':
    input_fahrenheit = input('How many fahrenheit?')

    def fahrenheit_to_Celsius(fahrenheit):
        f_to_c = (fahrenheit - 32) * 5/9
        return f_to_c

    fahrenheit = int(input_fahrenheit)
    f_to_c_con = fahrenheit_to_Celsius(fahrenheit)
    print('The tempurature in Celsius is: ', f_to_c_con)

    




