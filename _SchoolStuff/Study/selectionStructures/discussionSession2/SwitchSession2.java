package _SchoolStuff.Study.selectionStructures.discussionSession2;

import java.util.Scanner;

public class SwitchSession2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        System.out.println("Enter year: ");

        choice = input.next().charAt(0);  //.charAt(indexArrayLike)
        //makki
        //01234

        // if version

        /*if ((choice == 'f') || (choice == 'F')) {
            System.out.println("Freshman");
        }
        if ((choice == 's') || (choice == 'S')) {
            System.out.println("Sophomore");
        }
        if ((choice == 'j') || (choice == 'J')) {
            System.out.println("Junior");
        }
        if ((choice == 'x') || (choice == 'X')) {
            System.out.println("Senior");
        }
        else {
            System.out.println("out of school youth");
        }
        */

        //SWITCH version
        choice = Character.toUpperCase(choice);

        switch (choice) {
            case 'F': //should be upper cased if .toUpperCase (only getting index position doesnt matter if the input is fresh as long as it starts with letter f)
                System.out.println("Freshman");
                break;
            case 'S':
                System.out.println("Sophomore");
                break;
            case 'J':
                System.out.println("Junior");
                break;
            case 'X':
                System.out.println("Senior");
                break;
            default:
                System.out.println("out of school youth");
        }
    }
}
