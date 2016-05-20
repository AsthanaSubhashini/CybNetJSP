package dto;

public class Book {

	int bookid;
	String booktitle;
	String bookreview;
	float bookprice;
	String bookauthor;
	
	
	
	
	
	public Book() {
		this(0,"","",0.0f,"");
	}

	public Book(int bookId, String booktitle, String bookreview, float price, String bookauthor) {
		
		this.bookid = bookId;
		this.booktitle = booktitle;
		this.bookreview = bookreview;
		this.bookprice = price;
		this.bookauthor = bookauthor;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookId) {
		this.bookid = bookId;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookreview() {
		return bookreview;
	}

	public void setBookreview(String bookreview) {
		this.bookreview = bookreview;
	}

	
	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookid + ", booktitle=" + booktitle + ", bookreview=" + bookreview + ", price=" + bookprice
				+ ", bookauthor=" + bookauthor + "]";
	}

	
	
	
}
