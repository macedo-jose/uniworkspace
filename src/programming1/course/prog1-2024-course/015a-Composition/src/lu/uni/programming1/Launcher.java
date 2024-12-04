package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/composition
// craftdocs://open?blockId=D508A7A0-E1FB-43E3-9B33-8E68BC1FD5D9&spaceId=0871f15a-0a50-391d-26fc-752863c2eeac

public class Launcher {

	public static void main(String[] args) {
		Person jakeBlues = new Person("Jake Blues", "1060 W Addison St", 60613, "Chicago");
		Person elwoodBlues = new Person("Elwood Blues", "1060 W Addison St", 60613, "Chicago");
		
		System.out.println(jakeBlues);
		System.out.println(elwoodBlues);
	}

}
