package _SchoolStuff.selfStudy.Methods;

import java.util.Scanner;

public class Dozen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of eggs: ");
        int numEggs = input.nextInt();

        System.out.println("\nNumber of Dozen: " + determineDozen(numEggs));
        System.out.println("Eggs less than a dozen: " + showLessDozen(numEggs));

        input.close();
    }

    public static int determineDozen(int numEggs) {
        return numEggs / 12;
    }

    public static int showLessDozen(int numEggs) {
        return numEggs % 12;
    }
}