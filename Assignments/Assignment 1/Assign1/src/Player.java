/*
Description: Program – Fantasy Hockey
You have been asked to write a Java console application to track and gather statistics for a fantasy hockey league.

Project: Assign1
Introduction to Object Oriented Programming - Yousef Abu Baker - PROG1400
Language: Java
Author: Laercio W0433181
Date: 02/22/2020
Filename: Player.java
Other classes in the same project:
    Main.java
    Team.java
*/

public class Player {

    //Properties
    String playerName;
    int playerNumberOfGoals;
    int playerNumberOfAssists;


    //Constructor Method
    public Player(String playerName, int playerNumberOfGoals, int playerNumberOfAssists) {
        this.playerName = playerName;
        this.playerNumberOfGoals = playerNumberOfGoals;
        this.playerNumberOfAssists = playerNumberOfAssists;
    }

    //Actions Methods
    public void outputPlayerDetails() {
        int totalGoalsAndAssistsPlayer = this.playerNumberOfGoals + this.playerNumberOfAssists;
        System.out.print(this.playerName + ":\tG - " + this.playerNumberOfGoals + "\tA - " + this.playerNumberOfAssists + "\tTotal - " + totalGoalsAndAssistsPlayer + "\n");
    }

}
