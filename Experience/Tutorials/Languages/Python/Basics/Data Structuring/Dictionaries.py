

customer = {
    "name": "John Smith",
    "age": 30,
    "is_verified": True
}

print(customer.get("name"))
print(customer.get("birthdate", "Jan 1 1980"))

customer["name"] = "Jack Smith"

print(customer["name"])

capitals_of_countries = {
    "France": "Paris",
    "Germany": "Berlin",
    "Nigeria": "Abuja"
}