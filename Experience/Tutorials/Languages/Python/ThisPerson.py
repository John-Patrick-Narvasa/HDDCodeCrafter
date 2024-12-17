class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def get_info(self):
        return f"Name: {self.name}, Age: {self.age}"

person = Person("John", 30)
print(person.get_info())