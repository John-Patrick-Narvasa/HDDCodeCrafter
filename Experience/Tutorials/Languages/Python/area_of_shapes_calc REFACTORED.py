import nltk
# def autoCorrector(word):
    # return nltk.edit_distance(word, word[1:]) in (0, 1) and ("do you mean" + word + " instead?")

def calculate_area(shape, measurements):
    if shape == 'rectangle':
        length = measurements['length']
        width = measurements['width']
        return length * width
    elif shape == 'circle':
        radius = measurements['radius']
        return 3.14159 * radius**2
    elif shape == 'triangle':
        base = measurements['base']
        height = measurements['height']
        return (base * height) / 2

while True:
    shape = input('Enter the type of shape (rectangle, circle, or triangle? Type x to exit): ')
    
    if shape == 'x':
        break
    
    measurements = {}
    
    if shape == 'rectangle':
        measurements['length'] = float(input('Enter the length of the rectangle: '))
        measurements['width'] = float(input('Enter the width of the rectangle: '))
    elif shape == 'circle':
        measurements['radius'] = float(input('Enter the radius of the circle: '))
    elif shape == 'triangle':
        measurements['base'] = float(input('Enter the base of the triangle: '))
        measurements['height'] = float(input('Enter the height of the triangle: '))
    
    area = calculate_area(shape, measurements)
    print(f'The area of the {shape} is: {area}')
