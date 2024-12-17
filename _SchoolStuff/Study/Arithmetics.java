package _SchoolStuff.Study;

public class Arithmetics {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;


        System.out.println(x++ + ++x + ++x); // 5 + 5 + 6
        System.out.println(x * ++y + y++);// x * (y + 1) + y = 3 * (5 + 1) + 5 = 18 + 5 = 23
        System.out.println(1+2+"3"+4+5); // 3345
        System.out.println(5+5+"5"); // 105
        System.out.println(10 / 2 * 3 + 5 - 1); //19
        System.out.println("Result: " + 8 + 2);

        int a = 2;
        int b = 5;
        System.out.println(a * a++ + ++a);
        System.out.println(a++ * --b);

        //reassigned
        System.out.println(a++ * --a);


    }
}

