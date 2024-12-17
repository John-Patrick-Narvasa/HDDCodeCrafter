package Experience.Tutorials.Concepts.DSA.Algorithms.SearchingAlgorithms;
/*
Purpose
The linear search algorithm iterates through each element in the array until the target element is found.
It is suitable for small datasets or unsorted lists.

Contextual Explanation:
In a bookstore inventory, linear search can be used to find a specific book by checking each book title one by one until the desired book is located.
 */
public class LinearSearch {

    public static void main(String[] args) {
        String[] books = {"Java Programming", "Data Structures and Algorithms", "Clean Code"};
        String targetBook = "Data Structures and Algorithms";

        int index = linearSearch(books, targetBook);
        if (index != -1) {
            System.out.println(targetBook + " found at index: " + index);
        } else {
            System.out.println(targetBook + " not found in the bookstore inventory.");
        }
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}