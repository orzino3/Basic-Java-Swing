package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Window extends JFrame {

    public Window(){
        Panel panel = new Panel();
        this.setTitle("איילת וגל");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(panel.getBackgroundImage().getWidth(panel),panel.getBackgroundImage().getHeight(panel));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(panel);
        this.setVisible(true);

        //existing method

    }

    public static void main(String[] args) {
        new Window();
    }
}
