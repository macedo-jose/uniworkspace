package lu.uni.programming1;

public class Library {
	
	@SuppressWarnings("unused")
	private Librarian manager;

	public Library(Librarian manager) {
		this.manager = manager;
	}
	
	public void borrow(Reader reader, Book book) {
		System.out.println(reader.getName() + " borrows " + book.getTitle());
	}

}
