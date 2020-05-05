import java.util.Scanner;

public class ShippingCharges {

    public static void main(String[] args) {

        // Instantiates Scanner
        Scanner reader = new Scanner(System.in);

        // Declares variables
        double shippingCost = 10.00;
        double minValueWithoutCharge = 50.00;

        // Shows welcome message
        System.out.print("Welcome to the Shipping Charges Calculator!\n");

        // Declaration of totalPurchase variable with input of a double value via keyboard
        System.out.print("\nEnter the amount for your total purchase:");
        double totalPurchase = reader.nextDouble();

        // Executes an if statement to verify that the totalPurchase is less than the minValueWithoutCharge
        if (totalPurchase < minValueWithoutCharge) {
            // If the condition was true, shows on-screen sentence contained within quotation marks and the result value with shippingCost
            System.out.printf("\nYour final total including shipping costs is $ %.2f", (totalPurchase + shippingCost));
        }

        else {
            // If the condition was false, shows on-screen sentence contained within quotation marks and the result value with no shippingCost
            System.out.printf("\nYour final total is $ %.2f (Free Shipping)", (totalPurchase));
        }

    }

}