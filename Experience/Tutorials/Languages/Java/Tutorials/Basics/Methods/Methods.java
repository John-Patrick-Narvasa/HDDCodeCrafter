package Java.Tutorials.Basics.Methods;
//Methods
//AKA DIY built-in function
public class Methods {
    //Main 
    public static void main(String[] args) {
        System.out.println("message1 ");
        
        //calling the method
        sayHi(); // no need to output since the it already had it inside the method (referring to Line 25)
        sum(3,4);
        //outputing method
        System.out.println(sum(3,4) + sum(2,3));

        System.out.println("message2 ");
        
    }
    //Method without parameters
    /*modifiers Type methodName(arguments) -> header of the method
     *      Code body
     *      return;
    */
    public static void sayHi() { 
        // void - a method that doesn't return a value
        //public - a method that can be accessed outside the class
        //static - a method that can be called without creating an object. Able to call this method from inside the main method
        System.out.println("Hi"); //body of the method
        return; //don't forget
    }

    //Value RETURNING method (with parameters)
    public static int sum(int x, int y) {
        int sum = x +y;
        return sum; //keyword that can be used to return a value from a method
    }

}
