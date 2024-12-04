package lu.uni.programming1;

public class ClassicSwitch {

	public static void main(String[] args) {
		char answer = 'n';
				
		switch (answer) {
		case 'y':
		case 'Y':
			System.out.println("handle 'yes' ...");
			break; // without break: fall-through to next case:
		case 'n', 'N':
			System.out.println("handle 'no' ...");
			break;
		default:
			// always a good idea to include a 'default' branch ...
			System.out.println("handle invalid answer ...");
			break; // break not strictly necessary here, but still recommended!
			       // since one might add another case later; default does not
			       // need to be the last branch ...
		}
	}

}
