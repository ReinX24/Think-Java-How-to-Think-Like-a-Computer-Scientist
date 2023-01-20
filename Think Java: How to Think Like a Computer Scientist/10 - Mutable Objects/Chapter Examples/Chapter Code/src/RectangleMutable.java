import java.awt.Rectangle;

public class RectangleMutable {

    public static void main(String[] args) {

        Rectangle rectOne = new Rectangle(0, 0, 100, 200);
        System.out.println(rectOne);
        // Rectangle objects are mutable, that means we can modify their attributes
        rectOne.x += 50; // moves rectangle 50 units to the right
        rectOne.y += 100; // moves rectangle 100 units to the north
        System.out.println(rectOne);
        moveRect(rectOne, 50, 100); // moves rectangle again through a method
        System.out.println(rectOne);
        rectOne.translate(50, 100); // moves the box again through the translate method
        System.out.println(rectOne);

    }

    /**
     * @param rectObj
     *                Rectangle object to be used in method
     * @param dx
     *                The amount the rectangle will be moved in the x axis
     * @param dy
     *                The amount the rectangle will be moved in the y axis
     */
    public static void moveRect(Rectangle rectObj, int dx, int dy) {
        rectObj.x += dx;
        rectObj.y += dy;
    }

}
