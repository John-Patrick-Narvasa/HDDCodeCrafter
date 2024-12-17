package _SchoolStuff.Task.Midterms;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        // Product names and prices
        String product1 = "Laptop", product2 = "Smartphone", product3 = "Headphones", product4 = "Smartwatch";
        double price1 = 999.99, price2 = 799.99, price3 = 199.99, price4 = 249.99;
        double discountRate = 0.10;
        double subtotal = 0.0, discount = 0.0, total = 0.0;

        // Store products
        System.out.println("Available Products: ");
        System.out.println("1. " + product1 + "\t - " + df.format(price1));
        System.out.println("2. " + product2 + "\t - " + df.format(price2));
        System.out.println("3. " + product3 + "\t - " + df.format(price3));
        System.out.println("4. " + product4 + "\t - " + df.format(price4));

        // Product indexer 
        while (true) {
            System.out.print("\nEnter the product number to add to cart (0 to finish): ");
            String item = input.nextLine();

            // Check user input
            if (item.equals("0")) {
                break; 
            }

            switch (item) {
                case "1":
                    System.out.println("Added " + product1 + " to cart");
                    subtotal += price1;
                    break;
                case "2":
                    System.out.println("Added " + product2 + " to cart");
                    subtotal += price2;
                    break;
                case "3":
                    System.out.println("Added " + product3 + " to cart");
                    subtotal += price3;
                    break;
                case "4":
                    System.out.println("Added " + product4 + " to cart");
                    subtotal += price4;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }

        // Calculate discount if applicable
        discount = (subtotal > 1000) ? subtotal * discountRate : 0;
        total = subtotal - discount;

        // Bill outputting
        System.out.println("\n--- Final Bill ---");
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Discount: $" + df.format(discount));
        System.out.println("Total Amount: $" + df.format(total));

        input.close();
    }
}