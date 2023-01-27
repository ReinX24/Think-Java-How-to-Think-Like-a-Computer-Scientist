import java.awt.Point;

public class GarbageCollection {

    public static void main(String[] args) {

        Point pointOne = new Point(3, 4);
        System.out.println(pointOne);
        pointOne = null; // contents are collected by the garbage collector
        System.out.println(pointOne);

    }

}
