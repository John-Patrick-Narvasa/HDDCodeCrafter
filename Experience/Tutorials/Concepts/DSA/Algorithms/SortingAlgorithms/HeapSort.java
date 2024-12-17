package Experience.Tutorials.Concepts.DSA.Algorithms.SortingAlgorithms;

/*
Purpose:
Heap sort is a comparison-based sorting algorithm that uses a binary heap data structure to sort elements.
It has a time complexity of O(n log n) and is efficient for large datasets. It is an in-place algorithm but not stable.

Contextual Explanation:
In the context of a bookstore inventory manager, this Heap Sort based on weight can be used to organize books by their weights. By utilizing the max heap structure, the algorithm can efficiently sort the books from lightest to heaviest, aiding in inventory management tasks such as categorization and storage planning based on book weights.
The updated Heap Sort algorithm now sorts books based on their weights. The algorithm builds a max heap structure from the given weights and then extracts elements in sorted order based on weight.
*/

 public class HeapSort {

    public static void main(String[] args) {
        int[] weights = {30, 20, 10, 40, 50};

        heapSort(weights);

        System.out.println("Books after Heap Sort based on Weight:");
        for (int weight : weights) {
            System.out.print(weight + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap in sorted order
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}