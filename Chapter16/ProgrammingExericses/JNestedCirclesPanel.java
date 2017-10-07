package ProgrammingExericses;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JNestedCirclesPanel extends JPanel{
    final int TOTALCIRCLES = 15;
    final int CHANGE = 15;
    int radius, corner;
    int numCircles;

    public JNestedCirclesPanel(){
        setBackground(Color.WHITE);
    }
    public void paintComponent(Graphics gr){
        super.paintComponent(gr);
        corner = 300;
        radius = 2;
        for(numCircles =0;numCircles < TOTALCIRCLES; numCircles++){
            corner -= CHANGE;
            radius += 2*CHANGE;
            gr.drawOval(corner, corner, radius, radius);
        }
    }

    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.add(new JNestedCirclesPanel());
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
