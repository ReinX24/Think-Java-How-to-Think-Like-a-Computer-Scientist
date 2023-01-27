import java.awt.Point;
import java.awt.Rectangle;

public class DistanceCenter {

    public static void main(String[] args) {

        /*
         * Exercise 10.2 The point of this exercise is to make sure you understand the
         * mechanism for returning new objects from methods. The following code uses
         * findCenter and distance as defined in this chapter.
         * 1. Draw a stack diagram showing the state of the program just before
         * findCenter returns. Include all variables and parameters, and show
         * the objects those variables refer to.
         * 2. Draw a stack diagram showing the state of the program just before
         * distance returns. Show all variables, parameters, and objects.
         * 3. What is the output of this program? (Can you tell without running it?)
         */

        Point pointOne = new Point(5, 8);
        Rectangle rectOne = new Rectangle(0, 2, 4, 4);
        Point rectOneCenter = findCenter(rectOne); // stores center of rectOne

        System.out.println(pointOne); // 5, 8
        System.out.println(rectOne); // 0, 2, 4, 4
        System.out.println(rectOneCenter); // 2, 3

        double distanceOne = distancePoints(rectOneCenter, pointOne);
        System.out.println(distanceOne); // prints distance between the two points

    }

    /* Method that finds the center of a Rectangle object */
    public static Point findCenter(Rectangle paraRect) {
        int x = (paraRect.x + paraRect.width) / 2;
        int y = (paraRect.y + paraRect.height) / 2;
        return new Point(x, y);
    }

    /* Method that finds the distance between two points */
    public static double distancePoints(Point pointOne, Point pointTwo) {
        int dx = pointTwo.x - pointOne.x;
        int dy = pointTwo.y - pointOne.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}