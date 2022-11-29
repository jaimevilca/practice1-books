package com.example.books.controller;

import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("books", bookService.findAll());
		return "book_list";
	}

	@GetMapping("/book/{id}")
	public String book(Model model, @PathVariable int id) {
		model.addAttribute("book", bookService.findById(id));
		return "book";
	}

}
