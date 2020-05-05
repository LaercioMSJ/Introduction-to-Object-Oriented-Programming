package oop.assign3.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SplashScreen extends JPanel {

    // Some controls need to be declared at the class level, if referenced in multiple places
    private JButton btnBuildChar;

    // Constructor
    public SplashScreen() {

        // Sets Panel Properties
        setLayout(null);
        setVisible(true);
        setBackground(new Color(132, 151, 214));

        // Creates all GUI objects
        // Creates lblDndTitle JLabel
        JLabel lblDndTitle = new JLabel("Dragons and Dungeons");
        lblDndTitle.setBounds(150, 80, 600, 50);
        lblDndTitle.setFont(new Font("Old English Text MT", Font.BOLD, 40));

        // Creates lblImageDnd JLabel
        JLabel lblImageDnd = new JLabel();
        lblImageDnd.setIcon(new ImageIcon(this.getClass().getResource("/image/dnd.jpg")));
        lblImageDnd.setBounds(80, 170, 600, 400);

        // Creates btnBuildChar JButton
        btnBuildChar = new JButton("Build a Character");
        btnBuildChar.setBounds(250,600,260,40);
        btnBuildChar.setFont(new Font("Old English Text MT", Font.BOLD, 26));

        // Adds all controls to Panel
        add(lblDndTitle);
        add(lblImageDnd);
        add(btnBuildChar);
    }

    public JButton getBtnBuildChar() {
        return btnBuildChar;
    }
}