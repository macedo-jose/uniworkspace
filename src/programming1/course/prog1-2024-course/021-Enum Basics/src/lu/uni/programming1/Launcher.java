package lu.uni.programming1;

public class Launcher {

	public static void main(String[] args) {
		Suit s = Suit.SPADES;
		
		System.out.println("Suit as string: " + s);
		System.out.println("Suit as ordinal: " + s.ordinal());
		
		// Suit hearts = Suit.valueOf("HEARTS");
		// System.out.println("Turning 'HEARTS' string into Suit: " + hearts);

		// switch (s) {
		// case CLUBS:
		// 	System.out.println("case: clubs");
		// 	break;
		// case DIAMONDS:
		// 	System.out.println("case: diamonds");
		// 	break;
		// default:
		// 	System.out.println("default: " + s);
		// 	break;
		// }
		
		// System.out.print("values: ");
		// for (Suit x : Suit.values())
		// 	System.out.print(x + ", ");
		// System.out.println();
	}

}
