package com.springbootrestapi.bookrestapi.entities;

import java.math.BigDecimal;

public class Book {
	private long UUID;
	private String title;
	private String author;
	private BigDecimal price;
	private boolean active;
	public Book(long uUID, String title, String author, BigDecimal price, boolean active) {
		super();
		UUID = uUID;
		this.title = title;
		this.author = author;
		this.price = price;
		this.active = active;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [UUID=" + UUID + ", title=" + title + ", author=" + author + ", price=" + price + ", active="
				+ active + "]";
	}
	public long getUUID() {
		return UUID;
	}
	public void setUUID(long uUID) {
		UUID = uUID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
