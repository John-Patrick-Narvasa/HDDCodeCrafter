package _SchoolStuff.selfStudy.DSA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ShoppingCartGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    // Product names and prices
    private String[] products = {"Laptop", "Smartphone", "Headphones", "Smartwatch"};
    private double[] prices = {999.99, 799.99, 199.99, 249.99};
    private double discountRate = 0.10;
    private double subtotal = 0.0;

    private JTextArea textArea;
    private JButton[] productButtons;
    private JButton calculateButton;
    private JButton clearButton;

    public ShoppingCartGUI() {
        setTitle("Product Sale");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a text area to display the output
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create a panel for product buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));

        productButtons = new JButton[products.length];
        for (int i = 0; i < products.length; i++) {
            productButtons[i] = new JButton(products[i] + " - $" + prices[i]);
            final int index = i; // Final variable for lambda expression
            productButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addToCart(index);
                }
            });
            buttonPanel.add(productButtons[i]);
        }

        add(buttonPanel, BorderLayout.NORTH);

        // Create Calculate and Clear buttons
        calculateButton = new JButton("Calculate Total");
        clearButton = new JButton("Clear Cart");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearCart();
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(calculateButton);
        bottomPanel.add(clearButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void addToCart(int index) {
        subtotal += prices[index];
        textArea.append("Added " + products[index] + " to cart.\n");
    }

    private void calculateTotal() {
        double discount = (subtotal > 1000) ? subtotal * discountRate : 0;
        double total = subtotal - discount;

        DecimalFormat df = new DecimalFormat("###,###.00");
        textArea.append("\n--- Final Bill ---\n");
        textArea.append("Subtotal: $" + df.format(subtotal) + "\n");
        textArea.append("Discount: $" + df.format(discount) + "\n");
        textArea.append("Total Amount: $" + df.format(total) + "\n");
    }

    private void clearCart() {
        subtotal = 0.0;
        textArea.setText("");
        textArea.append("Cart cleared. Start adding products.\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShoppingCartGUI frame = new ShoppingCartGUI();
            frame.setVisible(true);
        });
    }
}
