package oop.assign3.Classes;

import javax.swing.*;

public class Monster {

    // Declares monster properties
    private String monsterName;
    private int monsterHitPoints;
    private int monsterDefense;
    private int monsterAgility;
    private int monsterBaseAttack;
    private ImageIcon monsterImage;


    // Constructor Method
    public Monster(String monsterName, int monsterHitPoints, int monsterDefense, int monsterAgility, int monsterBaseAttack) {
        this.monsterName = monsterName;
        this.monsterHitPoints = monsterHitPoints;
        this.monsterDefense = monsterDefense;
        this.monsterAgility = monsterAgility;
        this.monsterBaseAttack = monsterBaseAttack;

        // Sets image for monster
        monsterImage = new ImageIcon(this.getClass().getResource("/image/" + getMonsterName() + ".jpg"));
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String name) {
        this.monsterName = name;
    }


    public int getMonsterHitPoints() {
        return monsterHitPoints;
    }

    public void setMonsterHitPoints(int hitPoints) {
        this.monsterHitPoints = hitPoints;
    }


    public int getMonsterDefense() {
        return monsterDefense;
    }

    public void setMonsterDefense(int defense) {
        this.monsterDefense = defense;
    }


    public int getMonsterAgility() {
        return monsterAgility;
    }

    public void setMonsterAgility(int agility) {
        this.monsterAgility = agility;
    }


    public int getMonsterBaseAttack() {
        return monsterBaseAttack;
    }

    public void setMonsterBaseAttack(int baseAttack) {
        this.monsterBaseAttack = baseAttack;
    }


    public ImageIcon getMonsterImage() {
        return monsterImage;
    }

    public void setMonsterImage(ImageIcon image) {
        this.monsterImage = image;
    }


    // showMonsterAllStats method to return the monster stats
    public String showMonsterAllStats() {
        return "Monster: " + this.monsterName + "\n------------------\nHP: " + this.monsterHitPoints +
                "\tDefense: " + this.monsterDefense + "\tAgility: " + this.monsterAgility + "\tBase Attack: " + this.monsterBaseAttack;
    }
}
