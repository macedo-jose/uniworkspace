package lu.uni.programming1;

public class Highlander {

	private static Highlander theOneAndOnlyHighlander;
	
	private Highlander() {
		// initialize whatever you need to ...
	}
	
	public static Highlander getTheHighlander() {
		// !!! this is evil, non-thread-safe code !!!
		if (theOneAndOnlyHighlander == null)
			theOneAndOnlyHighlander = new Highlander();
		return theOneAndOnlyHighlander;
	}
	
	public void fight() {
		System.out.println("Connor MacLeod fights!");
	}
	
}
