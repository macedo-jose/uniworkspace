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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return street + ", " + city + " " + zip; 
	}

}
