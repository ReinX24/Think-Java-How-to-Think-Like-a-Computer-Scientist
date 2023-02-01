import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    /* Takes a rectangle object and invokes fillOval */
    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    /* Method that draws a mickey mouse */
    public void Mickey(Graphics g, Rectangle bb) {
        /* Draws the face */
        boxOval(g, bb); // calls boxOval method
        if (bb.width < 3) {
            return;
        }
        /* Creates rectangle for the ears */
        int dx = bb.width / 2;
        int dy = bb.height / 2;

        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        /* Moves rectangle to the left and creates an ear */
        half.translate(-dx / 2, -dy / 2);
        boxOval(g, half);
        /* Moves rectangle to the right and creates an ear */
        half.translate(dx * 2, 0);
        boxOval(g, half);


    }

    /* Invoked when a canvas object is made */
    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 150, 200, 200);
        g.setColor(Color.gray);
        Mickey(g, bb); // invokes mickey method
    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops the program when exiting window

        // add the canvas
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }

}
