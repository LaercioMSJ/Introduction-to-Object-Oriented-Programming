import java.util.Scanner;

public class CoffeeShopPart2 {

    public static void main(String[] args) {

        // Instantiates Scanner
        Scanner reader = new Scanner(System.in);

        // Declares variables
        double priceCoffeeCup = 1.25;
        double pricePieceCake = 3.25;
        double tax = 1.15;

        // Shows welcome message
        System.out.print("Welcome to the Coffee Shop!\n");

        // Declaration of coffeeCups variable with input of a int value via keyboard
        System.out.print("\nEnter the number of cups:");
        int coffeeCups = reader.nextInt();

        // Declaration of cakePieces variable with input of a int value via keyboard
        System.out.print("Enter the number of pieces of cake:");
        int cakePieces = reader.nextInt();

        // Declaration of pretaxTotalCoffee variable as double value with pretax total coffee calculation
        double pretaxTotalCoffee = coffeeCups * priceCoffeeCup;

        // Declaration of pretaxTotalCake variable as double value with pretax total cake calculation
        double pretaxTotalCake = cakePieces * pricePieceCake;

        // Declaration of pretaxFinalTotal variable as double value with pretax final total calculation
        double pretaxFinalTotal = pretaxTotalCoffee + pretaxTotalCake;

        // Shows on-screen sentence contained within quotation marks and the value contained in the variable pretaxFinalTotal
        System.out.printf("\nYour pretax total is $ %.2f", (pretaxFinalTotal));

        // Declaration of finalTotal variable as double value with final total calculation
        double finalTotal = pretaxFinalTotal * tax;

        // Shows on-screen sentence contained within quotation marks and the value contained in the variable finalTotal
        System.out.printf("\nYour final total is  $ %.2f", (finalTotal));
    }

}