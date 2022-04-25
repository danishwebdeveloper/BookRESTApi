package com.springbootrestapi.bookrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.bookrestapi.controller.exception.ApiExceptionHandler;
import com.springbootrestapi.bookrestapi.controller.exception.ApiRequestException;
import com.springbootrestapi.bookrestapi.entities.Book;
import com.springbootrestapi.bookrestapi.services.BooksService;

@RestController
public class MainController {
	
	@Autowired
	private BooksService courseServiceObj;
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.courseServiceObj.getBooks();
	}
	
	@GetMapping("/books/{UUID}")
	public Book getBook(@PathVariable String UUID) {
		Book b = courseServiceObj.getBook(Long.parseLong(UUID));
		if(b == null) {
			throw new ApiRequestException("Book with ID No: " + UUID + " not found");
		}
		else if(!b.isActive()) {
			throw new ApiRequestException("Book with ID No: " + UUID + " is found, but following item is out of stock!");
		}
		else {
		return this.courseServiceObj.getBook(Long.parseLong(UUID));
		}
	}
}
