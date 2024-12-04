package lu.uni.programming1;

public record Person (String name, Address address) {

	public Person(String name, String street, int zip, String city) {
		this(name, new Address(street, zip, city));
	}

}
