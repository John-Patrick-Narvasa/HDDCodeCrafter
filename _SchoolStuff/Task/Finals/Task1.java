package _SchoolStuff.Task.Finals;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, ctr;

        System.out.print("Enter number: ");
        input = scan.nextInt();

        System.out.print("Sequence number: ");
        for (ctr = 1; ctr <= input; ctr++) {
            System.out.print(ctr + " ");
        }

        System.out.println(); 

        System.out.print("Alternative/Reverse Order: ");
        for (ctr = input; ctr >= 1; ctr--) {
            System.out.print(ctr + " " + (input - ctr + 1) + " ");
        }
        System.out.println(); 

        System.out.print("Alternative/Reverse Order: ");
        for(int i=0;i<input;i++){
            int difference = input-i;
            int subtrahend = i+1;
            System.out.print(difference + " " + subtrahend +" ");
        }

        scan.close();
    }   
}