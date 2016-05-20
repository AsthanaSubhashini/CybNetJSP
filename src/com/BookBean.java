package com;

import java.util.ArrayList;
import java.util.List;

import dto.Book;

public class BookBean {

	int bookid;
	String booktitle;
	String bookreview;
	float bookprice;
	String bookauthor;
	
	
	
	
	
	public BookBean() {
		this(0,"","",0.0f,"");
	}

	public BookBean(int bookId, String booktitle, String bookreview, float price, String bookauthor) {
		
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

	
	public boolean insertBook()
	{
		BookDao bookDao=new BookDao();
		Book book=new Book();
		book.setBookid(bookid);
		book.setBooktitle(booktitle);
		book.setBookreview(bookreview);
		book.setBookprice(bookprice);
		book.setBookauthor(bookauthor);
		boolean status=bookDao.addBook(book);
		return status;
		
	}
	
	public Book search()
	{
		BookDao bookDao=new BookDao();
		Book book=new Book();
		book=bookDao.searchBook(booktitle);
		return book;
		
	}
	
	
	public List<String> display()
	{
		BookDao bookDao=new BookDao();
		List<String> list = new ArrayList<String>();
		list=bookDao.displayBooks();
		
		for (String string : list) {
			System.out.println(string);
		}
		return list;
	}
	
	public boolean remove()
	{
		BookDao bookDao=new BookDao();
		boolean status=bookDao.removeBook(booktitle);
		return status;
	}
	
	public boolean review()
	{
		BookDao bookDao=new BookDao();
		boolean staus=bookDao.addreview(this.booktitle, this.bookreview);
		return staus;
	}
	
}
