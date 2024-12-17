package _SchoolStuff.Task.Midterms;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TuitionFee {
	public static void main(String[] args) {

        //Initializing Imports
		Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        //Initializing Data
        String studentName = "";
        int units = 0;
        double price = 0.0, tuitionFee = 0.0, cashPayment = 0.0, firstPenalty = 0.0, secondPenalty = 0.0;
        
        //Input needed data
        System.out.print("Enter name of student: ");
        studentName =scan.nextLine();

        System.out.print("Enter number of units enrolled: ");
        units = scan.nextInt();

        System.out.print("Enter price per unit: ");
        price = scan.nextDouble();
        
        //Calculation Process
        tuitionFee = units * price;

        cashPayment = tuitionFee - tuitionFee * 0.10;
        firstPenalty = tuitionFee + tuitionFee * 0.05;
        secondPenalty = tuitionFee + tuitionFee * 0.10;
        
        //Displaying Output
        System.out.println("\nComputed Tuition fee: " + df.format(tuitionFee) + " dollars");
        System.out.println(studentName + ", you could avail the following payment mode: ");

        System.out.println("\nPayment Mode: ");
        System.out.println("Cash Payment: " + df.format(cashPayment) + " dollars");
        System.out.println("2-installment: " + df.format(firstPenalty) + " dollars");
        System.out.println("3-installment: " + df.format(secondPenalty) + " dollars");

        scan.close();
	}
}