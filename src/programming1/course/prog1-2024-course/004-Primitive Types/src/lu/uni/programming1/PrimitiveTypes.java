package lu.uni.programming1;

@SuppressWarnings("all")
public class PrimitiveTypes {

	public static void main(String[] args) {
		byte  b =           -128; // ..        127   8 bit
		short s =         -32768; // ..      32767  16 bit
		int   i =    -2147483648; // .. 2147483647  32 bit
		long  l = Long.MIN_VALUE; // ..   (2^63)-1  64 bit
		// NO unsigned types available!
		
		float  f;                 // ~ +/- 1.4E-45  .. 3.4E+38   32 bit
		double d = 0.0;           // ~ +/- 4.9E-324 .. 1.7E+308  64 bit
		
		char c = ' ';             // unicode characters  16 bit
		
		boolean bool = true;      // false (default) or true  1 bit
		
		
		i = s; // widening allowed
		
		// s = i;			// narrowing not allowed directly, since e.g. some
							// int values are too big for type short ...
		// s = (short) i;	// ... only with cast, which might result
		               		// in loss of information!
		
		// i = bool; // no standard conversion from boolean to integer

		// i = Integer.MAX_VALUE - 2;
		// System.out.println("i = " + i++);
		// System.out.println("i = " + i++);
		// System.out.println("i = " + i++);
		// System.out.println("i = " + i++);
		// System.out.println("i = " + i++);
		// System.out.println("i = " + i++);

		// f = 0.1f;
		// d = 0.1;
		// System.out.printf("f = %30.28f\n", f);
		// System.out.printf("d = %30.28f\n", d);
		
		// d = 1.0;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2; // d = d + 0.2
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
		// d += 0.2;
		// System.out.printf("d = %30.28f\n", d);
	}

}
