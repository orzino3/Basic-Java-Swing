package org.example;

import org.example.MyMouse;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel {

    private BufferedImage backgroundImage;
    private MyMouse myMouse;

    public Panel() {
        this.myMouse = new MyMouse(this);
        File file = new File("C:\\Users\\אור זינו\\Downloads\\untitled\\src\\main\\kitty.jpg");
        try {
            this.backgroundImage = ImageIO.read(file);
            JButton jButton = new JButton("Click Me");
            jButton.setBounds(0, 0, 100, 60);
            jButton.setVisible(true);
            this.add(jButton);

            jButton.addActionListener((e -> {
                this.backgroundImage = convertToGrayscale(this.backgroundImage);
                repaint();
            }));

            this.addMouseListener(this.myMouse);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.setPreferredSize(new Dimension(this.backgroundImage.getWidth(this), this.backgroundImage.getHeight(this)));
        this.setBounds(0, 0, this.backgroundImage.getWidth(this), this.backgroundImage.getHeight(this));
        this.setLayout(null);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.backgroundImage, 0, 0, this);
    }

    private BufferedImage convertToGrayscale(BufferedImage img) {
        BufferedImage grayImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = grayImage.getGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        return grayImage;
    }

    public void drawShape(int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(Color.RED);
        int radius = 50; // קובע את רדיוס העיגול
        g.drawOval(x - radius / 2, y - radius / 2, radius, radius);
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }
}
