package Java.Tutorials.Basics.Logic;
//Loops
/*for loops
 * while loops
 * do-while loops
 * for-each loops
 * break and continue
 */

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        //problem context
            /*
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            */ 
            
            //not good practice to use this way, that is why we use loops

        //FOR LOOPS  (good if we know the exact number of iterations)
        /*for (initialization (declaration); condition (boolean expression); increment/decrement OR update) 
                {loop body}]*/
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World " + i);
            }
            //reverse version (for fun)
            for (int i = 5; i > 0; i--) {
                System.out.println("Hello World " + i);
            }

        //WHILE LOOPS (good if we don't know the exact number of iterations)
        /* while (condition) 
                {loop body}*/
            //example 1
            int i = 0;
            while (i < 5) {
                System.out.println("Hello World " + i);
                i++;
            }

            //example 2 (with break and continue)
            Scanner scanner = new Scanner(System.in); //put scanner outside the loop
            String input = "";
            while (true) { //common technique for professionals 
                System.out.println("Input:");
                input = scanner.next().toLowerCase(); //because some people input uppercase letters

                if (input.equals("pass"))
                    continue;
                if (input.equals("quit")) 
                    break;
                System.out.println(input);
            }

        //DO-WHILE loops 
        /* do 
                {loop body} 
            while (condition) */
            int count = 0;
            do {
                System.out.println("Iteration " + count);
                count++;
            } 
            while (count < 5);

        //FOR-EACH LOOPS
            String[] fruits = {"Apple", "Mango", "Orange"};
                //classic for loop
            for (int j = 0; i < fruits.length; j++) {
                System.out.println(fruits[i]); //can go reverse
            }
            //doing the technique
            /*for (var : array var) 
                    {loop body} */

            for (String fruit : fruits)
                System.out.println(fruit); //only forward
    }
}
