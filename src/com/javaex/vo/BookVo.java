package com.javaex.vo;

public class BookVo {

	private int bookId;
	private String title;
	private String pubs;
	private String date;
	private int authorId;
	private String authorName;
	
	public BookVo() {}
	
	public BookVo( String title, String pubs, String date, int authorId) {
		 
		this.title = title;
		this.pubs = pubs;
		this.date = date;
		this.authorId = authorId;
	}
	
	public BookVo(int bookId, String title, String pubs, String date, int authorId, String authorName) {
		this.bookId = bookId;
		this.title = title;
		this.pubs = pubs;
		this.date = date;
		this.authorId = authorId;
		this.authorName = authorName;
	}

	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubs() {
		return pubs;
	}
	public void setPubs(String pubs) {
		this.pubs = pubs;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
