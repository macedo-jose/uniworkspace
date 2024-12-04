package lu.uni.programming1;

public class FahrenheitConversionForLoop {

	public static void main(String[] args) {
		for (int fahrenheit=0 ; fahrenheit<=200 ; fahrenheit+=20) {
		// for (double fahrenheit=0 ; fahrenheit<=200 ; fahrenheit+=20) {
			double celsius = (5 / 9) * (fahrenheit - 32);
			
			System.out.println(fahrenheit + " °F: " + celsius + " °C");
			// System.out.printf("%3d °F: %5.1f °C\n", fahrenheit, celsius);
		}
	}
}
