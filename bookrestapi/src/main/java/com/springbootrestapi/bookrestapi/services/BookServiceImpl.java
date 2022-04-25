package com.springbootrestapi.bookrestapi.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrestapi.bookrestapi.entities.Book;


@Service
public class BookServiceImpl implements BooksService {
	
	List<Book> list;
	
	public BookServiceImpl() {
		list = new ArrayList<>();
		list.add(new Book(2, "The 7 Habits of Highly Effective People", "Stephen Covey", BigDecimal.valueOf(29.99), true));
		list.add(new Book(15, "Shahnameh: The Persian Book of Kings", "Abolqasem Ferdowsi", BigDecimal.valueOf(15.99), false));
		list.add(new Book(6, "Think and Grow Rich", "Napoleon Hill", BigDecimal.TEN, true));
		list.add(new Book(7, "The Power of Positive Thinking", "Norman Vincent Peale", BigDecimal.valueOf(19.99), true));
		list.add(new Book(12, "The Power of Mental Discipline", " Randy Streu", BigDecimal.TEN, false));
	}

	@Override
	public List<Book> getBooks() {
		return list;
	}

	@Override
	public Book getBook(long bookId) {
		Book book = null;
		for(Book bookObj:list) {
			if(bookObj.getUUID() == bookId) {
				book = bookObj;
				break;
			}
		}
		return book;
	}

}
