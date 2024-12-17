package _SchoolStuff.selfStudy.Conditions;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        //Declare variables
        double fare = 0.0, discRate = 0.0, discount = 0.0, netFare = 0.0;
        int custCode = 0;
        String customer = "";
     

        //Accept the inputs of the program
        System.out.println("Enter fare amount: ");
        fare = input.nextDouble();

        System.out.println("Enter customer code [0=Ordinary, 1=Student, 2=Senior]: ");
        custCode = input.nextInt();

        switch (custCode) {
            case 0: 
                customer = "Ordinary";
                discRate = 0.0;
                break;
                 // if no break, it will go to next case statement (so 0 results to Student as well instead of Ordinary)
            case 1: 
                customer = "Student";
                discRate = 0.1;
                break;
            case 2: 
                customer = "Senior";
                discRate = 0.4;
                break;
            default:
                customer = "Invalid code";
                break;
        }//Switch statement escapes and goes to the next line of code 

        //Calculate the discount
        discount = fare * discRate;

        //Calculate the net fare
        netFare = fare - discount;

        //Display the results
        System.out.println("\nCustomer: " + customer);
        System.out.println("Discount: " + df.format(discount));
        System.out.println("\nNet fare: " + df.format(netFare));

        input.close();
    }
}
