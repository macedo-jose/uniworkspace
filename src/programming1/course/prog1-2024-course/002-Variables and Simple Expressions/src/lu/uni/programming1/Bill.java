package lu.uni.programming1;

public class Bill {
	public static void main(String[] args) {
		int vat = 17;
		double net = 10.5;
		double gross;
		
		gross = net * (1 + vat / 100.0);
		System.out.println(net + " plus " + vat + "% VAT = " + gross);
		// System.out.format("%.2f plus %d%% VAT = %8.2f", net, vat, gross);
	}
}
