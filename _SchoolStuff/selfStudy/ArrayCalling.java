package _SchoolStuff.selfStudy;

public class ArrayCalling {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        String[] names1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        String[] names2 = { "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        
        System.out.println("\nwhile loop version: ");

        int x = 0;
        while (x < names1.length) { //quite a hassle to manually change the variable array length of names1
            System.out.println(numbers[x] + ". " + names1[x]);
            x++;
        } // while loop still needs an outside variable

        System.out.println("\nfor loop version: ");
        for (int i = 0; i < numbers.length; i++) { // still numbers array length
            System.out.println(numbers[i] + ". " + names2[i]);
        } // for loop, you can make a variable internally therefore lessen the number of variables and lines
    }
}
