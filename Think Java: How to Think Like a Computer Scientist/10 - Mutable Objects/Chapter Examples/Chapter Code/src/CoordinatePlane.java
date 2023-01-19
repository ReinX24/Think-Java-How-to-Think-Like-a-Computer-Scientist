import java.awt.Point;

public class CoordinatePlane {

    public static void main(String[] args) {

        Point blankMap;
        blankMap = new Point(5, 7); // x & y coordinates for a map
        int pointX = blankMap.x; // instiating point in variable
        int pointY = blankMap.y;
        System.out.println(pointX); // printing points in map through a different variable
        System.out.println(pointY);
        System.out.println(blankMap.x); // printing points directly
        System.out.println(blankMap.y);

    }

}
