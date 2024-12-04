package lu.uni.programming1;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void reset() {
        x = y = 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
