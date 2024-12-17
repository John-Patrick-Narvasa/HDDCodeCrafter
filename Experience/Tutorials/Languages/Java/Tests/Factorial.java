package Java.Tests;

// Online IDE - Code Editor, Compiler, Interpreter

import java.util.Scanner;
public class Factorial  {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean continueProgram = true;
        
        System.out.println(intro());
        while (continueProgram) {
            
            try {
                
                num = getNum(scan);
                
                int result = factorial(num);
                
                System.out.println("The factorial of " + num + " is "+ result);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input, please input a number");
            }
        }
        
        
   }
   public static String intro() {
       System.out.println("Enter a non-negative integer. Input 0 to exit the program");
       return "";
   }
   
   public static int getNum(Scanner scan) {
       return scan.nextInt();
   }
   
   public static int factorial(int num) {
    if (num > 0) {
            for (int i = 1; i < num;) {
                return num * factorial(num - 1);
            }
        } else if (num == 0) {
            System.out.println("Exiting the program...");
            return 0;
        } else {
            System.out.println("Invalid input.");
            return 1; // or throw an exception
        }
        return 1; // or throw an exception
    }
}
