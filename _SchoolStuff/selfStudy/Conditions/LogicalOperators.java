package _SchoolStuff.selfStudy.Conditions;
import java.util.Scanner;
/*
 * && = and (* - multiplication)
 * 1 * 1 = 
 * 1 * 0 = 
 * 1 * 0 = 
 * 0 * 0 = 
 * || = or (+ - addition)
 * 1 + 1 = 
 * 1 + 0 = 
 * 1 + 0 = 
 * 0 + 0 = 
 * ! = not
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int testScore1;
        int testScore2;
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter your first test score: ");
        testScore1 = scan.nextInt();

        System.out.println("Enter your second test score: ");
        testScore2 = scan.nextInt();
    
        if ((testScore1 > 90) && (testScore2 > 90)) {
            System.out.println("You are now promoted into a manager");
        }
        else if ((testScore1 > 90) || (testScore2 > 90)) {
            System.out.println("You are now promoted into a supervisor");
        }
        else if (!(testScore1 > 90) && !(testScore2 > 90)) {
            System.out.println("You are still a worker");
            System.out.println("No promotions for you :(");
        }
        System.out.println("Program Terminates");

        scan.close();
    }
}
