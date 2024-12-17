import java.util.Scanner;


//Mortgage calculator
/*write a program that calculates your mortgage
 * Principal: 10000
 * Annual Interest Rate: 3.92
 * Period (Years): 30
 * Mortgage: 472.81
 * 
 * M = P * R * (1 + R)^N / ((1 + R)^N - 1)
 */
public class Hello_World  {
    public static void main(String[] args) {
        //declaring variables and constants
        final byte MonthsInYear = 12;
        final byte PERCENT = 100;

        //declaring the scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        //contain the user input
        int principal = scanner.nextInt();


        System.out.print("Enter the annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MonthsInYear;

        System.out.print("Enter the number of years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MonthsInYear;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + mortgage);
        


    }
}
