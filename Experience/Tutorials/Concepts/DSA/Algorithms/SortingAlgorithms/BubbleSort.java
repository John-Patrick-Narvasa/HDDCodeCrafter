package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*
Purpose:
Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
It is simple to implement but inefficient for large datasets due to its time complexity of O(n^2).

Contextual Explanation:
In a bookstore, bubble sort can be used to sort book ratings in ascending order by comparing adjacent ratings and swapping them if necessary until the list is sorted.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] ratings = {3, 5, 2, 4, 1};

        bubbleSort(ratings);

        System.out.println("Ratings after Bubble Sort:");
        for (int rating : ratings) {
            System.out.print(rating + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
