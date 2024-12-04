package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/object-references

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		Point p1 = new Point(1, 11);

		// p1.x = 111;

		// System.out.println("p1.x = " + p1.getX() + "  p1.y = " + p1.getY());

		// System.out.println(p1);

		// Point p2 = new Point(p1);
		// System.out.println("p1: " + p1 + "   p2: " + p2);

		// p2 = new Point(2, 22);
		// System.out.println("p1: " + p1 + "   p2: " + p2);
			
		// p2.reset();
		// System.out.println("p1: " + p1 + "   p2: " + p2);
			
		// Point p3 = p1;
		// System.out.println("p1: " + p1 + "   p2: " + p2 + "   p3: " + p3);
			
		// p3.reset();
		// System.out.println("p1: " + p1 + "   p2: " + p2 + "   p3: " + p3);

		// Point triangle[] = new Point [3];
		// triangle[0] = new Point(11, 1);
		// triangle[1] = new Point(22, 2);
		// triangle[2] = new Point(33, 3);
		// for (Point vertex: triangle) {
		// 	System.out.println(vertex);
		// }
	}

}
