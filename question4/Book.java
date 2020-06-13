package question4;

public class Book {
	private int page;
	public Book(int page) {
		this.page=page;
	}
	
	public int read() {
		return page;
	}
	public int read(int start) {
		return page-start;
	}
}
