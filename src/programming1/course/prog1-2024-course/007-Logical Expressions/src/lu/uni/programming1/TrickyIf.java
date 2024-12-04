package lu.uni.programming1;

public class TrickyIf {

	public static void main(String[] args) {
		int a, b, c;

	    a = 8;
		b = 2;
		c = 1;

		if (b != 0 && (a/b) > c) {
			System.out.println("a/b is greater than c\n");
		}
		
		// if (++b == 2 || (--c != 0 && a++ != 0)) {
		// 	System.out.println("expression is true\n");
		// }
		// System.out.println("a: " + a + " b: " + b + " c: " + c);
	}

}
