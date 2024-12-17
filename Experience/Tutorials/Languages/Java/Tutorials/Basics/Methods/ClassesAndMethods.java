package Java.Tutorials.Basics.Methods;

public class ClassesAndMethods {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int total = x + y;
        // w/o methods
        System.out.println(total);

        // w/ methods
        System.out.println(sum(x, y));

        double likes = 4000;
        double dislikes = 21;

        System.out.println(ratio(likes, dislikes));
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double ratio(double likes, double dislikes) {
        if (likes + dislikes == 0) {
            return 0;
        }
        return likes / (likes + dislikes) * 100;
    }
}
