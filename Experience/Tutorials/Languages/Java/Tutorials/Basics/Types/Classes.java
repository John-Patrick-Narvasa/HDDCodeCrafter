package Java.Tutorials.Basics.Types;

//Classes (OOP) in contrast to Procedural programming
//AKA DIY data types
/*4 Pillars of OOP (EAIP)
 * Encapsulation
 * Abstraction
 * Inheritance
 * Polymorphism
 * 
 * Brief Explanation: a method is a function in a class
 * "f(x)" in which f() is a method and x is a parameter or argument
 * class = a blueprint/template for an object
 *
 * Can be reused if at the same directory 
 */

public class Classes { //Let Classes = Car //Car is an object
    // declaration of the object/ making your own data type
    String brand = "Ford";
    String model = "Mustang";
    int year = 1969;
    String color = "red";
    double price = 50000.00;

    //method for drive
    void drive() {
        System.out.println("You drive the car");
    }
    //method for brake
    void brake() {
        System.out.println("You step on the brakes");
    }
    //
    public static void main(String[] args) {
        //object = an instance of a class that may contain attributes and methods
        //construct an instance of another class
        Classes myCar1 = new Classes(); //
        Classes myCar2 = new Classes();

        System.out.println(myCar1.brand);
        System.out.println(myCar1.model);
        System.out.println(" ");
        System.out.println(myCar2.brand);
        System.out.println(myCar2.model);    

        myCar1.drive();
        myCar1.brake();
    }
}

//ANOTHER EXAMPLE (in javascript)
/*
   ///Procedural approach
    let baseSalary = 20_000;
    let overtime = 10;
    let rate = 20;
    function getWage(baseSalary, overtime, rate) {
        return baseSalary + (overtime * rate);
    }

    ///OOP approach
    let employee  = { //employee is an object
        baseSalary2: 20_000,
        overtime2: 10,
        rate2: 20,
        getWage: function() { //declaring function's arguments to return statement
            return this.baseSalary2 + (this.overtime2 * this.rate2);
        }
    }//Note: "The best functions are those with no parameters" - Robert C. Martin
 */