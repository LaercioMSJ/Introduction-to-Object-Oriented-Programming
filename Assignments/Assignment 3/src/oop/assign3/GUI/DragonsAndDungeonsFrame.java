package oop.assign3.GUI;

import oop.assign3.Classes.Warrior;
import oop.assign3.Classes.Wizard;
import oop.assign3.Classes.Cleric;
import oop.assign3.Classes.Weapon;
import oop.assign3.Classes.Monster;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DragonsAndDungeonsFrame extends JFrame {

    // Creates "default" characters objects with "default" values. These objects are not changed throughout the game. They are just read.
    private static Warrior defaultWarrior = new Warrior(null, 100, 60, 40, 20);
    private static Wizard defaultWizard = new Wizard(null, 60, 40, 100, 6);
    private static Cleric defaultCleric = new Cleric(null, 80, 80, 90, 14);

    // Creates characters objects that have status that can change throughout the game
    private static Warrior theWarrior;
    private static Wizard theWizard;
    private static Cleric theCleric;

    private static ArrayList<Weapon> weapons = new ArrayList<>();
    private static int selectedWeapon = 0;

    private static ArrayList<Monster> monsters = new ArrayList<>();
    private static int selectedMonster = 0;

    private static boolean isValidated;

    // Constructor
    public DragonsAndDungeonsFrame() {

        // Creates list of weapon objects
        Weapon dagger = new Weapon("Dagger", 2, 5, "A dagger is dagger is light and fast.");
        Weapon sword = new Weapon("Sword", 5, 10, "A sword is a good all-round weapon. It is not too heavy and inflicts a lot of damage.");
        Weapon hammer = new Weapon("Hammer", 10, 20, "Hammer is heavy but does a lot of damage.");

        weapons.add(dagger);
        weapons.add(sword);
        weapons.add(hammer);

        // Creates list of monster objects
        Monster gazer = new Monster("Gazer", 50, 40, 50, 30);
        Monster skeleton = new Monster("Skeleton", 60, 30, 70, 20);
        Monster dragon = new Monster("Dragon", 100, 60, 40, 80);

        monsters.add(gazer);
        monsters.add(skeleton);
        monsters.add(dragon);

        // Sets characters objects with the values contained in the "default" characters objects to be used in the game
        setAllCharactersToDefaultValues();

        // Sets title, background, size, layout of window, make visible to JFrame
        setTitle("DND Game");

        setBounds(400, 200, 800, 800);
        setLayout(new CardLayout(1,1));
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        // Adds Panel "screens"
        SplashScreen screen1 = new SplashScreen();
        CharacterCreationScreen screen2 = new CharacterCreationScreen();
        BattleSummaryScreen screen3 = new BattleSummaryScreen();
        add(screen1);
        add(screen2);
        add(screen3);

        // Sets btnBuildChar
        JButton btnBuildChar = screen1.getBtnBuildChar();
        btnBuildChar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                screen1.setVisible(false);
                screen2.setAllComponentsToNull();
                screen2.setVisible(true);
                screen3.setVisible(false);
            }
        });

        // Sets btnStartBattle
        JButton btnStartBattle = screen2.getBtnStartBattle();
        btnStartBattle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                isValidated = false;
                isValidated = screen2.inputValidation();

                if (isValidated) {
                    screen1.setVisible(false);
                    screen2.setVisible(false);
                    screen2.createCharacter();
                    screen3.showPlayerImage();
                    screen3.chooseRandomMonster();
                    screen3.showMonsterImage();
                    screen3.displayBattleResult();
                    screen3.setVisible(true);
                }
            }
        });

        // Sets btnPlayAgain
        JButton btnPlayAgain = screen3.getBtnPlayAgain();
        btnPlayAgain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                screen1.setVisible(false);
                setAllCharactersToDefaultValues();
                screen2.setAllComponentsToNull();
                screen2.setVisible(true);
                screen3.setVisible(false);
            }
        });
    }

    // Sets characters objects with the values contained in the "default" characters objects to be used in the game
    public static void setAllCharactersToDefaultValues() {
        theWarrior = new Warrior(defaultWarrior.getName(), defaultWarrior.getHitPoints(), defaultWarrior.getDefense(), defaultWarrior.getAgility(), defaultWarrior.getBaseAttack());
        theWizard = new Wizard(defaultWizard.getName(), defaultWizard.getHitPoints(), defaultWizard.getDefense(), defaultWizard.getAgility(), defaultWizard.getBaseAttack());
        theCleric = new Cleric(defaultCleric.getName(), defaultCleric.getHitPoints(), defaultCleric.getDefense(), defaultCleric.getAgility(), defaultCleric.getBaseAttack());
    }

    public static Warrior getTheWarrior() {
        return theWarrior;
    }

    public static void setTheWarrior(int hitPoints, int defense, int agility, int baseAttack) {
        theWarrior.setHitPoints(hitPoints);
        theWarrior.setDefense(defense);
        theWarrior.setAgility(agility);
        theWarrior.setBaseAttack(baseAttack);
    }


    public static Wizard getTheWizard() {
        return theWizard;
    }

    public static void setTheWizard(int hitPoints, int defense, int agility, int baseAttack) {
        theWizard.setHitPoints(hitPoints);
        theWizard.setDefense(defense);
        theWizard.setAgility(agility);
        theWizard.setBaseAttack(baseAttack);
    }


    public static Cleric getTheCleric() {
        return theCleric;
    }

    public static void setTheCleric(int hitPoints, int defense, int agility, int baseAttack) {
        theCleric.setHitPoints(hitPoints);
        theCleric.setDefense(defense);
        theCleric.setAgility(agility);
        theCleric.setBaseAttack(baseAttack);
    }


    public static ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public static void setSelectedWeapon(int index) {
        DragonsAndDungeonsFrame.selectedWeapon = index;
    }

    public static int getSelectedWeapon() {
        return DragonsAndDungeonsFrame.selectedWeapon;
    }


    public static ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public static void setSelectedMonster(int index) {
        DragonsAndDungeonsFrame.selectedMonster = index;
    }

    public static int getSelectedMonster() {
        return DragonsAndDungeonsFrame.selectedMonster;
    }
}
