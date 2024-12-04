package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/call-by-value

public class PassByValue {
    
    public static double toKelvin(int f) {
        double k;

        f = 1000000; // for illustration purposes only!
        k = (f - 32) * 5.0 / 9.0 + 273.15;
        return k;
    }    

    public static void main(String[] args) {
        int fahrenheit = 32;
        double kelvin = toKelvin(fahrenheit);

        System.out.println("fahrenheit = " + fahrenheit + "   kelvin = " + kelvin);
    }
}
