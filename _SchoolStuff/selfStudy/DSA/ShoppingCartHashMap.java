package _SchoolStuff.selfStudy.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingCartHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize products using HashMap
        Map <String, String> productNames = new HashMap<>();
        productNames.put("1", "Laptop");
        productNames.put("2", "Smartphone");
        productNames.put("3", "Headphones");
        productNames.put("4", "Smartwatch");

        Map <String, Double> products = new HashMap<>();
        products.put("1", 999.99);
        products.put("2", 799.99);
        products.put("3", 199.99);
        products.put("4", 249.99);

        double discountRate = 0.10;
        double subtotal = 0.0;

        System.out.println("\n--- Welcome to the Shopping Cart ---");
        indexProducts(productNames, products);

        while (true) {
            System.out.print("\nEnter the product number to add to cart (0 to finish): ");
            String item = input.nextLine();

            if (item.equals("0")) {
                break; 
            }
            // Add product to cart
            subtotal = subtotal + mainLogic(item, productNames,products);
        }

        double discount = (subtotal > 1000) ? subtotal * discountRate : 0;
        double total = subtotal - discount;

        displayBill(subtotal, discount, total);
        input.close();
        endTask();
    }

    // Display available products
    public static void indexProducts(Map<String, String> productNames, Map<String, Double> products) {
        System.out.println("\nAvailable Products:");
        for (String key : products.keySet()) {
            System.out.println(key + ". " + productNames.get(key) + " - $" + products.get(key));
        }
    }

    // Main logic for adding products to the cart
    public static double mainLogic(String item, Map<String, String> productNames, Map<String, Double> products) {
        if (products.containsKey(item)) {
            double price = products.get(item);
            String productName = productNames.get(item);
            System.out.println("Added " + productName + " to cart - $" + price);
            return price;
        } else {
            System.out.println("Invalid selection. Please try again.");
            return 0.0; 
        }
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
