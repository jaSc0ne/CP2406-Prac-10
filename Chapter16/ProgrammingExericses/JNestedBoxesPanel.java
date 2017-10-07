package ProgrammingExericses;
// Draw 8 nested rectangles in a single panel using only 1 drawRect() statement
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JNestedBoxesPanel extends JPanel {
    int x,y; // x and y coordinates
    final int TOTALBOXES = 8; // 8 boxes in total to be displayed
    final int CHANGE = 35;
    int width, height;
    int numBoxes;

    public JNestedBoxesPanel(){
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        width = 500;
        height = 500;
        x = 30;
        y = 30;
        for(numBoxes = 0; numBoxes < TOTALBOXES; numBoxes++){
            g.drawRect(x, y, width, height);
            x += CHANGE;
            y += CHANGE;
            width -= 2*CHANGE;
            height -= 2*CHANGE;
        }
    }

    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(650,650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
