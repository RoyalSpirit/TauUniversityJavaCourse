package chapter2;

import java.util.Scanner;

public class CupsOfCoffeForSeason {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a season of the year.");
        String season = scanner.next();

        System.out.println("Please enter a whole number.");
        int number = scanner.nextInt();

        System.out.println("Please enter any adjective.");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }

}
