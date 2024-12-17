package Java.Tests;

import java.util.Scanner;

public class calc2 {
    public static void main(String[] args) { 
        //declaring all main variables; (main process)
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;
        boolean continueCalculation = true;
        
        //making a loop; (depends)
        while (continueCalculation) {
            //making a try-catch to handle errors (if input isn't an int datatype);
            try {
                //starting the user input dialogue;
                System.out.print("Enter the first number ('x' to exit): ");

                //using the scanner. method for establishing the intput command;
                String input1 = scanner.nextLine();

                //making a condition to exit the program;
                if (input1.equalsIgnoreCase("x")) {
                    System.out.println("Exiting the calculator...");
                    continueCalculation = false;
                    break;
                }
                //Variables based on inputted numbers;
                //parseInt because of the need to convert the previous datatype (from string to int);
                //it means DECLARATION IS EVERYTHING in JAVA language (including th transition of thingd)
                num1 = Integer.parseInt(input1);

                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();
                scanner.nextLine(); // Clear the input buffer;
                
                //main magic;
                sum = num1 + num2;
                System.out.println("The sum is: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }
    }
}
