import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        
        JFrame frameOne = new JFrame("Japanese Flag");
        Canvas canvasOne = new Drawing();
        canvasOne.setSize(700, 400);
        canvasOne.setBackground(Color.white);
        frameOne.add(canvasOne);
        frameOne.pack();
        frameOne.setVisible(true);
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops program when window is closed

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(275, 125, 150, 150);
    }
    
}
