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


public class ConsoleTemplate {

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
            catch (Exception e){
                System.out.println("Invalid input");
            }
            finally { 
                scanner.close(); 
            }
        }
        
    }


    //TODO IF EACH AREAS GOT TOO BIG, USE MODULES OR MAKE A SEPERATE FILE/CLASS
  
    public static String intro() {
        System.out.println("Insert intro here");
        return "";
    }
    
    public static String housekeeping() {
        System.out.println("Insert housekeeping here");
        return "";
    }
    
    
    public static String getInputs(Scanner scanner) { //any data type
        System.out.println("Enter input here: ");
        return scanner.nextLine();
    }


    public static void detailedFunctions(String userInput) { //any data type //Consider userInput and Arguments
        //return; values and operations, conditions, formulae (if void, don not use return keyword)
    }

    public static void detailedFunctions2(String cpuTask) {

    }

    public static void endOfTask() {
        System.out.println("Insert exit here");

        System.out.println("Do you want to perform another task? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("N")) {
            System.out.println("Thank you for using the Program. Goodbye!");
            System.exit(0);
        }
    }
    
    
}
