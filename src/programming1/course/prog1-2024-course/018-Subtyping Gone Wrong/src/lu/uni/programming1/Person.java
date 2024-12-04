package lu.uni.programming1;

// should NOT make Person a subtype of Address!
// but use composition instead
public class Person extends Address {

	private String name;

	public Person(String name, String street, int zip, String city) {
		super(street, zip, city);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " @ " + super.toString();
	}

}
