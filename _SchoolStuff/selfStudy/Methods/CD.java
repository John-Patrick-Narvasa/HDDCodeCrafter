package _SchoolStuff.selfStudy.Methods;

public class CD {
    public static void main(String[] args) {
        double diameter = 120.0;
        double radius = 0.0;

        String output = "";

        radius = diameter/2.0;

        output += "Circumference is ";
        output += solveCircumference(radius);
        output += " mm";

        output += "\nSurface area of CD is ";
        output += solveAreaCD(solveAreaCircle(radius), solveAreaCircle((diameter*0.125)/2.0));
        output += " sqr mm";
        System.out.println(output);
    }

    public static double solveCircumference(double rad) {
        return 2.0 * 3.1416 * rad;
    }
    public static double solveAreaCircle(double r) {
        return 3.1416 * r * r;
    }
    public static double solveAreaCD (double outer, double inner) {
        return outer - inner;
    }
}
