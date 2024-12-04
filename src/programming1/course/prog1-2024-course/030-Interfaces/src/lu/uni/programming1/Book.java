package lu.uni.programming1;

public class Book implements Printable, Billable {
	
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println("printing " + title + "...");
	}
	
	@Override
	public int getCost() {
		return price;
	}

}
