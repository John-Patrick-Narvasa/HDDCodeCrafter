package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*
Purpose:
Quick sort is a divide-and-conquer algorithm that selects a pivot element and partitions the array into two subarrays such that elements less than the pivot are on the left and elements greater are on the right.
It has an average time complexity of O(n log n) and is efficient for large datasets, making it a popular choice for sorting.

Contextual Explanation:
In the context of a bookstore inventory manager, quick sort can be used to efficiently sort the inventory items by their quantities. By selecting a pivot quantity (e.g., total number of items), the algorithm can quickly arrange the items such that those with lower quantities are on the left and those with higher quantities are on the right, facilitating inventory management and restocking processes.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] inventory = {50, 30, 20, 40, 60};

        quickSort(inventory, 0, inventory.length - 1);

        System.out.println("Inventory after Quick Sort:");
        for (int item : inventory) {
            System.out.print(item + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}