package lu.uni.programming1;

import java.util.Scanner;

// ATTENTION must set java.debug.settings.console to integratedTerminal to enable console input
public class ConsoleInput {

	public static void main(String[] args) {
		int vat = 17;

		// initialization of a Scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter net value: ");
		// reading a number from standard input
		double net = scanner.nextDouble();
		
		double gross = net * (1 + vat / 100.0);
		
		System.out.println(net + " plus " + vat + "% VAT = " + gross);
		
		// streams should be closed
		scanner.close();
	}

}
