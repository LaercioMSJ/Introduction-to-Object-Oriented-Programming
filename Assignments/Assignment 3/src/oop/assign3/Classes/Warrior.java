package oop.assign3.Classes;

import javax.swing.*;

public class Warrior extends Character {

    // Declares warrior properties
    private int hitPoints;
    private int defense;
    private int agility;
    private int baseAttack;
    private ImageIcon warriorImage;


    // Constructor Method
    public Warrior(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name);
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;

        // Sets image for warrior
        warriorImage = new ImageIcon(this.getClass().getResource("/image/Warrior.jpg"));
    }


    // Actions Methods
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }


    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }


    public ImageIcon getWarriorImage() {
        return warriorImage;
    }

    public void setWarriorImage(ImageIcon warriorImage) {
        this.warriorImage = warriorImage;
    }


    // showAllStats method to return the player stats
    @Override
    public String showAllStats() {
        return "Player: " + super.getName() + "\n------------------\nClass: Warrior\nHP: " + this.hitPoints +
                "\tDefense: " + this.defense + "\tAgility: " + this.agility + "\tBase Attack: " + this.baseAttack +
                "\n" + super.showAllStats();
    }


    // Warrior's implementation of the inherited getCharacterDescription() method
    @Override
    public String getCharacterDescription() {
        return "Fighters are often human. Have higher HP and defence but low agility.";
    }
}