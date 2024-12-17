import java.util.Scanner;


/*UPGRADE CHALLENGE: Autocorrection system in order to lessen invalid input as an output
*/
//TODO: Learn webscraping and databases for huge amounts OF POSSIBLE TYPO WORDS (autocorrection system)
//TODO: But first  Learn  DSA to know Levenshtein distance algorithm and Trie Data Structure
public class ShapeAreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter the type of shape (rectangle, circle, or triangle)? Type x to exit: ");
            String shape = scanner.nextLine().toLowerCase();
            double area = 0.0;

            try {
                if (shape.equalsIgnoreCase("x")) {
                    System.out.println("Exiting the calculator...");
                    continueCalculation = false;
                    break;
                } 
                else if (shape.equals("rectangle")) {
                    double length = AreaCalc.getLength(scanner);
                    double width = AreaCalc.getWidth(scanner);
                    area = AreaCalc.getRectangleArea(length, width);
                } 
                else if (shape.equals("circle")) {
                    double radius = AreaCalc.getRadius(scanner);
                    area = AreaCalc.getCircleArea(radius);
                } 
                else if (shape.equals("triangle")) {
                    double base = AreaCalc.getBase(scanner);
                    double height = AreaCalc.getHeight(scanner);
                    area = AreaCalc.getTriangleArea(base, height);
                } 
                else {
                    System.out.println("Invalid input.");
                    continue;
                }
                System.out.println("Area of " + shape + " is " + area);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number");
            }
        }
    }
}