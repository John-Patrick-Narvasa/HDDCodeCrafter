package Java.Tutorials.Basics.Types;
import java.util.Arrays;

public class Arrays  {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 4};
        
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
