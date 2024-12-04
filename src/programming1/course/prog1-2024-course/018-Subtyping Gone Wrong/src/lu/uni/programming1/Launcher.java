package lu.uni.programming1;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 3);
		LineSegment ls1 = new LineSegment(p1, p2);

		// Circle c1 = new Circle(1, 2, 3.0);
		// Circle c2 = new Circle(2, 3, 4.0);
		// LineSegment ls2 = new LineSegment(c1, c2);

		// Circle c3 = new Circle(3, 4, 5.0);
		// Circle c4 = new Circle(c3, 6.0);


		// Person jakeBlues = new Person("Jake Blues", "1060 W Addison St", 60613, "Chicago");
		// Building msa = new Building("Maison du Savoir", "2, avenue de l'Université", 4365, "Esch-sur-Alzette");
		// TravelAgency agency = new TravelAgency();

		// agency.bookFlight(msa, "Chicago", "Dallas");

		// agency.sightseeing(jakeBlues);

		
		// original code when using composition:
		// jakeBlues.getAddress().setStreet("Randolph and State");
		// jakeBlues.getAddress().setZip(60601);
		
		// code when using inheritance (discouraged in this context!)
		// jakeBlues.setStreet("Randolph and State");
		// jakeBlues.setZip(60601);
		// System.out.println(jakeBlues);
	}

}
