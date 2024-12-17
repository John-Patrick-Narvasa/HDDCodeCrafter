package _SchoolStuff.Task.Midterms;
import java.util.Scanner;

public class AverageTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fuelType = "";
        double day1, day2, day3;

        
        System.out.print("Enter fuel type: ");
        fuelType = input.nextLine();

        System.out.print("\nEnter price in Day 1: ");
        day1 = input.nextDouble();

        System.out.print("\nEnter price in Day 2: ");
        day2 = input.nextDouble();

        System.out.print("\nEnter price in Day 3: ");
        day3 = input.nextDouble();

        double avg = (day1 + day2 + day3) / 3.0;

        System.out.println("\nAverage price of " + fuelType + " is: " + avg + " per liter");
        input.close();
    }
}
