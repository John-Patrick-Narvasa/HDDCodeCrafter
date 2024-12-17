package _SchoolStuff.selfStudy;

import java.util.Arrays;
import java.util.Scanner;
public class EmptyArrayAppend {
    public static void main(String[] args) {
        int[] numbers = {};
        String[] names1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        String[] names2 = { "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        
        System.out.println("\nwhile loop version: ");

        int x = 0;
        while (x < numbers.length) {
            numbers[x] = x + 1;
            System.out.println(numbers[x] + ". " + names1[x]);
            x++;
        } // while loop still needs an outside variable

        System.out.println("\n");
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
