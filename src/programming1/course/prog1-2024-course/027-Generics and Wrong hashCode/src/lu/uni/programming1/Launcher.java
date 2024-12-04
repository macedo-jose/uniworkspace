package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/hashing

import java.util.HashSet;

public class Launcher {

	public static void main(String[] args) {
		HashSet<Point> points = new HashSet<>();
		
		fill(points);
		show(points);
//		lookup(points, new Point(11, -11));
		lookup(points, new Point(2, -2));
	}

	private static void fill(HashSet<Point> points) {
		points.add(new Point(0, 0));
		points.add(new Point(1, -1));
		points.add(new Point(2, -2));
		points.add(new Point(3, -3));
		points.add(new Point(4, -4));
	}

	private static void show(HashSet<Point> points) {
		for (Point p : points) {
			System.out.print(p + "  ");
		}
		System.out.println();
	}

	private static void lookup(HashSet<Point> points, Point point) {
		if (points.contains(point))
			System.out.println("Hurray! Found: " + point);
		else
			System.out.println("Sniff! Couldn't find: " + point);
	}

}

