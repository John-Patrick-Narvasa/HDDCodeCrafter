package _SchoolStuff.selfStudy.Methods;

/*Keywords
 * public (access modifier) [others: private, protected]
 * static (method type, instance) [others]
 * void (return datatype) [others: int, String, char, etc.]
 * method name (ex; main (String[] args))
 */

public class JavaMethod1 {
    public static void main(String[] args) {
        intro();
        println("Hello I show you a cube example method");
        System.out.println(cube(3));
        println("");

        //variable scopes
        int n1 = 10;
        int n2 = 20;
        System.out.println(addNumbers(n1,n2));

        //array addition
    }



    public static void println(String s) {
        System.out.println(s);
    }
    public static void print(String s) {
        System.out.print(s);
    }
    public static void intro() {
        println("Hello to my method program");
    }

    public static int cube(int n) {
        return n*n*n;
    }

    public static int addNumbers(int a, int b) {
        int sum = a+b;
        return sum;
    }

    // public static int addArrayNUmbers(int nums[]) {
    //     int nums[] = {};

    //     while (nums.length) {

    //     }
    // }
}