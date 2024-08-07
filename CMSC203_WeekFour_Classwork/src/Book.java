
public class Book {
	private String title;
	private int isbn;
	
	Book() {
		title = "";
		isbn = 0;
	}
	
	public void setISBN(int isbn) {
		this.isbn = isbn;
	}
	
	public int getISBN() {
		return isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String displayBook() {
		return "Title: " + title + "\nISBN: " + isbn;
	}
	public static void main(String[] args) {
		Book book_one = new Book();
		Book book_two = new Book();
		book_one.setISBN(1933107022);
		book_one.setTitle("Fundamentals of Nursing: Version 5.1");
		book_two.setISBN(739754483);
		book_two.setTitle("Diary Of A Wimpy Kid");
		
		System.out.println(book_one.displayBook());
		System.out.println(book_two.displayBook());
	}

}
