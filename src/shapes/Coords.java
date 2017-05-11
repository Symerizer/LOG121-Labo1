package shapes;

/**
 * Creates a set of coordinates to use with the Shape class.
 */
public class Coords {

    private int x1, y1, x2, y2;
    private double centerX, centerY, radiusV, radiusY;

    /** Square, rectangle, line */
    public Coords(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /** Oval, circle */
    public Coords(int x1, int y1, int x2, int y2, double centerX, double centerY, double radiusV, double radiusY){
        this(x1, y1, x2, y2);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusV = radiusV;
        this.radiusY = radiusY;
    }
}
