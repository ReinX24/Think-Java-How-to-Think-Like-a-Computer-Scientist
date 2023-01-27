import java.awt.Point;

public class PointRiddle {

    public static void main(String[] args) {

        /*
         * Exercise 10.1 The point of this exercise is to make sure you understand the
         * mechanism for passing objects as parameters.
         */

        int x = 5;
        Point pointOne = new Point(1, 2);

        System.out.println(riddlePoint(x, pointOne)); // 13
        System.out.println(x); // 5
        System.out.println(pointOne.x); // 1
        System.out.println(pointOne.y); // 2

    }

    public static int riddlePoint(int x, Point paramPoint) {
        x += 7; // adds 7 to x
        return x + paramPoint.x + paramPoint.y; // adds (x + 7), paramPoint x, paramPoint y all together
    }

}
