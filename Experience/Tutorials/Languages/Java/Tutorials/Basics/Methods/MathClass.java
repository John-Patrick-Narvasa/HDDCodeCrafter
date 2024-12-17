package Java.Tutorials.Basics.Methods;
//MATH class and methods (with usage)
public class MathClass  {
    public static void main(String[] args) {
        float testNumber = 1.1F;

            //ceiling and floor
            int result1 = (int)Math.ceil(testNumber);
            System.out.println(result1);
    
            int result2 = (int)Math.floor(testNumber);
            System.out.println(result2);
    
            //min and max
            int result3 = (int)Math.max(testNumber, 2); //greater number
            System.out.println(result3);
    
            int result4 = (int)Math.min(testNumber, 2); //smaller number
            System.out.println(result4);
    
    
            //Random number (with decimals)
            double result5 = Math.random() * 100; //100 as the threshold
            System.out.println(result5);
    
            //Random number (without decimals)
            int result6 = (int)(Math.random() * 100); //100 as the threshold (make sure to enclose in parenthesis or else it will show "0")
            System.out.println(result6);


    }
}
