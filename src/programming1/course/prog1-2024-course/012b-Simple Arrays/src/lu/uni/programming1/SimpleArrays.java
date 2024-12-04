package lu.uni.programming1;

public class SimpleArrays {

	public static void main(String[] args) {
		// create an array with three elements of type int;
		// the size of arrays cannot be changed after having been created
		// [please note that an array effectively is an object]
		int arr1[] = { 10, 20, 30 };
		
		// accessing a single slot
		System.out.println("slot 1 of arr1 contains: " + arr1[1]);
		
		// the size of an array can be determined via array.length
		// for (int i=0 ; i<arr1.length ; ++i)
		// 	System.out.print("arr1[" + i + "] == " + arr1[i] + "   ");
		// System.out.println();

		// enhanced for loop: "shortcut" for iterating through arrays
		// for (int value : arr1)
		// 	// NO access to loop counter / slot number !
		// 	System.out.print("value == " + value + "   ");
		// System.out.println();

		// compute the average of an arbitrary number of values
		// double sum = 0;
		// for (int value: arr1)
		// 	sum += value;
		// double average = sum / arr1.length;
		// System.out.println("average = " + average);
		
		// int [] arr2; // [] can be placed after type or after variable name
		// int arr3[5]; // cannot specify capacity as part of the declaration
		
		// int capacity = 4;
		// the declaration of the variable holding an array AND the creation
		// of the array itself can be done in separate statements
		// arr2 = new int [capacity];
		
		// for (int value : arr2)
		// 	value = 42; // DOES NOT WORK as expected, since value is a _copy_
		
		// for (int i=0 ; i<arr2.length ; ++i) {
		// 	arr2[i] = i * 11;
		// 	System.out.print("arr2[" + i + "] == " + arr2[i] + "   ");
		// }
		// System.out.println();
		
		// array access always performs bounds checking, throwing
		// an exception in case of attempting to use a wrong
		// index (1 past end in this particular case)
		// System.out.println("out of bounds access: " + arr2[arr2.length]);
	}

}
