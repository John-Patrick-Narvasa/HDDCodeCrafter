while True:
    shape = input('Enter the type of shape (rectangle, circle or triangle? type x to exit)')
        
    
    if shape == 'rectangle':
        
        input_length = input('Enter the length of the rectangle')
        input_width = input('Enter the width of the rectangle')
                
        def calculate_rectangle_area(length,width):
            area_r = length * width
            return area_r
            
        length = int(input_length)
        width = int(input_width)  
        areaof_r = calculate_rectangle_area(length,width)
        print('The area of the rectangle is:',areaof_r)
    
        
    if shape == 'circle':
        input_radius = input('Enter the radius of the circle')
        
        def calculate_circle_area(radius):
            area_c = 3.14159 * (radius**2)
            return area_c
        
        radius = int(input_radius)
        areaof_c = calculate_circle_area(radius)
        print('The area of the circle is:', areaof_c)

    if shape == 'triangle':
        input_base = input('Enter the base of the triangle')
        input_height = input('Enter the height of the triangle')

        def calculate_triangle_area(base,height):
            area_t = (base*height)*0.5
            return area_t
        
        base = int(input_base)
        height =int(input_height)
        areaof_t = calculate_triangle_area(base,height)
        print('The area of the triangle is:',areaof_t)

    if shape == 'x':
        break
        
