import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public static void main(String[] args) {

        JFrame frameOne = new JFrame("Graphics Methods"); // creating a JFrame object
        Canvas canvasOne = new Drawing(); // creating a canvas object
        canvasOne.setSize(500, 500); // setting canvas size
        canvasOne.setBackground(Color.red); // sets background color for canvas
        frameOne.add(canvasOne); // adding canvas to our frame
        frameOne.pack(); // makes sure the frame is at the correct size for its components
        frameOne.setVisible(true); // shows the frame

    }

    public void paint(Graphics g) {
        /* Sets Oval color */
        g.setColor(Color.white); // should be instantiated before fillOval or will not change color
        /* Creating a custom color */
        Color customPurple = new Color(128, 0, 128);
        g.setColor(customPurple); // overrides first setColor
        /* Sets Oval position and size */
        g.fillOval(125, 50, 250, 150); // x, y, width, height
    }

}
