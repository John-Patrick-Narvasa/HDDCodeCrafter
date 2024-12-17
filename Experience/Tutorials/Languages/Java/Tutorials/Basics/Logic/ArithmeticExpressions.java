package Java.Tutorials.Basics.Logic;
import java.math.*;

public class ArithmeticExpressions {
    // expression = operands & operators
    // operands = values, variables, numbers, quantity 
    // operators = +, -, *, /, %, **

    public static void main(String[] args) {
        int friends = 5;

        friends = friends + 1;
        /*or friends += 1;
         * 
         * friends++;
         */

         //output: 6

         friends = friends - 1;
         /*or friends -= 1;
          * 
          * friends--;
          */
         //output: 4


         friends = friends * 2;
         /*or friends *= 2;
          * 
          * friends *= 2;
          */
         //output: 8


         friends = friends / 2;
         /*or friends /= 2;
          * 
          * friends /= 2;
          */
         //output: 4 (System.out.println((double)friends))


         friends = friends % 2;
         /*or friends %= 2;
          */
         //output: 0

         friends = friends % 3;
         //output: 2


         friends = friends ** 2; //exponent
         /* or friends **= 2
          * friends = friends * friends;
          * friends = Math.pow(friends, 2);
          */
         //output: 16



        System.out.println(friends);

        
    }
}
