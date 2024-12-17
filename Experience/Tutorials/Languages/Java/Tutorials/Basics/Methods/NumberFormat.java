package Java.Tutorials.Basics.Methods;
import java.text.NumberFormat;


//Formatting numbers (converting numbers to other formats such as currency and percent)
public class NumberFormat  {
    public static void main(String[] args) {
        //dollars
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String result1 = currency.format(123456.789);
            System.out.println(result1);

        //percent
            NumberFormat percent = NumberFormat.getPercentInstance();
            String result2 = percent.format(0.123);
            System.out.println(result2);

        //Meta chaining
            String result3 = NumberFormat.getPercentInstance(). format(0.1);
            System.out.println(result3);


    }
}
