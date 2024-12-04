package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/equals

public class Launcher {

	public static void main(String[] args) {
		Point[] pointArray = new Point [5];
		
		fill(pointArray);
		show(pointArray);
		lookup(pointArray, new Point(11, -11));
		// lookup(pointArray, new Point(2, -2));
	}

	private static void fill(Point[] pointArr) {
		pointArr[0] = new Point(0, 0);
		pointArr[1] = new Point(1, -1);
		pointArr[2] = new Point(2, -2);
		pointArr[3] = new Point(3, -3);
		pointArr[4] = new Point(4, -4);
	}

	private static void show(Point[] pointArr) {
		for (Point p : pointArr) {
			System.out.print(p + "  ");
		}
		System.out.println();
	}

	private static void lookup(Point[] pointArr, Point point) {
		for (Point p : pointArr) {
			if (p.equals(point)) {
			// if (p == point) {
				System.out.println("Hurray! Found: " + point);
				return;
			}
		}
		System.out.println("Sniff! Couldn't find: " + point);
	}

}
