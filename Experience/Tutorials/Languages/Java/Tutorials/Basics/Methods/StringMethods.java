package Java.Tutorials.Basics.Methods;
public class StringMethods  {
    public static void main(String[] args) {
        //some String methods
        String message = "Hello World" + "!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());

        System.out.println(message.indexOf("World"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toUpperCase());
    }
}
