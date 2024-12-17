package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*
Purpose:
Merge sort divides the array into two halves, recursively sorts them, and then merges the two sorted halves.

It has a time complexity of O(n log n) and is stable and efficient for large datasets.

Contextual Explanation:
In a bookstore inventory, merge sort can be used to sort book quantities in ascending order, dividing the quantities into smaller parts and merging them back in a sorted manner.
 */

public class MergeSort {

    public static void main(String[] args) {
        int[] quantities = {10, 5, 8, 3, 12};

        mergeSort(quantities, 0, quantities.length - 1);

        System.out.println("Quantities after Merge Sort:");
        for (int quantity : quantities) {
            System.out.print(quantity + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        // Merge two sorted subarrays
    }
}