package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/passing-object-references

public class Launcher {

	public static void main(String[] args) {
		Point p1 = new Point(1, 11);

		System.out.println("before calling f(): p1 = " + p1);
		f(p1);
		// System.out.println("after returning from f(): p1 = " + p1);
	}

	private static void f(Point p) {
		p.setX(123);
		p.setY(456);
		System.out.println("in f(): p = " + p);
		
		// p = new Point(123, 456);
		// System.out.println("in f(): p = " + p);
	}

}
