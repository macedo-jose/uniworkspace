package lu.uni.programming1;

public class Person {

	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public Person(String name, String street, int zip, String city) {
		this.name = name;
		this.address = new Address(street, zip, city);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " @ " + address;
	}

}
