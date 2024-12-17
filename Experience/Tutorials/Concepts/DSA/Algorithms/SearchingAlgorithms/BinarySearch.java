package Experience.Tutorials.Concepts.DSA.Algorithms.SearchingAlgorithms;

/*
Purpose:
Binary search algorithm works on sorted arrays by repeatedly dividing the search interval in half.
It has a time complexity of O(log n), making it efficient for large datasets.

Contextual Explanation:
In a bookstore inventory where books are sorted alphabetically, binary search can quickly locate a specific book by narrowing down the search range in halves.
 */
public class BinarySearch {

    public static void main(String[] args) {
        String[] books = {"Clean Code", "Data Structures and Algorithms", "Java Programming"};
        String targetBook = "Data Structures and Algorithms";

        int index = binarySearch(books, targetBook);
        if (index != -1) {
            System.out.println(targetBook + " found at index: " + index);
        } else {
            System.out.println(targetBook + " not found in the bookstore inventory.");
        }
    }

    public static int binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}