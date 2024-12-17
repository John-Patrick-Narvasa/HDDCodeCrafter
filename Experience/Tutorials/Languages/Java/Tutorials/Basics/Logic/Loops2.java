package Java.Tutorials.Basics.Logic;


public class Loops2 {
    public static void main(String[] args) {
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
            for (int j = 0; j < fruits.length; j++) {
                System.out.println(fruits[j]); //can go reverse
            }
            for (int k = 3; k > fruits.length; k--) {
                System.out.println(fruits[k]);
            }
            //doing the technique
            /*for (var : array var) 
                    {loop body} */

            for (String fruit : fruits)
                System.out.println(fruit); //only forward
    }
}
