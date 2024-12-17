package Java.Tutorials.Translation;

import java.util.Scanner;

public class TestNumberPosOrNeg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        boolean continueCalc = true;

        while (continueCalc) {
            try { 
        
                System.out.println("Input a number if it is positive or negative.(Type x to exit)");
        
                num = scanner.nextInt();
                
                if (num > 0) {
                    System.out.println("The number is positive");
                }
        
                else if (num < 0) {
                    System.out.println("The number is negative");
                }
        
                else if (num == 0) {
                    System.out.println("The number is zero");
                }
                else if (num == (char) 'x') {
                    System.out.println("Exiting the program...");
                    continueCalc = false;
                    break;
                }
                else {
                    System.out.println("Invalid input. ");
                }
        
                    
            }    
             catch (NumberFormatException e) {
                 System.out.println("Invalid input. Please enter a number.");
                }
        }

        

        
    }
}

/*
 *    
 */