package lu.uni.programming1;

import java.util.Objects;

@SuppressWarnings("unused")
public class Launcher {

	public static void main(String[] args) {
		String hello1 = new String("Hello");


		if (hello1 == "Hello") {
			System.out.println("hello1 == \"Hello\"");
		} else {
			System.out.println("hello1 != \"Hello\"");
		}


		// if (hello1.equals("Hello")) {
		// 	System.out.println("hello1.equals(\"Hello\") is true");
		// } else {
		// 	System.out.println("hello1.equals(\\\"Hello\\\") is false");
		// }


		// if (Objects.equals(hello1, "Hello")) {
		// 	System.out.println("Objects.equals(hello1, \"Hello\") is true");
		// } else {
		// 	System.out.println("Objects.equals(hello1, \"Hello\") is false");
		// }


		// if ("Hello" == "Hello") {
		// 	System.out.println("\"Hello\" == \"Hello\"");
		// } else {
		// 	System.out.println("\"Hello\" != \"Hello\"");
		// }
	}

}
