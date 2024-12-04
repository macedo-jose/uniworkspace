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

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
    
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Point other = (Point) obj;
    //     return x == other.x && y == other.y;
    // }

	// @Override
	public boolean equals(Point p) {
		// WRONG!!! It's not at all guaranteed that this method will be called
		// when invoking equals()!
		return x == p.x && y == p.y; 
	}

    @Override
    public int hashCode() {
        // note that you MUST implement hashCode() if you implement equals()
        // we will get back to that when discussing the Java Collections Framework
        return x | y;
    }
}
