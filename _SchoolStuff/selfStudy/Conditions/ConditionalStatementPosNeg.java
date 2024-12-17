package _SchoolStuff.selfStudy.Conditions;
import java.util.Scanner;
public class ConditionalStatementPosNeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;


        System.out.print("Input a number: ");
        num = scan.nextInt();
        if (num > 0) {
            System.out.println("\n" + num + " is a Positive number.");
        } else if (num < 0) {
            System.out.println("\n" + num + " is a Negative number."); // if no else statement (0 is negative)
        } else {
            System.out.println("Number is a origin.");
        }

        System.out.println("Program terminates");

        scan.close();
    }
}