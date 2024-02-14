package com.book;

public class BookModel {
	private String bookname;
	private int bookprice;
	private String authorname;
	private int bookid;
	
	public BookModel(int bookid,String bookname,int bookprice,String authorname) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
		this.authorname=authorname;
	}
	
	public BookModel() {
		// TODO Auto-generated constructor stub
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public String getAuthorname() {
		return authorname;
	}
	
	
	
	

}
