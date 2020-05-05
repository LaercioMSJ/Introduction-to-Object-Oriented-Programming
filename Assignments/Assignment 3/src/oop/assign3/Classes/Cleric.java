package oop.assign3.Classes;

import javax.swing.*;

public class Cleric extends Character {

    // Declares cleric properties
    private int hitPoints;
    private int defense;
    private int agility;
    private int baseAttack;
    private ImageIcon clericImage;


    // Constructor Method
    public Cleric(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name);
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;

        // Sets image for cleric
        clericImage = new ImageIcon(this.getClass().getResource("/image/Cleric.jpg"));
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


    public ImageIcon getClericImage() {
        return clericImage;
    }

    public void setClericImage(ImageIcon clericImage) {
        this.clericImage = clericImage;
    }


    // showAllStats method to return the player stats
    @Override
    public String showAllStats() {
        return "Player: " + super.getName() + "\n------------------\nClass: Cleric\nHP: " + this.hitPoints +
                "\tDefense: " + this.defense + "\tAgility: " + this.agility + "\tBase Attack: " + this.baseAttack +
                "\n" + super.showAllStats();
    }


    // Cleric's implementation of the inherited getCharacterDescription() method
    @Override
    public String getCharacterDescription() {
        return "Clerics are often dwarves. Have higher HP and defense but low agility.";
    }
}