package _SchoolStuff.Task.Midterms;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        int x = -1, y = 7, c = 0;

        c = y + x * -4;
        y += c;
        x -= 3;

        if (x>0) {
            x++;
        }
        if ((c >= 20) || (y >8)) {
            y +=x;
        }
        else {
            y %= 3;
            x*= c;
            c--;
        }

        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);
        System.out.println("Value of c is " + c);
    }
}