package lu.uni.programming1;

public class Reader extends Person {
	
	private int readerNr;
	private static int nextReaderNr = 1000;
	
	public Reader(String name, Address address) {
		super(name, address);
		initializeReaderNr();
	}

	public Reader(String name, String street, int zip, String city) {
		super(name, street, zip, city);
		initializeReaderNr();
	}

	private void initializeReaderNr() {
		readerNr = nextReaderNr++;
	}
	
	public int getReaderNr() {
		return readerNr;
	}

	@Override
	public String toString() {
		return "Reader " + readerNr + ": " + super.toString();
	}
	
}
