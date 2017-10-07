package ProgrammingExericses;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JUpsideDownPanel extends JPanel implements ActionListener{

    JButton flipButton = new JButton("Toggle rotation of text - up or down");
    String message = "Hello World!";
    int counter = 0;
    int xLocation = 150;
    int yLocation = 150;
    final int SIZE = 50;
    Font rightSideUp = new Font("TimesRoman", Font.PLAIN, SIZE);
    Font upsideDown = new Font("TimesRoman", Font.PLAIN, -SIZE);
    Font currentFont = rightSideUp;
    int yUpsideDownLocation = yLocation - SIZE/2;

    public JUpsideDownPanel(){
        setBackground(Color.WHITE);
        add(flipButton);
        flipButton.addActionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(currentFont);
        g.drawString(message, xLocation, yLocation);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        if(counter % 2 == 1){
            currentFont = rightSideUp;
            xLocation = 150;
            yLocation = 150;
        }else{
            currentFont = upsideDown;
            xLocation = (int)(xLocation+3*SIZE);
            yLocation = yUpsideDownLocation;
        }
        repaint();
    }

    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
