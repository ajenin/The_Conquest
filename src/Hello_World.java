import java.awt.*;
import java.util.Date;

public class Hello_World {
    public static void main(String[] args) {
        Point p1= new Point(5,7);
        Point p2= p1;
        p1.x=7;
        System.out.println(p1);
        System.out.println(p2);
    }
}
