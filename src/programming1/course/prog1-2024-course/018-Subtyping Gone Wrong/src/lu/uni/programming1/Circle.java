package lu.uni.programming1;

// should NOT make Circle a subtype of Point!
// but use composition instead
public class Circle extends Point {
    
    private double radius;

    public Circle(int centerX, int centerY, double radius) {
        super(centerX, centerY);
        this. radius = radius;
    }

    public Circle(Point center, double radius) {
        this(center.getX(), center.getY(), radius);
    }

    public double getRadius() {
        return radius;
    }
    
}
