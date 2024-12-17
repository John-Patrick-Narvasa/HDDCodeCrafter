import random

def roll_dice():
    return random.randint(1, 6)

def main():
    print("Welcome to the Dice Rolling Game!")
    print("Press enter to roll the dice, or 'q' to quit.")

    while True:
        user_input = input()
        
        if user_input.lower() == 'q':
            break
        
        roll_result = roll_dice()
        print("You rolled a", roll_result)
    
    print("Thank you for playing!")

if __name__ == "__main__":
    main()