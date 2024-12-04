package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/records

public class Launcher {

	public static void main(String[] args) {
		Person jakeBlues = new Person("Jake Blues", "1060 W Addison St", 60613, "Chicago");

		System.out.println(jakeBlues);
		
		// jakeBlues.name = "Elwood";
		// jakeBlues.address = new Address("Randolph and State", 60601, "Chicago");
		
		// jakeBlues.address().setStreet("Randolph and State");
		// jakeBlues.address().setZip(60601);
		// System.out.println(jakeBlues);
	}

}
