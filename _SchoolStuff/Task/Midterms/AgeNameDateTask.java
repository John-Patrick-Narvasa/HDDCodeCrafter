package _SchoolStuff.Task.Midterms;
import java.util.Scanner;
public class AgeNameDateTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age, year, birthYear;

        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter birth year:");
        birthYear = input.nextInt();

        age = ageCalculate(year,birthYear);

        System.out.println(name + ", your age in " + year + " is " + age);

        input.close();
    }

    public static int ageCalculate(int year, int birthYear) {
        return year - birthYear;
    }
}