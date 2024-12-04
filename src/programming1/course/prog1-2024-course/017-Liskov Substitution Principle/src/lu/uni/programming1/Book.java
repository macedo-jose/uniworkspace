package lu.uni.programming1;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	
	public Book(String title, String author, String publisher, String isbn) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return title + "\n" + author + "\n" + publisher + "\n" + isbn + "\n";
	}
}
