package lu.uni.programming1;

public class Launcher {

	public static void main(String[] args) {
		Address wrigleyField = new Address("1060 W Addison St", 60613, "Chicago");
		Person jakeBlues = new Person("Jake Blues", wrigleyField);
		Reader joeBookworm = new Reader("Joe Bookworm", "10 Mouse Hole", 40059, "Louisville");
		Reader maryBookworm = new Reader("Mary Bookworm", "11 Mouse Hole", 40059, "Louisville");
		Reader susanBookworm = new Reader("Susan Bookworm", "12 Mouse Hole", 40059, "Louisville");
		Librarian derek = new Librarian("Derek Miller", "42 Library Ave", 75204, "Dallas");

		System.out.println(jakeBlues);
		System.out.println(joeBookworm);
		System.out.println(maryBookworm);
		System.out.println(susanBookworm);
		System.out.println(derek);
	}

}
