package com.example.books.service;

import com.example.books.model.Book;
import com.example.books.model.Review;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

	private List<Book> books;

	public BookService() {
		this.books = new ArrayList<Book>();

		Review review = new Review(1, "Jordy" , "Libro excelente!" , 4 );
		Book book1 = new Book(1,"Book Title1", "Overview1", "EditorialX", 1999);
		book1.addReview(review);
		books.add(book1);
		books.add(new Book(2,"Book Title2", "Overview2", "EditorialY", 1998));
		books.add(new Book(3, "Book Title3", "Overview3", "EditorialZ", 1997));


	}

	public List<Book> findAll() {
		return books;
	}

	public Book findById(int id) {
		return this.books.stream().filter(book -> book.getId() == id).findAny()
				.orElse(null);
	}

	public void create(String title, String resume, String editor, String year) {
		 this.books.add(new Book(this.books.size(),title,resume, editor, Integer.valueOf(year)));
	}
}
