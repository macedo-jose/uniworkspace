package lu.uni.programming1;

public class TowardsMethods {
    public static void main(String[] args) {
		int fahrenheit = 0;
		
		while (fahrenheit <= 200) {
			double kelvin = (fahrenheit - 32) * 5.0 / 9.0 - 273.15;
			
			System.out.printf("%3d °F: %5.1f K\n", fahrenheit, kelvin);
			fahrenheit += 20;
		}
		
		System.out.println("----------------");
		
		do {
			// ATTENTION kelvin must be computed properly!
			double kelvin = 0;
			
			System.out.printf("%3d °F: %5.1f K\n", fahrenheit, kelvin);
			fahrenheit -= 20;
		} while (fahrenheit >= 0);
	}
}
