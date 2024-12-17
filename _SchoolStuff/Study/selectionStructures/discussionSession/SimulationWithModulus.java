package _SchoolStuff.Study.selectionStructures.discussionSession;

public class SimulationWithModulus {
    int a=5, b=2, c=4, r = 0;

    if(a>3) { 
        if(b<=a) { //t
        r=b++ - --a + c--; 
            if(r%2==0) {  //t
            r++; 
            c++; 
            } 
            else { 
            --r; 
            b+=c++; 
            } 
        } 
        System.out.println("The value of r="+ ++r); 
    } 
    System.out.println("The value of r= " + r); 
    System.out.println("The value of c= " + c); 
    System.out.println("The value of b= " + b); 
}
