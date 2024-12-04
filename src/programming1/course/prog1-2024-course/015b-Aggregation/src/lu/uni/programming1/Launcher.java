package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/aggregation
// craftdocs://open?blockId=D508A7A0-E1FB-43E3-9B33-8E68BC1FD5D9&spaceId=0871f15a-0a50-391d-26fc-752863c2eeac

public class Launcher {

	public static void main(String[] args) {
		// scenario I
		Address wrigleyField = new Address("1060 W Addison St", 60613, "Chicago");
		Person jakeBlues = new Person("Jake Blues", wrigleyField);
		Person elwoodBlues = new Person("Elwood Blues", wrigleyField);
		
		// scenario II
		// Address jakesAddress = new Address("1060 W Addison St", 60613, "Chicago");
		// Person jakeBlues = new Person("Jake Blues", jakesAddress);
		// Address elwoodsAddress = new Address("1060 W Addison St", 60613, "Chicago");
		// Person elwoodBlues = new Person("Elwood Blues", elwoodsAddress);
		
		// scenario III
		// Person jakeBlues = new Person("Jake Blues", new Address("1060 W Addison St", 60613, "Chicago"));
		// Person elwoodBlues = new Person("Elwood Blues", new Address("1060 W Addison St", 60613, "Chicago"));
		
		System.out.println(jakeBlues);
		System.out.println(elwoodBlues);
		
		// jakeBlues.getAddress().setStreet("Randolph and State");
		// jakeBlues.getAddress().setZip(60601);
		// System.out.println(jakeBlues);
		// System.out.println(elwoodBlues);
	}

}
