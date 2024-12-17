package _SchoolStuff.Task.Midterms;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountProdCorr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        String product = "", product1 = "", product2 = "", product3 = "";
        String modePayment = "";
        double price = 0.0, price1 = 0.0, price2 = 0.0, price3 = 0.0;
        double discount1 = 0.0, interest3 = 0.0, interest6 = 0.0, interest12 = 0.0;

        double discount = 0.0, interest = 0.0;
        double discountRes = 0.0, interestRes = 0.0;
        double monthlyPayment = 0.0, total = 0.0;
        int months = 0;
        char item;

        //inputting products and prices (1,2,3)
        System.out.print("\nEnter Product 1: ");
        product1 = input.nextLine();
            System.out.print("Enter Price: ");
            price1 = input.nextDouble();
            input.nextLine();

        System.out.print("\nEnter Product 2: ");
        product2 = input.nextLine();
            System.out.print("Enter Price: ");
            price2 = input.nextDouble();
            input.nextLine();

        System.out.print("\nEnter Product 3: ");
        product3 = input.nextLine();
            System.out.print("Enter Price: ");
            price3 = input.nextDouble();
            input.nextLine();

        //inputting interests and discounts for modePayment
        System.out.print("\nInput mode payment terms: ");
        System.out.print("\n\nCash Discount: ");
            discount1 = input.nextDouble();
            System.out.print("\tYou inputted " + df.format(discount1) + "% Discount for Cash");

        System.out.print("\n\n3 Months Installment: ");
            interest3 = input.nextDouble();
            System.out.print("\tYou inputted " + df.format(interest3) + "% Interest for 3 months installment");

        System.out.print("\n\n6 Months Installment: ");
            interest6 = input.nextDouble();
            System.out.print("\tYou inputted " + df.format(interest6) + "% Interest for 6 months installment");

        System.out.print("\n\n12 Months Installment: ");
            interest12 = input.nextDouble();
            System.out.print("\tYou inputted " + df.format(interest12) + "% Interest for 12 months installment");

        //displaying main menu (products, prices)
        System.out.print("\n\nMain Menu");
        System.out.print("\n\nPress I/i: " + product1 +"\n\tPrice: $"+ "" + df.format(price1)+ " dollars");
        System.out.print("\nPress S/s: " + product2 +"\n\tPrice: $"+ "" + df.format(price2)+ " dollars");
        System.out.print("\nPress X/x: " + product3 +"\n\tPrice: $"+ "" + df.format(price3)+ " dollars");

        //logic for choosing products via (item) case
        System.out.print("\n\nEnter item: ");
        item = input.next().charAt(0);
        item = Character.toLowerCase(item);
        switch (item) {
            case 'i':  product = product1; price = price1; break;
            case 's':  product = product2; price = price2; break;
            case 'x':  product = product3; price = price3; break;
            default: System.out.println("invalid input"); break;
        }
        System.out.println("Product: \t" + product);
        System.out.println("Price: \t$" + df.format(price) + " dollars");

        //display modePayment
        System.out.print("\nPress 1: Cash \t" + df.format(discount1) + "% Discount");
        System.out.print("\nPress 2: 3 months installment \t" + df.format(interest3) + "% Interest");
        System.out.print("\nPress 3: 6 months installment \t" + df.format(interest6) + "% Interest");
        System.out.print("\nPress 4: 12 months installment \t" + df.format(interest12) + "% Interest");

        //modePayment logic
        System.out.print("\n\nEnter mode of payment: ");
        modePayment = input.next();
        switch (modePayment) {
            case "1":  discount = discount1; interest = 0.0; months = 1; break;
            case "2":  interest = interest3; months = 3; break;
            case "3":  interest = interest6; months = 6; break;
            case "4":  interest = interest12; months = 12; break;
            default: System.out.println("invalid input"); break;
        }

        //calculations
        discountRes = price * (discount / 100);
        interestRes = price * (interest / 100);
        total = price + interestRes - discountRes;
        monthlyPayment = total / months;

        //displaying final results
        System.out.println("\nMode of Payment: \t" + modePayment);
        System.out.println("Item: \t" + product);
        System.out.println("Price: \t$" + df.format(price) + " dollars");
        System.out.println("Discount: \t$" + df.format(discountRes) + " dollars");
        System.out.println("Interest: \t$" + df.format(interestRes) + " dollars");
        System.out.println("Total Amount: \t$" + df.format(total) + " dollars");
        System.out.println("Monthly Amortization: \t$" + df.format(monthlyPayment) + " dollars");

        input.close();
    }
}