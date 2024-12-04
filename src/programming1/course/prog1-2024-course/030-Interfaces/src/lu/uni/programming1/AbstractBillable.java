package lu.uni.programming1;

public abstract class AbstractBillable implements Billable {

	private int cost;
	
	public AbstractBillable(int cost) {
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return cost;
	}

}
