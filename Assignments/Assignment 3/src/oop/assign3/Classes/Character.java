package oop.assign3.Classes;

public abstract class Character {

    // Declares properties of all characters
    private String name;
    private Weapon weapon;


    // Constructor Method
    public Character (String name) {
        this.name = name;
        this.weapon = weapon;
    }


    // Actions Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    // Defines a getCharacterDescription() method, to be inherited by subclasses
    public abstract String getCharacterDescription();


    public String showAllStats() {
        return  "Weapon: " + getWeapon().getWeaponName() + "\tWeight: " + getWeapon().getWeaponWeight() + "\tAttack Mod: " + getWeapon().getWeaponAttackModifier() + "\n";
    }
}
