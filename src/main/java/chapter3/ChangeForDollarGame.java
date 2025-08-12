package chapter3;

import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many pennies would you like?");
        int penniesQuantity = input.nextInt();

        System.out.println("How many neckies would you like?");
        int neckiesQuantity = input.nextInt();

        System.out.println("How many dimes would you like?");
        int dimesQuantity = input.nextInt();

        System.out.println("How many quarters would you like?");
        int quartersQuantity = input.nextInt();

        input.close();

        double totalSum = (penniesQuantity * 0.01) + (neckiesQuantity * 0.05) + (dimesQuantity * 0.10) + (quartersQuantity * 0.25);

        if (totalSum == 1) {
            System.out.println("Congratulations! You win the game.");
        }  else if (totalSum > 1) {
            System.out.println("Sorry, it's more than one dollar. You have exceeded the amount by: " + (totalSum - 1));
        } else if (totalSum < 1) {
            System.out.println("Sorry, it's less than one dollar. You are missing: " + (1 - totalSum));
        }

    }

}
