package lu.uni.programming1;

public class Person {

	private String name;
	private Address address;

	public Person(String name, String street, int zip, String city) {
		this.name = name;
		this.address = new Address(street, zip, city);
	}

	// composition should NOT reveal a part to the public,
	// since this might violate the ownership
	// public Address getAddress() { // DON'T SHARE PARTS!
	//     return address;
	// }

	@Override
	public String toString() {
		return name + " @ " + address;
	}

}
