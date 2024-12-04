package lu.uni.programming1;

// should NOT make Building a subtype of Person!
// but use composition (with Address) instead
public class Building extends Person {

	public Building(String name, String street, int zip, String city) {
		super(name, street, zip, city);
	}

}
