package _SchoolStuff.Task.Finals;

import java.util.Scanner;

public class ArrayAssessment {
    public static void main(String[] args) {
    //init scanner as input
    Scanner input = new Scanner(System.in);


    //accept inputs of (for size)...
    //array1
    System.out.print("Enter size of the 1st array: ");
    int size1 = input.nextInt();
    //array2
    System.out.print("Enter size of the 2nd array: ");
    int size2 = input.nextInt();
    //array3
    System.out.print("Enter size of the 3rd array: ");
    int size3 = input.nextInt();

    int[] array1 = new int[size1];
    int[] array2 = new int[size2];
    int[] array3 = new int[size3];

    // accept inputs of (for values)...
    //array1 values
    System.out.print("\nEnter value of the 1st array: ");
    for (int i = 0; i < size1; i++) {
        array1[i] = input.nextInt();
    }
    //array2 values
    System.out.print("Enter value of the 2nd array: ");
    for (int i = 0; i < size2; i++) {
        array2[i] = input.nextInt();
    }
    //array3 values
    System.out.print("Enter value of the 3rd array: ");
    for (int i = 0; i < size3; i++) {
        array3[i] = input.nextInt();
    }

    //outputting
    //value of arrays
    System.out.println("\nOutput: ");
    System.out.println("Value of arrays:");
    System.out.print("Array1: ");
    printArray(array1);
    System.out.print("Array2: ");
    printArray(array2);
    System.out.print("Array3: ");
    printArray(array3);

    //print common elements
    System.out.print("Common elements in sorted arrays: ");
    checkCommonElements(array1, array2, array3);

    input.close();
        
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void checkCommonElements(int[] array1, int[] array2, int[] array3) {
        //loop (linear traversal(i,j,k))
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }  
    }
}
