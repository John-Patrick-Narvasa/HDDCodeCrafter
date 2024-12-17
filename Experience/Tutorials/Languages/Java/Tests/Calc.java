
import java.util.Scanner;
import java.io.*;

public class Calc {
    public static void main(String[] args) {
        //declare "Scanner" as "scanner"
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;
        
    try {
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of" + num1 + "and" + num2 + "is" + sum);

    } catch(Exception e) {
        System.out.println("Invalid input");
    }
    }
    
}
