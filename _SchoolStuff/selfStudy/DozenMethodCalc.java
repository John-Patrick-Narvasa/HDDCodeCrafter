package _SchoolStuff.selfStudy;

import java.util.Scanner;

public class DozenMethodCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numEggs = 0;

        System.out.print("Enter the number of eggs: ");
        numEggs = input.nextInt();

        System.out.println("\nNumber of Dozen: " + determineDozen(numEggs));
        System.out.println("Eggs less than a dozen: " + showLessDozen(numEggs));

        input.close();
    }

    public static int determineDozen(int numEggs) {
        int numDozen = 0;
        numDozen = numEggs / 12;
        return numDozen;
    }

    public static int showLessDozen(int numEggs) {
        int numLessDozen = 0;
        numLessDozen = numEggs % 12;
        return numLessDozen;
    }
}