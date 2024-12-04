package lu.uni.programming1;

public class SimpleMethod {
    
    public static double toKelvin(int f) {
        double k;

        k = (f - 32) * 5.0 / 9.0 + 273.15;
        return k;
    }    

    public static void main(String[] args) {
		int fahrenheit = 0;
		
		while (fahrenheit <= 200) {
			double kelvin = toKelvin(fahrenheit);
			
			System.out.printf("%3d °F: %5.1f K\n", fahrenheit, kelvin);
			fahrenheit += 20;
		}
		
		System.out.println("----------------");
		
		do {
			double kelvin = toKelvin(fahrenheit);
			
			System.out.printf("%3d °F: %5.1f K\n", fahrenheit, kelvin);
			fahrenheit -= 20;
		} while (fahrenheit >= 0);
    }
}
