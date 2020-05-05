package oop.assign3.Classes;

import javax.swing.*;

public class Weapon {

    private String weaponName;
    private int weaponAttackModifier;
    private int weaponWeight;
    private String weaponDescription;
    private ImageIcon weaponImage;

    public Weapon(String weaponName, int weaponAttackModifier, int weaponWeight, String weaponDescription) {
        this.weaponName = weaponName;
        this.weaponAttackModifier = weaponAttackModifier;
        this.weaponWeight = weaponWeight;
        this.weaponDescription = weaponDescription;

        // Sets image for weapon
        weaponImage = new ImageIcon(this.getClass().getResource("/image/" + getWeaponName() + ".jpg"));
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String name) {
        this.weaponName = name;
    }


    public int getWeaponAttackModifier() {
        return weaponAttackModifier;
    }

    public void setWeaponAttackModifier(int attackModifier) {
        this.weaponAttackModifier = attackModifier;
    }


    public int getWeaponWeight() {
        return weaponWeight;
    }

    public void setWeaponWeight(int weight) {
        this.weaponWeight = weight;
    }


    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String description) {
        this.weaponDescription = description;
    }


    public ImageIcon getWeaponImage() {
        return weaponImage;
    }

    public void setWeaponImage(ImageIcon image) {
        this.weaponImage = image;
    }
}
