package lu.uni.programming1;

public class Librarian extends Person {

	public Librarian(String name, Address address) {
		super(name, address);
	}

	public Librarian(String name, String street, int zip, String city) {
		super(name, street, zip, city);
	}

	@Override
	public String toString() {
		return "Librarian: " + super.toString();
	}
	
}
