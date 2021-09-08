package mellat.ir.card.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mellat.ir.card.model.Book;
import mellat.ir.card.service.BookService;

@RestController

public class BookController {
	
	@Autowired
	private BookService bookService;

	
    @GetMapping("/books")
    public ArrayList<Book> list() {
        return bookService.findAll();
    }
}