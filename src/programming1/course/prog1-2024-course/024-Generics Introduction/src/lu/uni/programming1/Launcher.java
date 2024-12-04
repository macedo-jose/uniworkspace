package lu.uni.programming1;

import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		
		integers.add(10); // 'autoboxing': integers.add(Integer.valueOf(10));
		integers.add(20);
		integers.add(20);
		integers.add(30);
		show(integers);
		
		// integers.add(40);
		// show(integers);
		
		// integers.remove(10);
		// integers.remove(Integer.valueOf(10));
		// show(integers);
	}
	
	private static void show(ArrayList<Integer> integers) {
		for (int value : integers)
			System.out.print(value + " ");
		System.out.println();
	}

}
