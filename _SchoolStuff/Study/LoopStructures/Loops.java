package _SchoolStuff.Study.LoopStructures;

import java.util.Scanner;
//remember the counting starts with the declared 
public class Loops {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x = 0;
		while (x < 3) {	//as long as true, the loop still going until its false	
			System.out.println("I love while loops");
			x++; //update
		}
		System.out.println("Done!");
		
		for (x = 0; x <= 4; x++) {  // one liner 
			System.out.println("I love for loops");
		}
		
		int counter = 3;
		while (!(counter >=1)) { //edge case 1 (countdown) 
			// if negation (!) nothing will come out
			System.out.println("I love definite loop");
			counter--;
		}
		
	}
}
