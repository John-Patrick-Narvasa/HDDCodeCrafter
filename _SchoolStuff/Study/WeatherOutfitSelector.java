package _SchoolStuff.Study;

import java.util.Scanner;
import java.text.DecimalFormat;

public class WeatherOutfitSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");

        double temp;
        String weather = "";
        String clothes = "";

        intro();

        System.out.print("\nEnter temperature (in Celsius): ");
        temp = input.nextDouble();

        System.out.print("Enter the weather: ");

        weather = weather.toLowerCase();

        if (temp > 25) {
            System.out.println("Sunny, rainy, or cold?");
            weather = input.next();
            if (weather.equals("sunny")) {
                clothes = "light jacket and jeans";
            }
            else if (weather.equals("rainy")) {
                clothes = "raincoat and waterproof shoes";
            }
            else if (weather.equals("cold")) {
                clothes = "sweater and pants";
            }
        }

        else if (temp < 15) {
            System.out.println("Snowy or cold?");
            weather = input.next();
            if (weather.equals("snowy")) {
                clothes = "heavy coat, gloves, and a hat";
            }
            else if (weather.equals("cold")) {
                clothes = "warm jacket and boots";
            }
            else {
                System.out.println("Dress warmly, as it's quite cold");
            }
        }

        else {
            clothes = "casual clothes";
        }
        System.out.println("Wear a " + clothes + " since the temperature is " + df.format(temp) + " degrees Celsius");
    }

    public static String intro()  {
        System.out.println("\nHello there, we are here to recommend what clothes to wear in a certain temperature :)");
        return "";
    }
}