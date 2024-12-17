package _SchoolStuff.Task.Finals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String option = "";
        boolean continueProgram = true;
        Scanner input = new Scanner(System.in);

        while (continueProgram) {
            System.out.print("Welcome to the Pattern Printing Program. Enter x to exit: ");
            option = input.nextLine();
            try {
                if (option.toLowerCase().equals("x")) {
                    System.out.println("Exiting the program...");
                    continueProgram = false;
                }
                else {
                    
                    printPattern1();
                    System.out.println();
            
                    printPattern2();
                    System.out.println();
            
                    printPattern3();
                    System.out.println();
            
                    printPattern4();
                    System.out.println();
                }
    
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input, please input a number");
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, please input a number");
            }
        }
        input.close();
    }
    static int getRows() {
        int rows = 1;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter Size: ");
        rows = scan.nextInt();
        return rows;
    }
    static char getChar(){
        char Char;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter Character: ");
        Char = scan.next().charAt(0);
        return Char;
    }

    public static void printPattern1() {
        int rows = getRows();
        char Char  = getChar();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i+1 ; j++) {
                if (j == 1) {
                    System.out.print("");
                } 
                else {
                    System.out.print("-");
                }
            }
            System.out.print(Char);
            System.out.println();
        }
    }

    public static void printPattern2() {
        int rows = getRows();
        char Char  = getChar();

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i-1 ; j++) {
                System.out.print("-");
            }
            System.out.print(Char);
            System.out.println();
        }
    }

    public static void printPattern3() {
        int rows = getRows();
        char Char  = getChar();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i+1 ; j++) {
                if (j == 1) {
                    System.out.print("");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.print(Char);
            for (int k = rows; k > i; k--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void printPattern4() {
        int rows = getRows();
        char Char  = getChar();

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.print(Char);
            for (int k = 0; k < rows-(i-1); k++) {
                if (k == 0) {
                    System.out.print("");
                } 
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    static void printPattern5() {
        main(null);
    }
}


