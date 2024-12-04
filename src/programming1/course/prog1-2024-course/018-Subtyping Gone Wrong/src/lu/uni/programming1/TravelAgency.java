package lu.uni.programming1;

public class TravelAgency {

	public void bookFlight(Person passenger, String from, String to) {
		System.out.println(passenger.getName() + " books flight from " + from + " to " + to);
	}
	
	public void sightseeing(Address address) {
		System.out.println("do sightseeing at: " + address);
	}

}
