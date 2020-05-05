package oop.assign3.GUI;

import oop.assign3.Classes.Warrior;
import oop.assign3.Classes.Wizard;
import oop.assign3.Classes.Cleric;
import oop.assign3.Classes.Weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;   // Import the Random class

public class CharacterCreationScreen extends JPanel {

    // Creates a Random object
    Random random = new Random();

    // Some controls need to be declared at the class level, if referenced in multiple places
    private Font myFont;
    private JTextField txtFieldName;
    private JLabel labelImageCharacter;
    private JRadioButton radioWarrior;
    private JRadioButton radioWizard;
    private JRadioButton radioCleric;
    private ButtonGroup btnGroupCharacter;
    private JTextArea txtAreaCharacter;
    private JLabel labelImageWeapon;
    private JRadioButton radioDagger;
    private JRadioButton radioSword;
    private JRadioButton radioHammer;
    private ButtonGroup groupWeapon;
    private JTextArea txtAreaWeapon;
    private JTextField txtFieldHitPoints;
    private JTextField txtFieldDefense;
    private JTextField txtFieldAgility;
    private JTextField txtFieldBaseAttack;
    private JButton btnReroll;
    private JTextField txtFieldAttackModifier;
    private JTextField txtFieldWeight;
    private JButton btnStartBattle;

    private Warrior warrior = null;
    private Wizard wizard = null;
    private Cleric cleric = null;

    // Constructor
    public CharacterCreationScreen() {

        // Sets font object
        myFont = new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 20);

        // Sets Panel Properties
        setLayout(null);
        setBackground(new Color(132, 151, 214));

        // Creates all GUI objects
        // Creates lblCharacterGenerator JLabel
        JLabel lblCharacterGenerator = new JLabel("Character Generator");
        lblCharacterGenerator.setBounds(50, 20, 400, 50);
        lblCharacterGenerator.setFont(new Font("Old English Text MT", Font.BOLD, 40));

        // Creates lblEnterName JLabel
        JLabel lblEnterName = new JLabel("Enter Name");
        lblEnterName.setBounds(50, 80, 180, 30);
        lblEnterName.setFont(new Font("Old English Text MT", Font.BOLD, 28));

        // Creates txtFieldName JTextField
        txtFieldName = new JTextField();
        txtFieldName.setBounds(220, 75, 200, 40);
        txtFieldName.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 24));

        // Creates lblCharacterType JLabel
        JLabel lblCharacterType = new JLabel("Character Type");
        lblCharacterType.setBounds(50, 130, 220, 30);
        lblCharacterType.setFont(new Font("Old English Text MT", Font.BOLD, 28));

        // Creates labelImageCharacter JLabel
        labelImageCharacter = new JLabel("Select a Class");
        labelImageCharacter.setBounds(240, 180, 100, 140);

        // Creates Radio Buttons for each character
        addCharacterRadioBtn();

        // Creates txtAreaCharacter JTextArea
        txtAreaCharacter = new JTextArea();
        txtAreaCharacter.setBounds(50, 330, 400, 60);
        txtAreaCharacter.setFont(new Font("Verdana", Font.BOLD, 18));
        txtAreaCharacter.setEnabled(false);
        txtAreaCharacter.setLineWrap(true);
        txtAreaCharacter.setWrapStyleWord(true);

        // Creates lblSelectYourWeapon JLabel
        JLabel lblSelectYourWeapon = new JLabel("Select Your Weapon");
        lblSelectYourWeapon.setBounds(50, 430, 280, 30);
        lblSelectYourWeapon.setFont(new Font("Old English Text MT", Font.BOLD, 28));

        // Creates a labelImageWeapon
        labelImageWeapon = new JLabel("Select a Weapon");
        labelImageWeapon.setBounds(240, 480, 140, 140);

        // Creates Radio Buttons for each weapon
        addWeaponRadioBtn();

        // Creates txtAreaWeapon JTextArea
        txtAreaWeapon = new JTextArea();
        txtAreaWeapon.setBounds(50, 630, 400, 90);
        txtAreaWeapon.setFont(new Font("Verdana", Font.BOLD, 18));
        txtAreaWeapon.setEnabled(false);
        txtAreaWeapon.setLineWrap(true);
        txtAreaWeapon.setWrapStyleWord(true);

        // Creates lblCharacterStats JLabel
        JLabel lblCharacterStats = new JLabel("Character Stats");
        lblCharacterStats.setBounds(500, 130, 220, 30);
        lblCharacterStats.setFont(new Font("Old English Text MT", Font.BOLD, 28));

        // Creates lblHitPoints JLabel
        JLabel lblHitPoints = new JLabel("Hit Points");
        lblHitPoints.setBounds(500, 180, 155, 30);
        lblHitPoints.setFont(myFont);

        // Creates lblDefense JLabel
        JLabel lblDefense = new JLabel("Defense");
        lblDefense.setBounds(500, 220, 155, 30);
        lblDefense.setFont(myFont);

        // Creates lblAgility JLabel
        JLabel lblAgility = new JLabel("Agility");
        lblAgility.setBounds(500, 260, 155, 30);
        lblAgility.setFont(myFont);

        // Creates lblBaseAttack JLabel
        JLabel lblBaseAttack = new JLabel("Base Attack");
        lblBaseAttack.setBounds(500, 300, 155, 30);
        lblBaseAttack.setFont(myFont);

        // Creates txtFieldHitPoints JTextField
        txtFieldHitPoints = new JTextField();
        txtFieldHitPoints.setBounds(660, 180, 60, 30);
        txtFieldHitPoints.setFont(myFont);
        txtFieldHitPoints.setEnabled(false);

        // Creates txtFieldDefense JTextField
        txtFieldDefense = new JTextField();
        txtFieldDefense.setBounds(660, 220, 60, 30);
        txtFieldDefense.setFont(myFont);
        txtFieldDefense.setEnabled(false);

        // Creates txtFieldAgility JTextField
        txtFieldAgility = new JTextField();
        txtFieldAgility.setBounds(660, 260, 60, 30);
        txtFieldAgility.setFont(myFont);
        txtFieldAgility.setEnabled(false);

        // Creates txtFieldBaseAttack JTextField
        txtFieldBaseAttack = new JTextField();
        txtFieldBaseAttack.setBounds(660, 300, 60, 30);
        txtFieldBaseAttack.setFont(myFont);
        txtFieldBaseAttack.setEnabled(false);

        // Creates btnReroll JButton
        btnReroll = new JButton("Reroll");
        btnReroll.setBounds(530, 350, 150, 30);
        btnReroll.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        btnReroll.setEnabled(false);
        btnReroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int randomHitPoints = random.nextInt(101);
                int randomDefense = random.nextInt(101);
                int randomAgility = random.nextInt(101);
                int randomBaseAttack = random.nextInt(101);

                setCharacterStats(randomHitPoints, randomDefense, randomAgility, randomBaseAttack);

                txtFieldHitPoints.setText(Integer.toString(randomHitPoints));
                txtFieldDefense.setText(Integer.toString(randomDefense));
                txtFieldAgility.setText(Integer.toString(randomAgility));
                txtFieldBaseAttack.setText(Integer.toString(randomBaseAttack));
            } });

        // Creates lblWeaponStats JLabel
        JLabel lblWeaponStats = new JLabel("Weapon Stats");
        lblWeaponStats.setBounds(500, 430, 220, 30);
        lblWeaponStats.setFont(new Font("Old English Text MT", Font.BOLD, 28));

        // Creates lblAttackModifier JLabel
        JLabel lblAttackModifier = new JLabel("Attack Modifier");
        lblAttackModifier.setBounds(500, 480, 155, 30);
        lblAttackModifier.setFont(myFont);

        // Creates lblWeight JLabel
        JLabel lblWeight = new JLabel("Weight");
        lblWeight.setBounds(500, 520, 155, 30);
        lblWeight.setFont(myFont);

        // Creates txtFieldAttackModifier JTextField
        txtFieldAttackModifier = new JTextField();
        txtFieldAttackModifier.setBounds(660, 480, 60, 30);
        txtFieldAttackModifier.setFont(myFont);
        txtFieldAttackModifier.setEnabled(false);

        // Creates txtFieldWeight JTextField
        txtFieldWeight = new JTextField();
        txtFieldWeight.setBounds(660, 520, 60, 30);
        txtFieldWeight.setFont(myFont);
        txtFieldWeight.setEnabled(false);

        // Creates btnStartBattle JButton
        btnStartBattle = new JButton("Start Battle");
        btnStartBattle.setBounds(520, 650, 180, 30);
        btnStartBattle.setFont(new Font("Old English Text MT", Font.BOLD, 20));

        // Adds all GUI objects to Panel
        add(lblCharacterGenerator);
        add(lblEnterName);
        add(txtFieldName);
        add(lblCharacterType);
        add(labelImageCharacter);
        add(radioWarrior);
        add(radioWizard);
        add(radioCleric);
        add(txtAreaCharacter);
        add(lblSelectYourWeapon);
        add(labelImageWeapon);
        add(radioDagger);
        add(radioSword);
        add(radioHammer);
        add(txtAreaWeapon);
        add(lblCharacterStats);
        add(lblHitPoints);
        add(lblDefense);
        add(lblAgility);
        add(lblBaseAttack);
        add(txtFieldHitPoints);
        add(txtFieldDefense);
        add(txtFieldAgility);
        add(txtFieldBaseAttack);
        add(btnReroll);
        add(lblWeaponStats);
        add(lblAttackModifier);
        add(lblWeight);
        add(txtFieldAttackModifier);
        add(txtFieldWeight);
        add(btnStartBattle);
    }

    private void addCharacterRadioBtn() {
        // Creates radioWarrior JRadioButton
        radioWarrior = new JRadioButton("Warrior");
        radioWarrior.setBounds(50, 180, 120, 30);
        radioWarrior.setBackground(new Color(132, 151, 214));
        radioWarrior.setFont(myFont);
        radioWarrior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                warrior = DragonsAndDungeonsFrame.getTheWarrior();
                txtFieldHitPoints.setText(Integer.toString(warrior.getHitPoints()));
                txtFieldDefense.setText(Integer.toString(warrior.getDefense()));
                txtFieldAgility.setText(Integer.toString(warrior.getAgility()));
                txtFieldBaseAttack.setText(Integer.toString(warrior.getBaseAttack()));
                txtAreaCharacter.setText(warrior.getCharacterDescription());
                showCharacterImage(warrior.getWarriorImage());
                btnReroll.setEnabled(true);
            }
        });

        // Creates radioWizard JRadioButton
        radioWizard = new JRadioButton("Wizard");
        radioWizard.setBounds(50, 230, 120, 30);
        radioWizard.setBackground(new Color(132, 151, 214));
        radioWizard.setFont(myFont);
        radioWizard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                wizard = DragonsAndDungeonsFrame.getTheWizard();
                txtFieldHitPoints.setText(Integer.toString(wizard.getHitPoints()));
                txtFieldDefense.setText(Integer.toString(wizard.getDefense()));
                txtFieldAgility.setText(Integer.toString(wizard.getAgility()));
                txtFieldBaseAttack.setText(Integer.toString(wizard.getBaseAttack()));
                txtAreaCharacter.setText(wizard.getCharacterDescription());
                showCharacterImage(wizard.getWizardImage());
                btnReroll.setEnabled(true);
            }
        });

        // Creates radioCleric JRadioButton
        radioCleric = new JRadioButton("Cleric");
        radioCleric.setBounds(50, 280, 120, 30);
        radioCleric.setBackground(new Color(132, 151, 214));
        radioCleric.setFont(myFont);
        radioCleric.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cleric = DragonsAndDungeonsFrame.getTheCleric();
                txtFieldHitPoints.setText(Integer.toString(cleric.getHitPoints()));
                txtFieldDefense.setText(Integer.toString(cleric.getDefense()));
                txtFieldAgility.setText(Integer.toString(cleric.getAgility()));
                txtFieldBaseAttack.setText(Integer.toString(cleric.getBaseAttack()));
                txtAreaCharacter.setText(cleric.getCharacterDescription());
                showCharacterImage(cleric.getClericImage());
                btnReroll.setEnabled(true);
            }
        });

        // Creates a group for radio buttons
        btnGroupCharacter = new ButtonGroup();
        btnGroupCharacter.add(radioWarrior);
        btnGroupCharacter.add(radioWizard);
        btnGroupCharacter.add(radioCleric);
    }

    public void showCharacterImage(ImageIcon imgCharacter) {
        labelImageCharacter.setIcon(imgCharacter);
    }

    private void addWeaponRadioBtn() {
        // Creates radioDagger JRadioButton
        Weapon dagger = DragonsAndDungeonsFrame.getWeapons().get(0);
        radioDagger = new JRadioButton(dagger.getWeaponName());
        radioDagger.setBounds(50, 480, 120, 30);
        radioDagger.setBackground(new Color(132, 151, 214));
        radioDagger.setFont(myFont);
        radioDagger.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DragonsAndDungeonsFrame.setSelectedWeapon(0);
                txtFieldAttackModifier.setText(Integer.toString(dagger.getWeaponAttackModifier()));
                txtFieldWeight.setText(Integer.toString(dagger.getWeaponWeight()));
                txtAreaWeapon.setText(dagger.getWeaponDescription());
                showWeaponImage(dagger.getWeaponImage());
            }
        });

        // Creates radioSword JRadioButton
        Weapon sword = DragonsAndDungeonsFrame.getWeapons().get(1);
        radioSword = new JRadioButton(sword.getWeaponName());
        radioSword.setBounds(50, 530, 120, 30);
        radioSword.setBackground(new Color(132, 151, 214));
        radioSword.setFont(myFont);
        radioSword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DragonsAndDungeonsFrame.setSelectedWeapon(1);
                txtFieldAttackModifier.setText(Integer.toString(sword.getWeaponAttackModifier()));
                txtFieldWeight.setText(Integer.toString(sword.getWeaponWeight()));
                txtAreaWeapon.setText(sword.getWeaponDescription());
                showWeaponImage(sword.getWeaponImage());
            }
        });

        // Creates radioHammer JRadioButton
        Weapon hammer = DragonsAndDungeonsFrame.getWeapons().get(2);
        radioHammer = new JRadioButton(hammer.getWeaponName());
        radioHammer.setBounds(50, 580, 120, 30);
        radioHammer.setBackground(new Color(132, 151, 214));
        radioHammer.setFont(myFont);
        radioHammer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                DragonsAndDungeonsFrame.setSelectedWeapon(2);
                txtFieldAttackModifier.setText(Integer.toString(hammer.getWeaponAttackModifier()));
                txtFieldWeight.setText(Integer.toString(hammer.getWeaponWeight()));
                txtAreaWeapon.setText(hammer.getWeaponDescription());
                showWeaponImage(hammer.getWeaponImage());
            }
        });

        // Creates a group for radio buttons
        groupWeapon = new ButtonGroup();
        groupWeapon.add(radioDagger);
        groupWeapon.add(radioSword);
        groupWeapon.add(radioHammer);
    }

    public void showWeaponImage(ImageIcon imgWeapon) {
        labelImageWeapon.setIcon(imgWeapon);
    }

    public void setCharacterStats(int hitPoints, int defense, int agility, int baseAttack) {

        if (radioWarrior.isSelected()) {
            DragonsAndDungeonsFrame.setTheWarrior(hitPoints, defense, agility, baseAttack);
        }
        else if (radioWizard.isSelected()) {
            DragonsAndDungeonsFrame.setTheWizard(hitPoints, defense, agility, baseAttack);
        }
        else if (radioCleric.isSelected()) {
            DragonsAndDungeonsFrame.setTheCleric(hitPoints, defense, agility, baseAttack);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please, select a character type!!!","Select Character Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean inputValidation() {
        boolean nameIsValidated = false;
        boolean characterIsValidated = false;
        boolean weaponIsValidated = false;

        if (txtFieldName.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Please, enter a name!!!","Enter Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            nameIsValidated = true;
        }

        if (!radioWarrior.isSelected() && !radioWizard.isSelected() && !radioCleric.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please, select a character type!!!","Select Character Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            characterIsValidated = true;
        }

        if (!radioDagger.isSelected() && !radioSword.isSelected() && !radioHammer.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please, select a weapon!!!","Select Weapon Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            weaponIsValidated = true;
        }

        if (nameIsValidated && characterIsValidated &&  weaponIsValidated) {
            return true;
        }
        else {
            return false;
        }
    }

    public void createCharacter() {
        String name = txtFieldName.getText();
        if (radioWarrior.isSelected()) {
            warrior = DragonsAndDungeonsFrame.getTheWarrior();
            warrior.setWeapon(DragonsAndDungeonsFrame.getWeapons().get(DragonsAndDungeonsFrame.getSelectedWeapon()));
            warrior.setName(name);
        }
        else if (radioWizard.isSelected()) {
            wizard = DragonsAndDungeonsFrame.getTheWizard();
            wizard.setWeapon(DragonsAndDungeonsFrame.getWeapons().get(DragonsAndDungeonsFrame.getSelectedWeapon()));
            wizard.setName(name);
        }
        else if (radioCleric.isSelected()) {
            cleric = DragonsAndDungeonsFrame.getTheCleric();
            cleric.setWeapon(DragonsAndDungeonsFrame.getWeapons().get(DragonsAndDungeonsFrame.getSelectedWeapon()));
            cleric.setName(name);
        }
    }

    public JButton getBtnStartBattle() {
        return btnStartBattle;
    }

    public void setAllComponentsToNull() {
        txtFieldName.setText(null);
        labelImageCharacter.setIcon(null);
        btnGroupCharacter.clearSelection();
        txtAreaCharacter.setText(null);
        labelImageWeapon.setIcon(null);
        groupWeapon.clearSelection();
        txtAreaWeapon.setText(null);
        txtFieldHitPoints.setText(null);
        txtFieldDefense.setText(null);
        txtFieldAgility.setText(null);
        txtFieldBaseAttack.setText(null);
        btnReroll.setEnabled(false);
        txtFieldAttackModifier.setText(null);
        txtFieldWeight.setText(null);
    }
}