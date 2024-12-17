
//Classes (OOP) in contrast to Procedural programming
/*4 Pillars of OOP (EAIP)
 * Encapsulation
 * Abstraction
 * Inheritance
 * Polymorphism
 * 
 * Brief Explanation: a method is a function in a class
 * "f(x)" in which f() is a method and x is a parameter or argument
 * class = a blueprint/template for an object
 */
public class YOO_HOO { 
    public static void main(String[] args) {
        //object = an instance of a class that may contain attributes and methods
        //construct an instance of another class
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.brand);
        System.out.println(myCar1.model);
        System.out.println(" ");
        System.out.println(myCar2.brand);
        System.out.println(myCar2.model);    

        myCar1.drive();
        myCar1.brake();
    }
}


