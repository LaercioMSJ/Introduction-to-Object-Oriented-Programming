package oop.assign3.GUI;

import oop.assign3.Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class BattleSummaryScreen extends JPanel {

    // Creates a Random object
    Random random = new Random();

    // Some controls need to be declared at the class level, if referenced in multiple places
    private JLabel lblPlayer;
    private JLabel lblImgPlayer;
    private JLabel lblMonster;
    private JLabel lblImgMonster;
    private JTextArea txtAreaResult;
    private JButton btnPlayAgain;

    private Warrior warrior = null;
    private Wizard wizard = null;
    private Cleric cleric = null;
    private Monster chosenMonster = null;
    private ArrayList<Monster> monsters = null;

    public BattleSummaryScreen() {

        // Sets Panel Properties
        setLayout(null);
        setBackground(new Color(132, 151, 214));

        // Creates all GUI objects
        // Creates battleTitle JLabel
        JLabel lblBattleTitle = new JLabel("Battle to the Death!");
        lblBattleTitle.setBounds(65, 30, 650, 50);
        lblBattleTitle.setFont(new Font("Old English Text MT", Font.BOLD, 68));

        // Creates lblPlayer JLabel
        lblPlayer = new JLabel("Player: ???");
        lblPlayer.setBounds(100, 120, 650, 50);
        lblPlayer.setFont(new Font("Verdana", Font.BOLD, 26));

        // Creates lblImgPlayer JLabel
        lblImgPlayer = new JLabel();
        lblImgPlayer.setBounds(150, 180, 100, 140);

        // Creates lblMonster JLabel
        lblMonster = new JLabel("Monster: ???");
        lblMonster.setBounds(400, 120, 650, 50);
        lblMonster.setFont(new Font("Verdana", Font.BOLD, 26));

        // Creates lblImgMonster JLabel
        lblImgMonster = new JLabel();
        lblImgMonster.setBounds(450, 180, 140, 140);

        // Creates txtAreaResult JTextArea
        txtAreaResult = new JTextArea();
        txtAreaResult.setBounds(65, 380, 650, 300);
        txtAreaResult.setFont(new Font("Verdana", Font.BOLD, 18));
        txtAreaResult.setEditable(false);
        txtAreaResult.setLineWrap(true);
        txtAreaResult.setWrapStyleWord(true);

        // Creates btnPlayAgain JButton
        btnPlayAgain = new JButton("Play Again");
        btnPlayAgain.setBounds(250, 700, 260, 40);
        btnPlayAgain.setFont(new Font("Old English Text MT", Font.BOLD, 26));

        // Adds all GUI objects to Panel
        add(lblBattleTitle);
        add(lblPlayer);
        add(lblMonster);
        add(lblImgPlayer);
        add(lblImgMonster);
        add(txtAreaResult);
        add(btnPlayAgain);
    }

    public void setCharactersWithUpdatedStats() {
        warrior = DragonsAndDungeonsFrame.getTheWarrior();
        wizard = DragonsAndDungeonsFrame.getTheWizard();
        cleric = DragonsAndDungeonsFrame.getTheCleric();
    }

    public void showPlayerImage() {
        setCharactersWithUpdatedStats();
        if (warrior.getName() != null && warrior.getName() != "") {
            lblPlayer.setText("Player: Warrior");
            lblImgPlayer.setIcon(warrior.getWarriorImage());
        }
        else if (wizard.getName() != null && wizard.getName() != "") {
            lblPlayer.setText("Player: Wizard");
            lblImgPlayer.setIcon(wizard.getWizardImage());
        }
        else if (cleric.getName() != null && cleric.getName() != "") {
            lblPlayer.setText("Player: Cleric");
            lblImgPlayer.setIcon(cleric.getClericImage());
        }
        else {
            lblImgPlayer.setIcon(null);
        }
    }

    public void chooseRandomMonster() {
        monsters = DragonsAndDungeonsFrame.getMonsters();
        chosenMonster = monsters.get(random.nextInt(monsters.size()));
    }

    public void showMonsterImage() {
        lblMonster.setText("Monster: " + chosenMonster.getMonsterName());
        lblImgMonster.setIcon(chosenMonster.getMonsterImage());
    }

    public void displayBattleResult() {
        setCharactersWithUpdatedStats();
        String result = "";

        if (warrior.getName() != null && warrior.getName() != "") {
            result = warrior.showAllStats();
        }
        else if (wizard.getName() != null && wizard.getName() != "") {
            result = wizard.showAllStats();
        }
        else if (cleric.getName() != null && cleric.getName() != "") {
            result = cleric.showAllStats();
        }
        else {
            result = "???";
        }

        result += "\n" + chosenMonster.showMonsterAllStats();

        txtAreaResult.setText(result);
    }

    public JButton getBtnPlayAgain() {
        return btnPlayAgain;
    }
}