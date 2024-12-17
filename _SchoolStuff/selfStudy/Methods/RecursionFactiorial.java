package _SchoolStuff.selfStudy.Methods;

public class RecursionFactiorial {
    public static void main(String[] args) {
        int fa = 5;
        int f = fa;
        int ctr = 1;
        while (ctr < fa) {
            if (f == 0) {
                f = 1;
            }
            else {
                f = f * (fa - ctr);
            }
            ctr++;
        }
        System.out.println(f);
        System.out.println();

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}