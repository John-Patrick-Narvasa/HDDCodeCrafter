package Main Projects.Learning Projects.spreadshetConsoleVersion;
import java.util.Scanner;


public class SpreadsheetConsole {

    // This will be a makeshift spreadsheet calculator
    public static void main(String[] args) {
        // multi dimensional arrays
        private Scanner input;
        // default rows and columns
        double nums[][] = {{}};
    }
    // keeping the application flowing
        // while loop
    

    // Interface 
        // coordinate system for spreadsheet
            // for loop

          
    // Options      
        // new array element (add columns)
            
        // new array element on each sub arrays (add row) 
            
        // input/add new number (in a certain coordinate)

        // calculation methods (add, subtract, multiply, divide, remainder, average, ) (same as the excel spreadsheet functions)
            //results


    //visualizing deafault and re visualizing the array spreadsheet (w/ coordinates)

    // selecting groups of elements in a spreadsheet
}


public class SpreadsheetConsole {
    private static final int DEFAULT_ROWS = 10;
    private static final int DEFAULT_COLUMNS = 10;

    private double[][] spreadsheet;
    private Scanner scanner;

    public SpreadsheetConsole() {
        spreadsheet = new double[DEFAULT_ROWS][DEFAULT_COLUMNS];
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private void printMenu() {
        // Print the menu options
    }

    private int getUserChoice() {
        // Get the user's choice from the console
    }

    private int getUserCoordinates(){

    }

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                addRow();
                break;
            case 2:
                addColumn();
                break;
            case 3:
                inputValue();
                break;
            // Add more cases for other functionality
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addRow() {
        // Code to add a new row to the spreadsheet
    }

    private void addColumn() {
        // Code to add a new column to the spreadsheet
    }

    private void inputValue() {
        // Code to allow the user to input a value at a specific coordinate
    }

    // Add more methods for other spreadsheet functionality
}



