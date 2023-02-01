import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public static void main(String[] args) {

        JFrame frameOne = new JFrame("My Drawing");
        Canvas canvasOne = new Drawing();
        canvasOne.setSize(400, 400);
        frameOne.add(canvasOne);
        frameOne.pack();
        frameOne.setVisible(true);

    }

    /* paint method called when the program runs, from Canvas object */
    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }

}
