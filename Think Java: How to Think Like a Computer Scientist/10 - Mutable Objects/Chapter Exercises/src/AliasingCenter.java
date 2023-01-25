import java.awt.Point;
import java.awt.Rectangle;

public class AliasingCenter {

    public static void main(String[] args) {

        /*
         * Exercise 10.3 This exercise is about aliasing. Recall that aliases are two
         * variables that refer to the same object. The following code uses findCenter
         * and printPoint as defined in this chapter.
         */

        Rectangle rectOne = new Rectangle(2, 4, 7, 9);
        Point pointOne = findCenter(rectOne); // center of rectOne
        System.out.println(rectOne);
        printPoint(pointOne);

        rectOne.grow(1, 1); // -1, -1, +1, +1
        System.out.println(rectOne);
        Point pointTwo = findCenter(rectOne);
        printPoint(pointTwo);

    }

    /* Method that prints the point's elements */
    public static void printPoint(Point paraPoint) {
        System.out.println("x : " + paraPoint.x + " y : " + paraPoint.y);
    }

    /* Method that finds the center of a rectangle */
    public static Point findCenter(Rectangle paramRect) {
        int x = (paramRect.x - paramRect.width) / 2;
        int y = (paramRect.y - paramRect.height) / 2;
        return new Point(x, y);
    }

}
