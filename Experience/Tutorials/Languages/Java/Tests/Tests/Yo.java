
//Conditions

import java.util.Scanner;

public class Yo {
    public static void main(String[] args) {
        //if statements
            //declare variables
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the temperature: ");
            byte temperature = scanner.nextByte();

            //declare conditions
            if (temperature < 30) {  //dont forget parenthesis and braces
                System.out.println("It is warm");
            }
            else if (temperature > 30) {
                System.out.println("Stay hydrated");
            }
            else {
                System.out.println("Cold Day");
            }

        //Ternary operator (trick shortcut) (left to right)
            int income = 120_000;
            String className = income > 100_000 ? "First" : "Economy";
                //condition ? if true : if false

        //Switch statements (up to down) (faster if statement)
            String role = "admin";

            switch (role) {
                case "admin":
                    System.out.println("Admin");
                    break; //break is important to jump out of the switch statement
                case "moderator":
                    System.out.println("Moderator");
                    break;
                default:
                    System.out.println("You are a guest");
            }
            //if statement version
            if (role.equals("admin")) {
                System.out.println("Admin");
            }
            else if (role.equals("moderator")) { 
                System.out.println("Moderator");
            }
            else {
                System.out.println("You are a guest");
            }
    }
}
