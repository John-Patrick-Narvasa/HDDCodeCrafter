import java.util.Scanner;

public class exclaim {
    public static void main(String[] args) {
        //declaring the import
        Scanner scanner = new Scanner(System.in);
        //Start user input dialogue;
        System.out.print("Enter a string: ");
        //Start variable with input
        String input = scanner.nextLine();
        //Calling the method addExclamPoint as exclaim
        String exclaim = addExclamPoint(input);
        //final output
        System.out.println(exclaim.toUpperCase());
    }
    //making a seperate method class
    public static String addExclamPoint(String s) {
        return s + "!";
    }
}