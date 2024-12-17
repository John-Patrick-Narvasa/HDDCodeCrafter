package Java.Tutorials.Basics.Types;
import java.util.Scanner;


//Input based program
public class InputUser  {
    public static void main(String[] args) {
        //import scanner
        Scanner scanner = new Scanner(System.in);
        //program prompt
        System.out.print("Age: ");
        //user input
        byte age = scanner.nextByte();
        System.out.println("Your age is: " + age);


        //only outputs first name
        System.out.println("What is your name?: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        //outputs last name
        System.out.println("What is your name?: ");
        String name2 = scanner.nextLine().trim(); //.trim()removes white space
        System.out.println("Hello " + name2);
    }
}
