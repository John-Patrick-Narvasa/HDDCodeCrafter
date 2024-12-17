package Java.Tutorials.Basics.Logic;

//Operators

public class OperatorLogic {
    public static void main(String[] args) {
        // comparison operators
            int x = 1;
            int y = 2;

            System.out.println(x < y); //true
            System.out.println(x > y); //false
            System.out.println(x <= y); //true
            System.out.println(x >= y); //false
            System.out.println(x == y); //false
            System.out.println(x != y); //true

        //Logical operators
            //example 1
                // && (and)
                int tempurature = 12;
                boolean iswarm = tempurature > 20 && tempurature < 30;

                System.out.println("Is it warm? (and): " + iswarm); //false

                // || (or)
                int tempurature2 = 12;
                boolean iswarm2 = tempurature > 20 || tempurature < 30;

                System.out.println("Is it warm? (or): " + iswarm2); //true

            //example 2 (only two conditions)
            boolean hasHighIncome = true;
            boolean hasGoodCredit = true;
            
            boolean isEligible = hasHighIncome || hasGoodCredit;

            System.out.println(isEligible); //true
             //three conditions?
             boolean hasHighIncome1 = true;
             boolean hasGoodCredit1 = true;
             boolean hasCriminalRecord = false;
             
             boolean isEligible1 = (hasHighIncome1 || hasGoodCredit1) && !hasCriminalRecord;
 
             System.out.println(isEligible1); //true



    }
    
}
