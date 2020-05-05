import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] letterGradesArray = {"A", "B", "C", "D", "F"};
        String[] numericGradesArray = {"4", "3", "2", "1", "0"};
        String numericGrade = "No Value", letterGrade = "No Value";

        while (!letterGrade.equals("A") && !letterGrade.equals("B") && !letterGrade.equals("C") && !letterGrade.equals("D") && !letterGrade.equals("F")) {
            System.out.println("Enter a letter grade (A,B,C,D or F): ");
            letterGrade = sc.nextLine();
            letterGrade = letterGrade.toUpperCase();
        }

        for (int i=0; i < letterGradesArray.length; i++) {
            if (letterGrade.equals(letterGradesArray[i])) {
                numericGrade = numericGradesArray[i];
            }
        }

        System.out.println("\nYour corresponding numeric grade is " + numericGrade);

    }
}