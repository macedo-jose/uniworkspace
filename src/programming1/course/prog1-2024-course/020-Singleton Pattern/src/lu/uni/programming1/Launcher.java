package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/singleton

public class Launcher {

	public static void main(String[] args) {
		Highlander h;
		
		// h = new Highlander();
		h = Highlander.getTheHighlander();
		h.fight();
	}

}
