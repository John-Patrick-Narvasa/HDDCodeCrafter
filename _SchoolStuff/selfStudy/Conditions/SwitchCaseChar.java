package _SchoolStuff.selfStudy.Conditions;
import java.util.Scanner;

public class SwitchCaseChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String empCodeStr = "", employee = "";

        //Accept the inputs of the program
        System.out.println("Enter employee code [A = agent, L = Team Leader, M = Operations Manager] ");
        empCodeStr = input.next();

        //Convert employee code to uppercase
        empCodeStr = empCodeStr.toUpperCase();
        

        //Convert employee code to character
        char empCodeChar = empCodeStr.charAt(0);

        switch (empCodeChar) {
            case 'A': 
                employee = "Agent";
                break;
            case 'L': 
                employee = "Team Leader";
                break;
            case 'M': 
                employee = "Operations Manager";
                break;
            default:
                employee = "Invalid employee code";
        }

        //Display employee name
        System.out.println("\nEmployee: " + employee);

        input.close();
    }
}
