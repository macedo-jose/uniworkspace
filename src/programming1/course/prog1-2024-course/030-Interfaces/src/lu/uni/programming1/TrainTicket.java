package lu.uni.programming1;

public class TrainTicket extends AbstractBillable implements Printable, Refundable {
	
	private String source, destination;

	public TrainTicket(String source, String destination, int cost) {
		super(cost);
		this.source = source;
		this.destination = destination;
	}

	public void print() {
		System.out.println("train ticket from " + source + " to " + destination);
	}

}
