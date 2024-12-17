import math

class Circle:
    def __init__(self, radius):
        self.radius = radius
    
    def calculate_area(self):
        return math.pi * self.radius**2
    
    def calculate_circumference(self):
        return 2 * math.pi * self.radius
    
    def display(self):
        print("Circle")
        print("Radius:", self.radius)

        # Generate ASCII representation of the circle
        for y in range(-self.radius, self.radius+1):
            for x in range(-self.radius, self.radius+1):
                if math.sqrt(x**2 + y**2) <= self.radius:
                    print("*", end="")
                else:
                    print(" ", end="")
            print()
        
        print("Area:", self.calculate_area())
        print("Circumference:", self.calculate_circumference())

# Creating a Circle object
circle = Circle(5)
circle.display()