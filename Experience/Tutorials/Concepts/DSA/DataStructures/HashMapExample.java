package Experience.Tutorials.Concepts.DSA.DataStructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Theoretical Explanation: HashMap is a key-value pair data structure that allows fast retrieval of values based on keys.
        
        // Contextual Explanation: Let's use a HashMap to store student grades.
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        
        // Displaying student grades
        System.out.println("Student Grades:");
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }
    }
}

/*Structuring: 
 * HashMap<KeyType, ValueType> variableName = new HashMap<>();
 * variableName.put(key, value);
 * 
 * for (KeyType key : variableName.keySet())
 *        System.out.println(variableName.get(key));
 * 
*/
