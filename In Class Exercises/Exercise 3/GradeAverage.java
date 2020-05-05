import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        // Instantiates Scanner
        Scanner reader = new Scanner(System.in);

        // Declares variables
        String answer = "y";
        int numberOfMarks = 0;
        double average = 0.0, mark = 0.0, totalGrade = 0.0;

        // Shows welcome message
        System.out.print("Welcome to the Grade Average Calculator!\n");

        while (answer.equals("y")) {

            // Declaration of mark variable with input of a double value via keyboard
            System.out.print("\nEnter a mark: ");
            mark = reader.nextDouble();

            totalGrade = mark + totalGrade;

            answer = "null";

            while (!answer.equals("y") && !answer.equals("n")) {

                System.out.print("\nAnother one (y/n): ");
                answer = reader.next();

            }

            numberOfMarks = numberOfMarks + 1;

        }

        average = totalGrade / numberOfMarks;

        System.out.printf("\nThe average is %.2f", (average));
    }

}