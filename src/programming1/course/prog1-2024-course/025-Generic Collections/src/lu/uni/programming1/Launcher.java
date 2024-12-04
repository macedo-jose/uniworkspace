package lu.uni.programming1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		// HashSet<Integer> integers = new HashSet<>();
		// Collection<Integer> integers = new TreeSet<>();
		
		integers.add(10);
		integers.add(20);
		integers.add(20);
		integers.add(30);
		show(integers);
		
		// integers.add(40);
		// show(integers);
	}
	
	private static void show(Collection<Integer> integers) {
		for (int value : integers)
			System.out.print(value + " ");
		System.out.println();
	}

}
