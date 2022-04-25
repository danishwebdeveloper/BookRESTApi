package com.springbootrestapi.bookrestapi.services;

import java.util.List;

import com.springbootrestapi.bookrestapi.entities.Book;

public interface BooksService {
	
	public List<Book> getBooks();

	public Book getBook(long bookId);
}
