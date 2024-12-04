package lu.uni.programming1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		SimpleDate d_01_01_2000 = new SimpleDate(1, 1, 2000);
		SimpleDate d_23_01_2000 = new SimpleDate(23, 1, 2000);
		SimpleDate d_01_01_2001 = new SimpleDate(1, 1, 2001);
		SimpleDate d_12_01_2001 = new SimpleDate(12, 1, 2001);
		
		if (d_01_01_2001 == new SimpleDate(1, 1, 2001)) {
			System.out.println("the two date object references are identical");
		} else {
			System.out.println("the two date object references are NOT IDENTICAL");
		}


		// if (d_01_01_2001.equals(new SimpleDate(1, 1, 2001))) {
		// 	System.out.println("the two dates are equal");
		// } else {
		// 	System.out.println("the two dates are NOT EQUAL");
		// }


		// SimpleDate other = d_01_01_2001;
		// if (d_01_01_2001.compareTo(other) < 0) {
		// 	System.out.println("less than");
		// } else if (d_01_01_2001.compareTo(other) == 0) {
		// 	System.out.println("equal");
		// } else {
		// 	System.out.println("larger");
		// }

		
		// ArrayList<SimpleDate> datesList = new ArrayList<>();
		// datesList.add(d_23_01_2000);
		// datesList.add(d_12_01_2001);
		// datesList.add(d_01_01_2001);
		// datesList.add(d_01_01_2000);
		// System.out.println("datesList (unsorted): " + datesList);

		// Collections.sort(datesList);
		// System.out.println("datesList (sorted): " + datesList);
		
		// // adding another date *after* having sorted datesList
		// datesList.add(new SimpleDate(11, 11, 2000));
		// System.out.println("datesList (no longer properly sorted): " + datesList);
		
		// if (datesList.contains(new SimpleDate(1, 1, 2001))) {
		// 	System.out.println("'datesList' contains Jan 1, 2001");
		// } else {
		// 	System.out.println("'datesList' does NOT contain Jan 1, 2001");
		// }


		// SortedSet<SimpleDate> datesSet = new TreeSet<>(datesList);
		// System.out.println("datesSet: " + datesSet);

		// datesSet.add(new SimpleDate(5, 12, 2000));
		// System.out.println("datesSet: " + datesSet);
		
		// if (datesSet.contains(new SimpleDate(1, 1, 2001))) {
		// 	System.out.println("'datesSet' contains Jan 1, 2001");
		// } else {
		// 	System.out.println("'datesSet' does NOT contain Jan 1, 2001");
		// }
	}

}
