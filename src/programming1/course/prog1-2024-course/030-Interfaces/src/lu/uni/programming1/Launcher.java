package lu.uni.programming1;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		Coke c = new Coke();
		Book b = new Book("Java for Dummies", 42);
		TrainTicket t = new TrainTicket("Earth", "Mars", 9876);
		
		messAroundWith(c);
		// messAroundWith(b);
		// messAroundWith(t);
		// chargeMe("bla bla");
		// refundMe(c);
	}
	
	public static void chargeMe(Billable b) {
		System.out.println("that thing costs: " + b.getCost());
	}
	
	public static void refundMe(Refundable r) {
		System.out.println("that thing is refundable");
	}

	private static void messAroundWith(Object o) {
		System.out.println("messing around with: " + o);
		
		// AVOID using 'instanceof' in production code (with few exceptions)
		if (o instanceof Billable) {
			Billable b = (Billable) o;

			System.out.println("that thing costs: " + b.getCost());
		}
		if (o instanceof Printable) {
			Printable p = (Printable) o;

			p.print();
		}
		// using 'pattern matching instanceof' (preview feature in Java 14 and 15)
		// if (o instanceof Printable p) {
		// 	p.print();
		// }
		if (o instanceof Refundable) {
			System.out.println("that thing is refundable");
		}
	}

}
