package _SchoolStuff.selfStudy.Methods;

import java.util.Scanner;

public class CylinderVolume {
   public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double d, h;

        System.out.print("Enter diameter: ");
        d = input.nextDouble();

        System.out.print("Enter height: ");
        h = input.nextDouble();

        System.out.println("\nLateral surface of the cylinder is " + calcLateralSurface(d, h));
        System.out.println("Volume of the cylinder is " + calcVolume(d, h));

        input.close();
   } 

   public static double calcLateralSurface(double diameter, double height){
        return 2*3.1416*(diameter/2)*(diameter/2 + height);
   }

   public static double calcVolume(double diameter, double height) {
        return 3.1416*((diameter/2)*(diameter/2))*height;
   }
}
