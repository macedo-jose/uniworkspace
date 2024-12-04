package lu.uni.programming1;

public class Address {
	
	private String street;
	private int zip;
	private String city;

	public Address(String street, int zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	@Override
	public String toString() {
		return street + ", " + city + " " + zip; 
	}

}
