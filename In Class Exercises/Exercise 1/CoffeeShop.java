import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {

        // Instantiates Scanner
        Scanner reader = new Scanner(System.in);

        // Declares variables
        double priceCoffeeCup = 1.25;
        double tax = 1.15;

        // Shows welcome message
        System.out.print("Welcome to the Coffee Shop!\n");

        // Declaration of coffeeCups variable with input of a int value via keyboard
        System.out.print("\nEnter the number of cups:");
        int coffeeCups = reader.nextInt();

        // Declaration of pretaxTotal variable as double value with pretax total calculation
        double pretaxTotal = coffeeCups * priceCoffeeCup;

        // Shows on-screen sentence contained within quotation marks and the value contained in the variable pretaxTotal
        System.out.printf("\nYour pretax total is $ %.2f", (pretaxTotal));

        // Declaration of finalTotal variable as double value with final total calculation
        double finalTotal = pretaxTotal * tax;

        // Shows on-screen sentence contained within quotation marks and the value contained in the variable finalTotal
        System.out.printf("\nYour final total is  $ %.2f", (finalTotal));
    }

}