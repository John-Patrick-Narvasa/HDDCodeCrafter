package _SchoolStuff.Task.Midterms;

import java.util.Scanner;
import java.text.DecimalFormat;


public class SalesDiscountEnhanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");

        String product;
        double price, discount, netPrice, discountPercentage;
        
        System.out.print("Enter product: ");
        product = input.nextLine();

        System.out.print("Enter price: ");
        price = input.nextDouble();

        discountPercentage = discountPercentage(price);

        discount = price * discountPercentage;
        netPrice = price - discount;

        System.out.println("\nPrice of " + product + " is " + df.format(price));
        System.out.println("Discount is " + df.format(discount));
        System.out.println("Net Price is " + df.format(netPrice));

        input.close();
    }

    public static double discountPercentage(double price) {
        double discountPercentage = 0.0;
        if ((price >= 0) && (price <= 10_000)) {
            discountPercentage = 0.0;
        }
        else if ((price >= 10_001) && (price <= 20_000)) {
            discountPercentage = 0.05;
        }
        else if ((price >= 20_001) && (price <= 50_000)) {
            discountPercentage = 0.10;
        }
        else if ((price >= 50_000) && (price <= 100_000)) {
            discountPercentage = 0.15;
        }
        else if (price > 100_000) {
            discountPercentage = 0.2;
        }
        return discountPercentage;
    }
}
