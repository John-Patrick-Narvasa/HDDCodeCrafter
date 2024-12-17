package Experience.Tutorials.Concepts.DSA;

/* 
PURPOSES:
1. Arrays: Stores book titles for quick access.
2. LinkedList: Stores detailed information about each book (title, author, price).
3. HashMap: Maps book titles to quantities available in the inventory.
4. Stack: Records the history of book sales in Last In, First Out (LIFO) order.
5. Queue: Manages book reservations in First In, First Out (FIFO) order.
6. Binary Tree: Represents book categories hierarchically for easy navigation.
7. Graph: Represents relationships between book genres for understanding genre connections.
 * 
 */

import java.util.*;

public class BookstoreInventoryManager {

    public static void main(String[] args) {
        // Arrays: Storing book titles
            String[] bookTitles = {"Java Programming", "Data Structures and Algorithms", "Clean Code"};
        
        // LinkedList: Storing book details (title, author, price)
            LinkedList<String[]> bookDetails = new LinkedList<>();
            bookDetails.add(new String[]{"Java Programming", "John Doe", "$40"});
            bookDetails.add(new String[]{"Data Structures and Algorithms", "Jane Smith", "$35"});
            bookDetails.add(new String[]{"Clean Code", "David Brown", "$45"});
        
        // HashMap: Mapping book titles to quantities
            HashMap<String, Integer> bookQuantities = new HashMap<>();
            bookQuantities.put("Java Programming", 10);
            bookQuantities.put("Data Structures and Algorithms", 15);
            bookQuantities.put("Clean Code", 8);
        
        // Stack: Simulating book sales (LIFO)
            Stack<String> salesHistory = new Stack<>();
            salesHistory.push("Java Programming - John Doe");
            salesHistory.push("Data Structures and Algorithms - Jane Smith");
        
        // Queue: Managing book reservations (FIFO)
            Queue<String> reservations = new LinkedList<>();
            reservations.offer("Clean Code - David Brown");
        
        // Binary Tree: Representing book categories as a binary tree
            TreeNode root = new TreeNode("Programming");
            root.left = new TreeNode("Algorithms");
            root.right = new TreeNode("Design Patterns");
        
        // Graph: Representing relationships between book genres
            Map<String, List<String>> genreConnections = new HashMap<>();
            genreConnections.put("Programming", Arrays.asList("Algorithms", "Java Programming"));
            genreConnections.put("Algorithms", Collections.singletonList("Data Structures and Algorithms"));
        
        // Displaying bookstore inventory and activities
        System.out.println("\nBookstore Inventory and Activities:");
        System.out.println("\nBook Titles: " + Arrays.toString(bookTitles));
        System.out.println("Book Details: " + bookDetails);
        System.out.println("Book Quantities: " + bookQuantities);
        System.out.println("\nSales History: " + salesHistory);
        System.out.println("Reservations: " + reservations);
        System.out.println("Book Categories:");
        displayBinaryTree(root);
        System.out.println("Genre Connections: " + genreConnections);
    }

    // TreeNode class for Binary Tree representation
    static class TreeNode {
        String category;
        TreeNode left;
        TreeNode right;

        public TreeNode(String category) {
            this.category = category;
        }
    }

    // Display the binary tree hierarchy
    private static void displayBinaryTree(TreeNode node) {
        if (node == null) return;
        System.out.println(node.category);
        displayBinaryTree(node.left);
        displayBinaryTree(node.right);
    }
}


/*
 * import java.util.*;

public class BookstoreInventoryManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueManaging = true;

        while (continueManaging) {
            try {
                System.out.println("Welcome to the Bookstore Inventory Manager!");
                System.out.println("Enter 1 to add a new book, 2 to display inventory, or 3 to exit:");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter the book title:");
                        String title = scanner.nextLine();

                        // Add input-based functionality here for book details, quantities, etc.
                        // For simplicity, we'll just display the added book for now
                        System.out.println("Book added successfully: " + title + "\n");
                        break;
                    case 2:
                        System.out.println("Displaying Bookstore Inventory:");
                        // Add code to display inventory details
                        System.out.println("Inventory displayed.\n");
                        break;
                    case 3:
                        continueManaging = false;
                        System.out.println("Exiting the Bookstore Inventory Manager. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.\n");
                scanner.next();
            }
        }

        scanner.close();
    }
}
 */