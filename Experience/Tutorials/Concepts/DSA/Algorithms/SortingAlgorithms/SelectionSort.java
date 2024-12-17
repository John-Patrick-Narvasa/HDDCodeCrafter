package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*
Purpose:
Selection sort divides the array into a sorted and an unsorted region, repeatedly selects the minimum element from the unsorted region, and swaps it with the first element of the unsorted region.
It has a time complexity of O(n^2) and is useful for small datasets or scenarios where swapping is costly.

Contextual Explanation:
In a bookstore, selection sort can be used to sort book pages in ascending order by selecting the book with the minimum pages and placing it in the sorted section.
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] pages = {200, 150, 180, 120, 250};

        selectionSort(pages);

        System.out.println("Pages after Selection Sort:");
        for (int page : pages) {
            System.out.print(page + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}