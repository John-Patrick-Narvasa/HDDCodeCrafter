package _SchoolStuff.Study.selectionStructures.discussionSession2;

import java.util.Scanner;

public class GradingSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        double equiv;

        System.out.print("Enter grade: ");
        grade = input.nextInt();

        if ((grade <= 100) || (grade >= 90)) { //if OR operator (output = 1.0 still 
            //(runtime error - error that cannot be check by the compiler))
            equiv = 1.00;
        }
        else if ((grade <= 89) || (grade >= 80)) {
            equiv = 2.00;
        }
        else if ((grade <= 79) || (grade >= 75)) {
            equiv = 3.00;
        }
        else {
            equiv = 5.00;
        }
        System.out.println("\nEquivalent grade: " + equiv);
    }
}