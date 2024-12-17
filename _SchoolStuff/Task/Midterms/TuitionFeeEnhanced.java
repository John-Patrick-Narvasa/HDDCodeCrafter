package _SchoolStuff.Task.Midterms;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

//TODO add more methods and create GUI

public class TuitionFeeEnhanced {
	public static void main(String[] args) {
        while (true) {
            //Initializing Imports
            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###,###.00");

            //Declaration of variables
            String studentName = "";
            String userInput = "";
            int units = 0;
            double price = 0.0, tuitionFee = 0.0, cashPayment = 0.0, firstPenalty = 0.0, secondPenalty = 0.0;
            boolean continueProgram = true;
            
            System.out.print("\nHello Student. Enter 'x' to exit the program, press Enter to continue program. ");
            while (continueProgram) {
                try{
                    //Program exit condition
                    userInput = scan.nextLine();
                    if (userInput.equals("x")) {
                        System.out.println("Exiting the program...");
                        continueProgram = false;
                        break;
                     }
                    
                    //Input needed data
                    System.out.print("\nEnter name of student: ");
                    studentName =scan.nextLine();
                    
                    System.out.print("\nEnter number of units enrolled: ");
                    units = scan.nextInt();
                    
                    System.out.print("\nEnter price per unit: ");
                    price = scan.nextDouble();
                    
                    //Calculation Process
                    tuitionFee = tuitionFee(units, price);
                    cashPayment = cashPayment(tuitionFee);
                    firstPenalty = firstPenalty(tuitionFee);
                    secondPenalty = secondPenalty(tuitionFee);
                    
                    //Displaying Output
                    System.out.println("\nComputed Tuition fee: " + df.format(tuitionFee) + " dollars");
                    System.out.println(studentName + ", you could avail the following payment mode: ");
                    
                    System.out.println("\nPayment Mode: ");
                    System.out.println("Cash Payment: " + df.format(cashPayment) + " dollars");
                    System.out.println("2-installment: " + df.format(firstPenalty) + " dollars");
                    System.out.println("3-installment: " + df.format(secondPenalty) + " dollars");

                    continueProgram = false;
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("An error occurred. Please try again.");
                    scan.next();
                    scan.nextLine();

                    System.out.println("\nComputed Tuition fee: " + df.format(tuitionFee) + " dollars");
                    System.out.println(studentName + ", you could avail the following payment mode: ");
        
                    System.out.println("\nPayment Mode: ");
                    System.out.println("Cash Payment: " + df.format(cashPayment) + " dollars");
                    System.out.println("2-installment: " + df.format(firstPenalty) + " dollars");
                    System.out.println("3-installment: " + df.format(secondPenalty) + " dollars");
                    
                    //re entering data
                    System.out.println("\nPlease re-enter the invalid field:");
                }
            }
            scan.close();
        }
	}
    //Calculation methods
    public static double tuitionFee(int units, double price) {
        return units * price;
    }

    public static double cashPayment(double tuitionFee) {
        return tuitionFee - tuitionFee * 0.10;
    }

    public static double firstPenalty(double tuitionFee) {
        return tuitionFee + tuitionFee * 0.05;
    }

    public static double secondPenalty(double tuitionFee) {
        return tuitionFee + tuitionFee * 0.10;
    }
}