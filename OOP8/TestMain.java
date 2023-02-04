package object.OOP8;

public class TestMain {
    public static void main(String[] args) {

        Ball b = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(b);
        b.setX(80.0f);
        b.setY(35.0f);
        b.setRadius(5);
        b.setXDelta(4.0f);
        b.setYDelta(6.0f);
        System.out.println(b);  // toString()
        System.out.println("x is: " + b.getX());
        System.out.println("y is: " + b.getY());
        System.out.println("radius is: " + b.getRadius());
        System.out.println("xDelta is: " + b.getXDelta());
        System.out.println("yDelta is: " + b.getYDelta());

        // Bounce the ball within the boundary
        float xmin = 0.0f;
        float xmax = 100.0f;
        float ymin = 0.0f;
        float ymax = 50.0f;
        for (int i = 0; i < 15; i++) {
            b.move();
            System.out.println(b);
            float xNew = b.getX();
            float yNew = b.getY();
            int radius = b.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xmax || (xNew - radius) < xmin) {
                b.reflectHorizontal();
            }
            if ((yNew + radius) > ymax || (yNew - radius) < ymin) {
                b.reflectVertical();
            }
        }
    }
}
