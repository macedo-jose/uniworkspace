package programming.lab2;
import java.util.Scanner;

public class TemperatureReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first temperature: ");
        double temp1 = Math.min(Math.max(scanner.nextDouble(), 15.0), 30.0);

        System.out.print("Enter the second temperature: ");
        double temp2 = Math.min(Math.max(scanner.nextDouble(), 15.0), 30.0);

        System.out.print("Enter the third temperature: ");
        double temp3 = Math.min(Math.max(scanner.nextDouble(), 15.0), 30.0);

        double weightedAverage = (temp1 * 0.40) + (temp2 * 0.15) + (temp3 * 0.45);

        System.out.println("Temperature 1: " + temp1);
        System.out.println("Temperature 2: " + temp2);
        System.out.println("Temperature 3: " + temp3);
        System.out.println("Weighted Average: " + weightedAverage);

        scanner.close();
    }
}