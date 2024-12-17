while True:
    num_input = input('Input a number if it is positive or negative.(Type x to exit the program)')
    
    if num_input == 'x':
        print('exiting the program...')
        break
    # use this keyword if errors been found
    try:
        num = int(num_input)
            
        if num > 0:
            print('The number is positive.')
        elif num < 0:
            print('The number is negative.')
        elif num == 0:
            print('The number is zero.')
    except ValueError:
        print('Invalid input. Please enter a number.')
        