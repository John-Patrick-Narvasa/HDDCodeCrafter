package Java.Projects.CalcWatt;

import java.util.Scanner;

public class CalcWattCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Watts or Volts and Amps?");
        String input = scanner.next().toLowerCase();

        // Main logic process
        try {
            if (input.equals("watts")) {
                double watts = getWatts(scanner);
                double hours = getHours(scanner);
                double price = getPrice(scanner);
                calculateAndPrintCost(calcWattCost(watts, hours, price));
            } else if (input.equals("volts") || input.equals("amps")) {
                double volts = getVolts(scanner);
                double amps = getAmps(scanner);
                double watts = wattConvert(volts, amps);
                double hours = getHours(scanner);
                double price = getPrice(scanner);
                calculateAndPrintCost(calcWattCost(watts, hours, price));
            } else {
                System.out.println("Invalid input");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
          }
    }

    // Gets the watts (via inputting)
    public static double getWatts(Scanner scanner) {
        System.out.print("Number of watts used: ");
        return scanner.nextDouble();
    }

    // Gets the volts (via inputting)
    public static double getVolts(Scanner scanner) {
        System.out.print("Number of volts: ");
        return scanner.nextDouble();
    }

    // Gets the amps (via inputting)
    public static double getAmps(Scanner scanner) {
        System.out.print("Number of amps: ");
        return scanner.nextDouble();
    }

    // Gets the hours (via inputting)
    public static double getHours(Scanner scanner) {
        System.out.print("Number of hours used: ");
        return scanner.nextDouble();
    }

    // Gets the price (via inputting) 
    public static double getPrice(Scanner scanner) {
        System.out.print("Price per kWh: ");
        return scanner.nextDouble();
    }

    // Converts volts and amps to watts
    public static double wattConvert(double volts, double amps) {
        return volts * amps;
    }

    // Calculates the cost
    public static double calcWattCost(double watts, double hours, double price) {
        return watts * hours * price / 1000;
    }

    // Prints the cost
    public static void calculateAndPrintCost(double cost) {
        System.out.println("The cost is: " + cost);
    }
}