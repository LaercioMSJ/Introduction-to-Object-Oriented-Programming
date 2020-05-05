import java.util.Scanner;

public class Increment {

    public static void main(String[] args) {

        // Instantiates Scanner
        Scanner reader = new Scanner(System.in);

        // Declares variables
        String charSymbol = "y", charsIncrement = "", charsDecrement;
        int charsNumber = 0;

        // Shows welcome message
        System.out.print("Welcome to the Increment and Decrement Program!\n");

        System.out.print("\nHow many chars do you want to show on screen? ");
        charsNumber = reader.nextInt();

        System.out.print("\nEnter a char: ");
        charSymbol = reader.next();

        for (int i = 1; i <= charsNumber; i++) {

            charsIncrement += charSymbol;

            System.out.println(charsIncrement);

        }

        for (int i = charsNumber; i >= 0; i--) {

            charsDecrement = "";

            for (int counter = 0; counter <= i; counter++) {

                charsDecrement += charSymbol;

            }

            System.out.println(charsDecrement);

        }

    }
}


