package lu.uni.programming1;

public class FahrenheitConversionWhileLoop {

	public static void main(String[] args) {
		int fahrenheit = 0;
		
		while (fahrenheit <= 200) {
			double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
			
			System.out.printf("%3d °F: %5.1f °C\n", fahrenheit, celsius);
			fahrenheit += 20;
		}
		
		// System.out.println("----------------");
		
		// do {
		// 	double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
			
		// 	System.out.printf("%3d °F: %5.1f °C\n", fahrenheit, celsius);
		// 	fahrenheit -= 20;
		// } while (fahrenheit >= 0);
	}

}
