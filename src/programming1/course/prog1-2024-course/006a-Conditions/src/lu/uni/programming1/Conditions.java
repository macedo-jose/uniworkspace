package lu.uni.programming1;

import java.util.Scanner;

// ATTENTION must set java.debug.settings.console to integratedTerminal to enable console input
public class Conditions {

	public static void main(String[] args) {
		// initialize a Scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter temperature: ");
		// reading a number from standard input
		int temperature = scanner.nextInt();

		System.out.print("The state of water at that temperature is: ");
		if (temperature >= 100)
			System.out.println("gaseous");
		// else if (temperature < 0)
		// 	System.out.println("solid");
		// else
		// 	System.out.println("liquid");

		// close stream
		scanner.close();
	}

}
