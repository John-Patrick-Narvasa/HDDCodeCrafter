package _SchoolStuff.selfStudy.Array;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Product names and prices
        String product1 = "Laptop", product2 = "Smartphone", product3 = "Headphones", product4 = "Smartwatch";
        String[] products = {product1, product2, product3, product4};

        double price1 = 999.99, price2 = 799.99, price3 = 199.99, price4 = 249.99;
        double[] prices = {price1, price2, price3, price4};

        double discountRate = 0.10;
        double subtotal = 0.0, discount = 0.0, total = 0.0;

        System.out.println("\n--- Welcome to the Shopping Cart ---");
        
        // Store products
        indexProducts(products, prices);

        // Product indexer 
        while (true) {
            System.out.print("\nEnter the product number to add to cart (0 to finish): ");
            String item = input.nextLine();

            // Check user input
            if (item.equals("0")) {
                break; 
            } 
            else if (!item.matches("[0-9]+")) {
                System.out.println("Invalid selection. Please try again.");
                continue;
            }
            // Add product to cart
            subtotal = subtotal + mainLogic(item, products, prices);
        }

        // Calculate discount if applicable
        discount = calculateDiscount(subtotal, discountRate);
        total = calculateTotal(subtotal, discountRate, total);

        // Bill outputting
        displayBill(subtotal, discount, total);
        input.close();

        // End task
        endTask();
    }

    // display available products
    public static void indexProducts(String[] products, double[] prices) {
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
        }
    }

    public static double mainLogic(String item, String[] products, double[] prices) {
        for (int i = 0; i < products.length; i++) {
            if (item.equals(String.valueOf(i + 1))) {
                System.out.println("Added " + products[i] + " to cart" + " - $" + prices[i]);
                return prices[i];
            }
        }
        System.out.println("Invalid selection. Please try again.");
        return 0.0; 
    }
    
    public static double calculateSubtotal(double[] prices) {
        double subtotal = 0.0;
        for (double price : prices) { //for each price in the array
            subtotal = subtotal + price;
        } 
        return subtotal;
    }
    
    public static double calculateDiscount(double subtotal, double discountRate) {
        double discount = (subtotal > 1000) ? subtotal * discountRate : 0;
        return discount;
    }
    
    public static double calculateTotal(double subtotal, double discountRate, double total) {
        double discount = (subtotal > 1000) ? subtotal * discountRate : 0;
        subtotal = subtotal - discount;
        return total = subtotal;
    }
    
    public static void displayBill(double subtotal, double discount, double total) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        System.out.println("\n--- Final Bill ---");
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Discount: $" + df.format(discount));
        System.out.println("Total Amount: $" + df.format(total));
    }
    
    public static void endTask() {
        System.out.println("\nThank you for shopping with us!");
    }
}
// Main logic for adding products to the cart

// public static double mainLogic(String item, String[] products, double[] prices) {
//     switch (item) {
//         case "1":
//             System.out.println("Added " + products[0] + " to cart");
//             return prices[0];
//         case "2":
//             System.out.println("Added " + products[1] + " to cart");
//             return prices[1];
//         case "3":
//             System.out.println("Added " + products[2] + " to cart");
//             return prices[2];
//         case "4":
//             System.out.println("Added " + products[3] + " to cart");
//             return prices[3];
//         default:
//             System.out.println("Invalid selection. Please try again.");
//             return 0.0; // Return zero if invalid selection
//     }
// }

// Main logic for adding products to the cart