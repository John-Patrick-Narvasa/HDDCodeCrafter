package Java.Template;

import java.util.Scanner;

interface Task {
    void execute();
}

class IntroTask implements Task {
    @Override
    public void execute() {
        System.out.println("Welcome to the Basic Calculator Program!");
    }
}

class HousekeepingTask implements Task {
    @Override
    public void execute() {
        System.out.println("Please enter two numbers and an operator (+, -, *, /).");
    }
}

class CalculatorTask implements Task {
    private double num1;
    private double num2;
    private char operator;

    public CalculatorTask(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    @Override
    public void execute() {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        System.out.println("Result: " + result);
    }
}

public class ExampleImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task[] tasks = {new IntroTask(), new HousekeepingTask()};

        while (true) {
            try {
                for (Task task : tasks) {
                    task.execute();
                }

                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(getInputs(scanner));

                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(getInputs(scanner));

                System.out.print("Enter operator (+, -, *, /): ");
                char operator = getInputs(scanner).charAt(0);

                Task calculatorTask = new CalculatorTask(num1, num2, operator);
                calculatorTask.execute();

                endOfTask();
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public static String getInputs(Scanner scanner) {
        return scanner.nextLine();
    }

    public static void endOfTask() {
        System.out.println("Do you want to perform another calculation? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Thank you for using the Basic Calculator Program. Goodbye!");
            System.exit(0);
        }
    }
}