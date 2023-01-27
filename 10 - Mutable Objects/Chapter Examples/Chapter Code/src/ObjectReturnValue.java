import java.awt.Rectangle;
import java.awt.Point;

public class ObjectReturnValue {

    public static void main(String[] args) {

        Rectangle rectangleOne = new Rectangle(0, 0, 100, 200); // x, y, width, height
        System.out.println(rectangleOne); // prints object attributes
        Point rectangleOneCenter = findRectangleCenter(rectangleOne); // stores center point in a variable
        System.out.println("Center: " + rectangleOneCenter);

    }

    /**
     * @param rectObj
     *                Accepts a rectangle object in parameter
     * @return
     *         Returns the center of that rectangle object
     */
    public static Point findRectangleCenter(Rectangle rectObj) {
        int xNum = rectObj.x + rectObj.width / 2; // for x axis
        int yNum = rectObj.y + rectObj.height / 2; // for y axis
        return new Point(xNum, yNum); // returns center point of rectObj
    }

}
