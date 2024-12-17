def calculate_total(price, tax_rate):
    tax_amount = price * (tax_rate/100)
    return price + tax_amount

while True:
    price = input("Enter price: ")
    tax_rate = input("Enter tax rate: ")
    
    try:
        price = float(price)
        tax_rate = float(tax_rate)
        
        if price <= 0 or tax_rate <= 0:
            print("Invalid input, input positive integer")
        else:
            result = calculate_total(price, tax_rate)
            print(f'The result is: {result}')
            break
    except ValueError:
        print("Invalid input, please input a number...")