package Java.Tutorials.Basics.Types;
import.java.awt.*;

public class PrimitiveVSReference  {
    public static void main(String[] args) {
        //primitive data types
        byte x = 1;
        byte y = x;
    
        //reference data types
        Point point1 = new Point(1, 2);
        Point point2 = point1;

        System.out.println(y);
        System.out.println(point2);
    }
}
