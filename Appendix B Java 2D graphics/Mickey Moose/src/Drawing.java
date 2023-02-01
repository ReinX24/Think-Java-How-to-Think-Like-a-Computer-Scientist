import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    /* Drawing circles */
    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    /* Method for drawing Mickey */
    public void Mickey(Graphics g, Rectangle bb) {
        /* Draws face */
        boxOval(g, bb);
        /* Creating Rectangle object for ears */
        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        /* Left ear */
        half.translate(-dx / 2, -dy / 2);
        boxOval(g, half);
        /* Right ear */
        half.translate(dx * 2, 0);
        boxOval(g, half);
    }

    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(150, 200, 200, 200);
        g.setColor(Color.orange);
        Mickey(g, bb); // invokes Mickey method
    }

    public static void main(String[] args) {

        JFrame frameOne = new JFrame("Mickey Moose");
        Canvas canvasOne = new Drawing();
        canvasOne.setSize(500, 500);
        canvasOne.setBackground(Color.white);
        frameOne.add(canvasOne);
        frameOne.pack();
        frameOne.setVisible(true);
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
