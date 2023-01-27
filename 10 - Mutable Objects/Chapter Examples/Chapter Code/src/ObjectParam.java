import java.awt.Point;

public class ObjectParam {

    public static void main(String[] args) {

        Point blankMapOne = new Point(0, 0);
        printPoints(blankMapOne);
        Point blankMapTwo = new Point(3, 4);
        printPoints(blankMapTwo);
        System.out.println("Distance: " + distancePoints(blankMapOne, blankMapTwo)); // prints distance between two points
        double distancePointsOne = blankMapOne.distance(blankMapTwo); // finds distance between 2 points
        System.out.println("Distance: " + distancePointsOne);
        System.out.println(blankMapOne); // prints Point object attributes directly
        System.out.println(blankMapTwo);

    }

    /**
     * @param pointMap
     *                 Method that takes a Point object in its parameter and prints
     *                 the points in that Point object
     */
    public static void printPoints(Point pointMap) {
        System.out.println("x: " + pointMap.x + " y: " + pointMap.y);
    }

    /**
     * @param pointMapOne
     *                    First Point object that the method will use
     * @param pointMapTwo
     *                    Second Point object that the method will use
     * @return
     *         Returns distance between two points
     */
    public static double distancePoints(Point pointMapOne, Point pointMapTwo) {
        int dxNum = pointMapTwo.x - pointMapOne.x;
        int dyNum = pointMapTwo.y - pointMapOne.y;
        return Math.sqrt(dxNum * dxNum + dyNum * dyNum);
    }

}
