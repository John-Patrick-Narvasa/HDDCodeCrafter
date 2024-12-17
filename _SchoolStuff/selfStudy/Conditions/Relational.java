package _SchoolStuff.selfStudy.Conditions;
public class Relational {
    public static void main(String[] args) {
        int x;
        int y;


        //comparing numbers
        x = 4;
        y = 10;

        boolean IntegerEqual;
        boolean IntegerGreater;
        boolean IntegerLess;

        IntegerEqual = x == y;
        IntegerLess = x < y; //strong condition (< > only )
        IntegerGreater = x > y; //weight condition (<= >= only)

        System.out.println(IntegerEqual);
        System.out.println(IntegerLess);
        System.out.println(IntegerGreater); 
    }
}
