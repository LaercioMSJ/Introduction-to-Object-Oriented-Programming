/*
Description: Program – Fantasy Hockey
You have been asked to write a Java console application to track and gather statistics for a fantasy hockey league.

Project: Assign1
Introduction to Object Oriented Programming - Yousef Abu Baker - PROG1400
Language: Java
Author: Laercio W0433181
Date: 02/22/2020
Filename: Main.java
Other classes in the same project:
    Player.java
    Team.java
*/

import java.util.Scanner;  // Import the Scanner class
import java.util.Random;   // Import the Random class

public class Main {
    public static void main (String[] args) {

        Random random = new Random();                 // Creates a Random object

        Team[] myTeams = new Team[3];                 // Declares array of Team objects (size 3)
        Player[][] myPlayers = new Player[3][4];      // Declares array of Player objects (size 3 x 4)
        String[] teamNameArray = new String[3];       // Declares array of String to retain the teams' names
        String playerName;                       // Declares a String to retain the name for each player
        int playerGoals;                          // Declares an integer type variable to retain the number of goals for each player
        int playerAssists;                        // Declares an integer type variable to retain the number of assists for each player
        int totalTeamGoal;                        // Declares an integer type variable to retain the total number of goals for each team
        int totalTeamAssist;                      // Declares an integer type variable to retain the total number of assists for each team
        int totalGoalsAndAssistsTeam ;             // Declares an integer type variable to retain the total number of goals and assists for each team


        System.out.print("FANTASY HOCKEY APPLICATION\n");          // Shows welcome message

        System.out.print("\nTEAM ENTRY\n");
        System.out.print("================================\n");

        for (int i=0; i < teamNameArray.length; i++) {             // Loop used to prompt the user to enter the name for each team
            teamNameArray[i] = getValidation("\nEnter name with at least 3 letters for team # " + (i + 1) + ": ");    // Example of using Method Overloading
        }


        System.out.print("\nPLAYER ENTRY\n");
        System.out.print("================================\n");

        for (int i=0; i < myPlayers.length; i++) {                 // Loop used to prompt the user to enter the name, number of goals and assists for each player

            totalTeamGoal = 0;
            totalTeamAssist = 0;
            totalGoalsAndAssistsTeam = 0;

            System.out.print("\nEnter players for " + teamNameArray[i] + ": \n");

            for (int j=0; j < myPlayers[i].length; j++) {

                playerName = "";                       // Assigns "" to playerName and -1000 for playerGoals and playerAssists to facilitate error identification.
                playerGoals = -1000;                   // If the program doesn't call the getValidation method, the program can keep the values entered by the user
                playerAssists = -1000;                 // for the previous player and this way the program will assign a wrong value to the next player.
                                                       // If the program assigns the large number that was passed, it will be easy for the user to identify the error.

                playerName = getValidation("\nEnter name with at least 3 letters for the " + teamNameArray[i] + " player # " + (j+1) + ": ");   // Example of using Method Overloading

                playerGoals = getValidation("\nEnter number of goals for " + playerName + ": ", "goals");                   // Example of using Method Overloading

                playerAssists = getValidation("\nEnter number of assists for " + playerName + ": ", "assists");             // Example of using Method Overloading

                //Create Player object and Add each Player object to the array of Player objects called myPlayers
                myPlayers[i][j] = new Player(playerName, playerGoals, playerAssists);

                totalTeamGoal += playerGoals;                   // Adds the number of goals of all players of the same team
                totalTeamAssist += playerAssists;               // Adds the number of assists of all players of the same team
            }

            totalGoalsAndAssistsTeam = totalTeamGoal + totalTeamAssist;   // Sums the total number of goals and assists of all players of the same team

            //Create Team object and Add each Team object to the array of Team objects called myTeams
            myTeams[i] = new Team(teamNameArray[i], totalTeamGoal, totalTeamAssist, totalGoalsAndAssistsTeam, random.nextDouble() * 100000);
        }


        System.out.print("\nREPORT: Stats per Team\n");
        System.out.print("================================\n");

        for (int i=0; i < myTeams.length; i++) {    // Loop used to show the stats one team at a time
            myTeams[i].outputTeamDetails();         // Calls method outputTeamDetails from class Team to show Team Status assigning one team at a time
            myTeams[i].outputTeamRating();          // Calls method outputTeamRating from class Team to show Team Rating assigning one team at a time
        }

        System.out.print("\nREPORT: Stats per Player\n");
        System.out.print("================================\n");

        for (int i=0; i < myTeams.length; i++) {              // Loop used to show the player stats one team at a time

            for (int j=0; j < myPlayers[i].length; j++) {     // Loop used to show the player stats one player at a time
                System.out.print(teamNameArray[i] + "\n");    // Shows the name of the team to which the player belongs
                myPlayers[i][j].outputPlayerDetails();        // Calls method outputTeamDetails from class Team to show Team Status assigning one team at a time
            }

            System.out.print("\n");
        }
    }


    // Repeat validation until user enters a valid name
    public static String getValidation(String message) {        // Example of using Method Overloading

        Scanner reader = new Scanner(System.in);                // Create a Scanner object
        String input = null;
        int charIsNotSpace = 0;

        do {
            System.out.print(message);

            while (!reader.hasNextLine()) {   // I think that the program never enters this while because .hasNextLine identifies
                System.out.print("Please enter a valid name with at least 3 characters");        // any type of input as a valid
                reader.next();           // value, including "enter" and space, but it is like this in the "PPT Input Validation"
            }

            input = reader.nextLine();

            for (int i=0; i < input.length(); i++) {  // checks if at least three characters are not space
                if (input.charAt(i) != ' ') {
                    charIsNotSpace ++;
                }
            }

        } while (input == null || input.equals("") || input.length() < 3 || charIsNotSpace < 3); //While the input value is not a null value or empty string or least 3 characters.

        // Loop used to capitalize the first letter of the name and without using any other auxiliary class, such as the StringBuilder
        String letter = "";
        String capitalizedName = "";
        boolean isFirstLetter;
        for (int i=0; i < input.length(); i++) {

            isFirstLetter = false;

            if (i == 0) {
                while (input.charAt(i) == ' ') {     // Ignores spaces that the user typed before the first letter of the name
                    i++;
                }
                isFirstLetter = true;
            }

            if (input.charAt(i) == ' ' && (i+1) < input.length()) {
                if (input.charAt(i) == ' ' && input.charAt(i + 1) == ' ') {
                    letter = "";
                } else {
                    letter += " " + input.charAt(i + 1);
                    capitalizedName += letter.toUpperCase();
                    i++;
                    letter = "";
                }
            }
            else if (isFirstLetter == true) {
                letter += input.charAt(i);
                capitalizedName += letter.toUpperCase();
                letter = "";
            }
            else if (input.charAt(i) != ' ') {
                letter += input.charAt(i);
                capitalizedName += letter.toLowerCase();
                letter = "";
            }
        }

        return capitalizedName;
    }


    // Repeat validation until user enters a valid POSITIVE number
    // I changed the example validation of the "PPT Input Validation" so that the program also understands the entry of spaces and "enters" as an error
    public static int getValidation(String message, String description) {         // Example of using Method Overloading

        Scanner reader = new Scanner(System.in); // Create a Scanner object
        int number = -1;
        String input = null;

        System.out.print(message);

        while (number < 0) {
            input = reader.nextLine();

            try {
                number = Integer.parseInt(input);

                if (Integer.parseInt(input) < 0) {
                    System.out.print("\nPlease, enter a positive integer of " + description + ": ");
                }
            }
            catch (NumberFormatException ex) {
                System.out.print("\nPlease, enter a number of " + description + ": ");
            }
        }

        return number;
    }
}
