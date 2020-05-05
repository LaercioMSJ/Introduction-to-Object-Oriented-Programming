/*
Description: Program – Fantasy Hockey
You have been asked to write a Java console application to track and gather statistics for a fantasy hockey league.

Project: Assign1
Introduction to Object Oriented Programming - Yousef Abu Baker - PROG1400
Language: Java
Author: Laercio W0433181
Date: 02/22/2020
Filename: Team.java
Other classes in the same project:
    Main.java
    Player.java
*/

public class Team {

    //Properties
    String teamName;
    int teamNumberOfGoals;
    int teamNumberOfAssists;
    int totalGoalsAndAssistsTeam;
    double teamBudget;

    //Constructor Method
    public Team(String teamName, int teamNumberOfGoals, int teamNumberOfAssists, int totalGoalsAndAssistsTeam, double teamBudget) {
        this.teamName = teamName;
        this.teamNumberOfGoals = teamNumberOfGoals;
        this.teamNumberOfAssists = teamNumberOfAssists;
        this.totalGoalsAndAssistsTeam = totalGoalsAndAssistsTeam;
        this.teamBudget = teamBudget;
    }

    //Actions Methods
    public void outputTeamDetails() {
        System.out.printf(this.teamName + ":\tG - " + this.teamNumberOfGoals + "\tA - " + this.teamNumberOfAssists + "" +
                "\tTotal - " + this.totalGoalsAndAssistsTeam + "\tBudget - $%.2f\n", (this.teamBudget));
    }

    public void outputTeamRating() {
        if (totalGoalsAndAssistsTeam > 20) {
            System.out.print("Rating: *** stars\n");
        }

        else if (totalGoalsAndAssistsTeam >= 10) {
            System.out.print("Rating: ** stars\n");
        }

        else if (totalGoalsAndAssistsTeam > 0) {
            System.out.print("Rating: * star\n");
        }

        else {
            System.out.print("Rating: 0 stars\n");
        }
    }
}
