package lu.uni.programming1;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = (x >= 0 ? x : 0); // ternary operator
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = Math.max(y, 0); // alternative, also implemented using ternary operator
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
