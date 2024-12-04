package lu.uni.programming1;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		Address wrigleyField = new Address("1060 W Addison St", 60613, "Chicago");
		Person jakeBlues = new Person("Jake Blues", wrigleyField);
		Reader bookworm = new Reader("Bookworm Joe", "11 Mouse Hole", 40059, "Louisville");
		Librarian derek = new Librarian("Derek Miller", "42 Library Ave", 75204, "Dallas");
		Book javaLanguageSpecification = new Book("The Java Language Specification",
				"James Gosling et al.",
				"Addison-Wesley",
				"978-0133900699");
		
		TravelAgency agency = new TravelAgency();

		// agency.bookFlight(jakeBlues, "Chicago", "Dallas");
		// agency.bookFlight(bookworm, "Louisville", "Boston");
		// agency.bookFlight(derek, "Dallas", "San Francisco");
		
		// Library library = new Library(derek);
		
		// library.borrow(bookworm, javaLanguageSpecification);
		// library.borrow(jakeBlues, javaLanguageSpecification);
	}

}
