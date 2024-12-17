package Experience.Tutorials.Concepts.DSA.DataStructures;

public class ArraysExample {
    public static void main(String[] args) {
        // Theoretical Explanation: Arrays are fixed-size data structures that store elements of the same type in contiguous memory locations.
        
        // Contextual Explanation: In this example, let's create an array to store temperatures for a week.
        int[] temperatures = {25, 28, 26, 30, 29, 27, 31};
        
        // Displaying the temperatures for the week
        System.out.println("Temperatures for the Week:");
        for (int temp : temperatures) {
            System.out.println(temp);
        }
    }
}