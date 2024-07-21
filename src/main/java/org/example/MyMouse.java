package org.example;

import org.example.Panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse implements MouseListener {

    private Panel panel;

    public MyMouse(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        this.panel.drawShape(mouseX, mouseY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
