package lu.uni.programming1;

public abstract class Billable {
	
	private int cost;
	
	public Billable(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
	
}
