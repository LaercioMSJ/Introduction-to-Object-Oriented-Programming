package oop.assign3.Classes;

import javax.swing.*;

public class Wizard extends Character {

    // Declares wizard properties
    private int hitPoints;
    private int defense;
    private int agility;
    private int baseAttack;
    private ImageIcon wizardImage;


    // Constructor Method
    public Wizard(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name);
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;

        // Sets image for wizard
        wizardImage = new ImageIcon(this.getClass().getResource("/image/Wizard.jpg"));
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


    public ImageIcon getWizardImage() {
        return wizardImage;
    }

    public void setWizardImage(ImageIcon wizardImage) {
        this.wizardImage = wizardImage;
    }


    // showAllStats method to return the player stats
    @Override
    public String showAllStats() {
        return "Player: " + super.getName() + "\n------------------\nClass: Wizard\nHP: " + this.hitPoints +
                "\tDefense: " + this.defense + "\tAgility: " + this.agility + "\tBase Attack: " + this.baseAttack +
                "\n" + super.showAllStats();
    }


    // Wizard's implementation of the inherited getCharacterDescription() method
    @Override
    public String getCharacterDescription() {
        return "Wizards are often elves. Have lower HP and defence but high agility.";
    }
}