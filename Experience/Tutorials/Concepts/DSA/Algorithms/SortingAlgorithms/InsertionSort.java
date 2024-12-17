package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*Purpose:
Insertion sort builds the final sorted array one element at a time by inserting each element into its correct position.
It is efficient for small datasets or nearly sorted arrays.

Contextual Explanation:
In a bookstore inventory, insertion sort can be used to sort book prices in ascending order by comparing and inserting each price at the correct position in the sorted list.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] prices = {45, 35, 40, 25, 50};

        insertionSort(prices);

        System.out.println("Prices after Insertion Sort:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}