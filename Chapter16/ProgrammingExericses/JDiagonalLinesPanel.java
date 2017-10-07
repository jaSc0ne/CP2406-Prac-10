package ProgrammingExericses;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class JDiagonalLinesPanel extends JPanel{

    int xStart, yStart;
    int xFinish, yFinish;
    int width = 300;
    int height = 300;
    final int CHANGE = 25;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        xStart = 50;
        yStart = 50;
        xFinish = 50;
        yFinish = 50;
        g.drawRect(xStart, yStart, width, height); // Draw the surrounding rectangle perimeter
        int lineBoundary = width+xStart;
        while(xStart < lineBoundary){
            g.drawLine(xStart, yStart, xFinish, yFinish);
            xStart += CHANGE;
            yFinish += CHANGE;
        }
        while(yStart < lineBoundary){
            g.drawLine(xStart, yStart, xFinish, yFinish);
            yStart += CHANGE;
            xFinish += CHANGE;
        }
    }
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(new JDiagonalLinesPanel());
    }


}
