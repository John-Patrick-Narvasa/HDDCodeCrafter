package Experience.Tutorials.Concepts.DSA.DataStructures;

// Stack is a data structure that follows the Last In, First Out (LIFO) principle.
    // 5 methods of Stack: push(), pop(), peek(), search(), isEmpty()

    // push(): Adds an element to the top of the stack
    // pop(): Removes and returns the top element from the stack
    // peek(): Returns the top element from the stack without removing it
    // search(): Returns the index of the first occurrence of an element in the stack
    // isEmpty(): Returns true if the stack is empty, false otherwise


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Theoretical Explanation: Stack is a data structure that follows the Last In, First Out (LIFO) principle.
        
        // Contextual Explanation: Let's use a Stack to simulate a browser history.
       
       
        Stack<String> browserHistory = new Stack<>();

        browserHistory = new Stack<>();

        browserHistory.push("Homepage");
        browserHistory.push("Article 1");
        browserHistory.push("Article 2");

        // Removing the browser history
        System.out.println("Removing browser history:");
        while (!browserHistory.isEmpty()) {
            System.out.println(browserHistory.pop());
        }
        
        // Displaying the browser history
        System.out.println("Browser History:");
        while (!browserHistory.isEmpty()) {
            System.out.println(browserHistory.pop());
        }
    }
}

/*Structuring: 
 * Stack<KeyType> variableName = new Stack<>();
 * variableName.push(key);
 * variableName.pop();
 * variableName.peek();
 * variableName.search(key);
 * variableName.isEmpty();
 * 
 */