package oop.assign3;

import oop.assign3.GUI.DragonsAndDungeonsFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DragonsAndDungeonsFrame frame = new DragonsAndDungeonsFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
