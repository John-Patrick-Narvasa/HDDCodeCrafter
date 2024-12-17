package _SchoolStuff.Study.selectionStructures.discussionSession;

import java.util.*;

public class IfElseDiscussion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int age;

        System.out.print("Enter Age: ");
        age = input.nextInt();


        if (age >= 18) {
            System.out.println("Qualified to vote");
        }
        else {//(no need braces but can be a good practice)
            System.out.println("Too young, nqualified to vote");
        }

        System.out.println("Done!");
    }
}
