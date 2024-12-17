# weight conversion

# headings
# input w/ variables

# conditions
    #if kg
        # kg to lbs calculation
    #if lbs
        # lbs to kg calculation

# functions
    # kg to lbs formula
    # lbs to kg formula

# output


def kg_to_lbs(kg):
    return kg * 2.205

def lbs_to_kg(lbs):
    return lbs / 2.205

print("Weight Conversion")

user_weight = int(input("Enter your weight: "))

weight_unit = input("Enter your weight unit (kg or lbs): ")

if weight_unit.lower == "kg":
    print("You are", kg_to_lbs(user_weight), "pounds")
elif weight_unit.lower == "lbs":
    print("You are", lbs_to_kg(user_weight), "kilograms")
else:
    print("Invalid unit")
