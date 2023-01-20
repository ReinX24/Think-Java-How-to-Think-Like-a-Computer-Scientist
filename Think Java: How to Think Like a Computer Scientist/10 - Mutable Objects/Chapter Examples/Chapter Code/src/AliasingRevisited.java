import java.awt.Rectangle;

public class AliasingRevisited {

    public static void main(String[] args) {

        Rectangle rectOne = new Rectangle(0, 0, 100, 200);
        Rectangle rectTwo = rectOne; // references rectOne
        System.out.println(rectOne);
        System.out.println(rectTwo);
        rectOne.grow(50, 100); // grows width, decreases  x, grows height, decreases y
        System.out.println(rectOne);
        System.out.println(rectTwo); // same attributes as rectOne

    }

}
