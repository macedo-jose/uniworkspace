package lu.uni.programming1;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int arr[][];
		
		// option 1: every row has the same capacity (i.e. rectangular matrix)
		arr = new int [3][5];
		
		// option 2: each row has an individual capacity
		// arr = new int [3][];
		// arr[0] = new int [6];
		// arr[1] = new int [8];
		// arr[2] = new int [10];
		
		for (int row=0 ; row<arr.length ; ++row) {
			for (int column=0 ; column<arr[row].length ; column++)
				System.out.print(arr[row][column] + " ");
			System.out.println();
		}
	}

}
