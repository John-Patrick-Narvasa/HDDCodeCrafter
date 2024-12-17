import java.util.Scanner;


public class TaxRateExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxRate = 0;
        double price = 0;


    }

    public static double calculateTotal(double price, double taxRate) {
        return price + taxRate;
    }
    
    public static String housekeeping() {
        System.out.println("Insert housekeeping here");
        return "";
    }
    
    
    public static String getInputs(Scanner scanner) { //any data type
        System.out.println("Enter input here: ");
        return scanner.nextLine();
    }
}
