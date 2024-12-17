package _SchoolStuff.Task.Midterms;

public class ConditionalStatement1 {
    public static void main(String[] args) {
        int a=1, b=4, c=0;

        c = b + a*2;
        b++;

        a = c*(b-1) + 7 % 3;
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        System.out.println("Value of c is " + c);

        if (b>c) {
            a--;
            c++;
        }
        else {
            b--;
            b += 4;
            c*= 3;
        }
        System.out.println();
        System.out.println("Values of a, b, c are " + a + ", " + b + ", " + c + " respectively");
    }
}
