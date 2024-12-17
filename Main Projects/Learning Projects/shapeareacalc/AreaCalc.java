package shapeareacalc;

import java.util.Scanner;

public class AreaCalc {
    Scanner scanner = new Scanner(System.in);
     // Area of Rectangle calculator method
     public static double getRectangleArea(double length, double width) {
        return length * width;
    }
        // Inputting of dimensions of the Rectangle
        public static double getLength(Scanner scanner) {
            System.out.println("Enter length: ");
            return scanner.nextDouble();
        }

        public static double getWidth(Scanner scanner) {
            System.out.println("Enter width: ");
            return scanner.nextDouble();
        }

    // Area of Triangle Calculator Method
    public static double getTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
        // Inputting of dimensions of the Triangle
        public static double getBase(Scanner scanner) {
            System.out.println("Enter base: ");
            return scanner.nextDouble();
        }

        public static double getHeight(Scanner scanner) {
            System.out.println("Enter height: ");
            return scanner.nextDouble();
        }
    // Area if Circle Calculator Method
    public static double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
        // Inputting of dimensions of the Circle
        public static double getRadius(Scanner scanner) {
            System.out.println("Enter radius: ");
            return scanner.nextDouble();
        }
    
}
