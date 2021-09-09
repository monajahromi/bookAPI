package com.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;

@RestController

public class BookController {

	@Autowired
	private BookService bookService;

	@CrossOrigin
	@GetMapping("/books")
	public ArrayList<Book> list() {
		return bookService.findAll();
	}

	@CrossOrigin
	@GetMapping("/books/{id}")
	public Book one(@PathVariable Integer id) {

		return bookService.findById(id).orElseThrow(() -> {throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book Not Found");});
	}


	@CrossOrigin
	@GetMapping("/books/search/{searchTerm}")
	List<Book> bookBySearch(@PathVariable String searchTerm) {

		return bookService.SearchByTerms(searchTerm);
	}
}