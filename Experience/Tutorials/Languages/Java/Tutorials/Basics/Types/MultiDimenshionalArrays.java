package Java.Tutorials.Basics.Types;
import java.util.Arrays;

public class MultiDimenshionalArrays  {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(numbers));

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + numbers[i][j];
            }
            System.out.println("\nSum of the row is " + (i+1) + ": " + sum);
        }
    }
}