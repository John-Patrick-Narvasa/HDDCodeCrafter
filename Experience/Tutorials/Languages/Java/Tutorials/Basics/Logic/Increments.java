package Java.Tutorials.Basics.Logic;

import java.util.Scanner;

public class Increments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int A = 1;
        int B = 0;
        int sum = 0;

        System.out.println("Enter a number: ");

        B = scanner.nextInt();
        scanner.close();


        while (A <= B) {
            A++; // or A = A + 1
            sum += A; // or sum = sum + A
            
        }

        System.out.println(sum);
    }
}
