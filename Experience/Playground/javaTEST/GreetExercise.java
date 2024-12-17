import java.util.InputMismatchException;
import java.util.Scanner;

public class GreetExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty");
        } else {
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                if (age <= 0) {
                    System.out.println("Invalid input, enter positive number...");
                } else {
                    int ageAfterFiveYears = age + 5;
                    callingSomeone(name, age);
                    System.out.println("In 5 years, you will be " + ageAfterFiveYears + " years old.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number");
                scanner.next(); // Consume invalid input
            }
        }
    }

    public static void callingSomeone(String name, int age) {
        System.out.println("Hello, " + name.substring(0, 1).toUpperCase() + name.substring(1) + "! You are currently " + age + " years old.");
    }
}