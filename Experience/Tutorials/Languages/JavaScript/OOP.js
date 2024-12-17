
//Classes (OOP) in contrast to Procedural programming
/*4 Pillars of OOP (EAIP)
 * Encapsulation - reduce complexity, increase scalability and security
 * Abstraction - simpler interface and reduce impact of changes/updates
 * Inheritance - prevents redundant code
 * Polymorphism - refactor ugly switch/case statements
 * 
 * Brief Explanation: a method is a function in a class
 * "f(x)" in which f() is a method and x is a parameter or argument
 * class = a blueprint/template for an object
 */

//Encapsulation
    //Procedural approach
    let baseSalary = 20_000;
    let overtime = 10;
    let rate = 20;
    function getWage(baseSalary, overtime, rate) {
        return baseSalary + (overtime * rate);
    }

    //OOP approach
    let employee  = { //employee is an object
        baseSalary2: 20_000,
        overtime2: 10,
        rate2: 20,
        getWage: function() { //declaring function's arguments to return statement
            return this.baseSalary2 + (this.overtime2 * this.rate2);
        }
    }//Note: "The best functions are those with no parameters" - Robert C. Martin

//Abstraction

//Inheritance

//Polymorphism

