package Java.Tutorials.Basics.DataStruc;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a new HashMap to store key-value pairs
        HashMap<String, Integer> myDict = new HashMap<>();

        // Adding key-value pairs to the dictionary
        myDict.put("apple", 5);
        myDict.put("banana", 3);
        myDict.put("orange", 7);

        // Accessing values by key
        System.out.println("Value for key 'apple': " + myDict.get("apple"));

        // Iterating over key-value pairs in the dictionary
        for (String key : myDict.keySet()) {
            System.out.println("Key: " + key + ", Value: " + myDict.get(key));
        }
    }
}