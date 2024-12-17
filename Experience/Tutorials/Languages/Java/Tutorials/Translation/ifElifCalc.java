package Java.Tutorials.Translation;

import java.util.Scanner;

public class ifElifCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println(intro());

        while (continueCalculation) {
            try {
                double[] numbers = getNumbers(scanner);
                String[] operations = getOperations(scanner, numbers.length - 1);

                double result = calculateExpression(numbers, operations);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number");
            }
        }
    }

    public static double[] getNumbers(Scanner scanner) {
        System.out.println("Enter the number of operands: ");
        int numOperands = scanner.nextInt();
        double[] numbers = new double[numOperands];

        for (int i = 0; i < numOperands; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        return numbers;
    }
    public static String intro() {
        return "Welcome to the calculator!";
    }

    public static String[] getOperations(Scanner scanner, int numOperations) {
        String[] operations = new String[numOperations];

        for (int i = 0; i < numOperations; i++) {
            System.out.println("Enter operation (input x to exit) " + (i + 1) + " (+, -, *, /): ");
            operations[i] = scanner.next();
        }
        return operations;
    }

    public static double calculateExpression(double[] numbers, String[] operations) {
        double result = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            result = calculate(result, numbers[i + 1], operations[i]);
        }
        return result;
    }

    public static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }

    public static boolean exit(String input) {
        continueCalculation = false;
        endOfTask();
        return true; 
    }

    public static String endOfTask() {
        return "Thanks for using the calculator!";
    }
}