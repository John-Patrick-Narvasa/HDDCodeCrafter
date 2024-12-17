package Java.Template;

import java.util.Scanner;
//insert other modules here
     /* Structure of code:
     * declaration of imports, data types, methods
     * intro
     * housekeeping
     * getInputs
     * detailedFunctions
     * endOfTask
     */
    //insert other steps here (w/ pseudo code)

public class ImprovedTemplate {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaration of data types

        while (true) { //infinite loop, continue until exit is called
            try {

                //code (conditions and operations)

                intro();
                housekeeping();

                String userInput = getInputs(scanner);
                detailedFunctions(userInput);

                endOfTask();
            } 
            catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
            finally {
                scanner.close();
            }
        }
    }


    //TODO IF EACH AREAS GOT TOO BIG, USE MODULES OR MAKE A SEPERATE FILE/CLASS

    public static void intro() {
        System.out.println("Insert intro here");
        return ""; //returning an empty string
    }

    public static void housekeeping() {
        System.out.println("Insert housekeeping here");
        return ""; //returning an empty string
    }

    public static String getInputs(Scanner scanner) { //any data type
        System.out.println("Enter input here: ");
        return scanner.nextLine();
    }

    public static void detailedFunctions(String userInput) { //any data type //Consider userInput and Arguments
        System.out.println("Processing user input: " + userInput);
        // Perform detailed operations based on user input
        //return; values and operations, conditions, formulae (if void, don not use return keyword)
    }

    public static void detailedFunctions2(String cpuTask) {
        System.out.println("Processing CPU task: " + cpuTask);
        // Implement CPU task logic here
    }

    public static void endOfTask() {
        System.out.println("Exiting the Java template. Thank you for coding with us!");
        System.exit(0);
    }
}
