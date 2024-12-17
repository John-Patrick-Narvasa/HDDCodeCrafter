package Experience.Tutorials.Concepts.DSA.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Theoretical Explanation: Queue is a data structure that follows the First In, First Out (FIFO) principle.
        
        // Contextual Explanation: Let's use a Queue to simulate a line of customers waiting at a bank.
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");
        
        // Serving customers in the order they arrived
        System.out.println("Bank Customer Queue:");
        while (!customerQueue.isEmpty()) {
            System.out.println("Serving: " + customerQueue.poll());
        }
    }
}

/*Structuring: 
 * Queue<KeyType> variableName = new LinkedList<>();
 * 
 * variableName.add(key);
 * variableName.poll();
 * variableName.peek();
 * 
 */