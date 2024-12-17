package _SchoolStuff.Task.Midterms;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountProducts {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        String product = "", product1 = "", product2 = "", product3 = "", modePayment = "";
        double price = 0.00, price1 = 0.00, price2 = 0.00, price3 = 0.00;
        double interest = 0.00, interest3 = 0.00, interest6 = 0.00, interest12 = 0.00, interestRes = 0.00;
        double discount = 0.00, discountRes = 0.00;
        double mA = 0.00, total = 0.00;
        int months = 0;
        char item;

        System.out.print("Enter Product 1: "); //Iphone 15 Pro Max
        product1 = input.nextLine();
            System.out.print("Enter price: "); //75,000.00
            price1 = input.nextDouble();
            input.nextLine();

        System.out.print("\nEnter Product 2: "); // Samsung S23 Ultra
        product2 = input.nextLine();
            System.out.print("Enter price: "); //76,000.00
            price2 = input.nextDouble();
            input.nextLine();

        System.out.print("\nEnter Product 3: "); //RealMe X50
        product3 = input.nextLine();
            System.out.print("Enter price: "); //35,500.00
            price3 = input.nextDouble();
            input.nextLine();

        System.out.print("\nInput Mode of Payment Terms");

        System.out.print("\nCash discount: ");
            discount = input.nextDouble();
            System.out.println("\tYou input " + df.format(discount) + "% Discount for Cash");

        System.out.print("\n3 Months Installment: ");
            interest3 = input.nextDouble();
            System.out.println("\tYou input " + df.format(interest3) + "% Interest for 3 Months Installment");

        System.out.print("\n6 Months Installment: ");
            interest6 = input.nextDouble();
            System.out.println("\tYou input " + df.format(interest6) + "% Interest for 6 Months Installment");

        System.out.print("\n12 Months Installment: ");
            interest12 = input.nextDouble();
            System.out.println("\tYou input " + df.format(interest12) + "% Interest for 12 Months Installment");

        
        System.out.println("\nMain Menu");

            System.out.println("\n Press I/i: " + product1);
            System.out.println("\tPrice: " + df.format(price1) + " dollars");

            System.out.println("\n Press S/s:" + product2);
            System.out.println("\tPrice: " + df.format(price2) + " dollars");

            System.out.println("\n Press X/x: " + product3);
            System.out.println("\tPrice: " + df.format(price3) + " dollars");
            
        System.out.print("Enter Item: ");
            item = input.next().charAt(0);
            item = Character.toLowerCase(item);

        switch(item) {
            case 'i':  
                System.out.println("Product: " + product1 + "\nPrice: " + df.format(price1));
                product = product1;
                break;
            case 's':  
                System.out.println("Product: " + product2 + "\nPrice: " + df.format(price2));
                product = product2;
                break;
            case 'x':  
                System.out.println("Product: " + product3 + "\nPrice: " + df.format(price3));
                product = product3;
                break;
        }

        System.out.println("\nPress 1: Cash" + "\t" + df.format(discount) + "% Discount");
        System.out.println("Press 2: 3 Months Installment" + "\t" + df.format(interest3)+ "% Interest");
        System.out.println("Press 3: 6 Months Installment" + "\t" + df.format(interest6)+ "% Interest");
        System.out.println("Press 4: 12 Months Installment" + "\t" + df.format(interest12)+ "% Interest");

        System.out.println("\nEnter Mode of Payment: ");
        modePayment = input.nextLine();
        modePayment = modePayment.toLowerCase();
        
        switch (modePayment) {
            case "1": System.out.println("Mode of payment: \tCash"); 
                switch(item) {
                    case 'i': 
                        discountRes = price1 + price1 * discount; 
                        price = price1; 
                        break;
                    case 's': 
                        discountRes = price2 + price2 * discount; 
                        price = price2; 
                        break;
                    case 'x': 
                        discountRes = price3 + price3 * discount; 
                        price = price3; 
                        break;
                }
               break;
            
            case "2": System.out.println("Mode of payment: \t3 Months Installment");
                switch(item) {
                    case 'i': 
                        interestRes = price1 + price1 * interest3; 
                        price = price1; 
                        interest = interest3; 
                        break;
                    case 's': 
                        interestRes = price2 + price2 * interest6; 
                        price = price2; 
                        interest = interest6; 
                        break;
                    case 'x': 
                        interestRes = price3 + price3 * interest12; 
                        price = price3; 
                        interest = interest12; 
                        break;
                }
                break;
            case "3": System.out.println("Mode of payment: \t9 Months Installment");
                switch(item) {
                    case 'i': 
                        interestRes = price1 + price1 * interest3; 
                        price = price1; 
                        interest = interest3; 
                        break;
                    case 's': 
                        interestRes = price2 + price2 * interest6; 
                        price = price2; 
                        interest = interest6; 
                        break;
                    case 'x': 
                        interestRes = price3 + price3 * interest12; 
                        price = price3; 
                        interest = interest12; 
                        break;
                }
                break;
            
            case "4": System.out.println("Mode of payment: \t12 Months Installment"); 
                switch(item) {
                    case 'i': 
                        interestRes = price1 + price1 * interest3; 
                        price = price1; 
                        interest = interest3; 
                        break;
                    case 's': 
                        interestRes = price2 + price2 * interest6; 
                        price = price2; 
                        interest = interest6; 
                        break;
                    case 'x': 
                        interestRes = price3 + price3 * interest12; 
                        price = price3; 
                        interest = interest12; 
                        break;
                }
                break;
            
        }
        total = price - discount + interest;
        mA = total / months;

        System.out.println("\nItem: " + "\t" + product );
        System.out.println("Price: " + "\t" + "$" + df.format(price));
        System.out.println("Discount: " +"\t" + "$" + df.format(discount));
        System.out.println("Interest: " +"\t" + "$" + df.format(interest));
        System.out.println("Total Amount: " +"\t" + "$" + df.format(total));
        System.out.println("Monthly Payment: " +"\t" + "$" + df.format(mA));

        input.close();
    }
}