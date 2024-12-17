package Java.Tutorials.Basics.Methods;
public class Casting  {
    public static void main(String[] args) {
        //casting and combining types

            //Implicit casting (automatic conversion) no chance for data loss
            //byte -> short -> int -> long -> float -> double
            short x = 1;
            int y = x + 2; 
            System.out.println(y);
    
            //Explicit casting (manual conversion)
            double a = 1.1;
            int b = (int)a + 2;  //2.0
            System.out.println(b);
    
            //String to int (can be applied to double as well)
            String c = "1";
            int d = Integer.parseInt(c) + 2;
            System.out.println(d);
    }
}