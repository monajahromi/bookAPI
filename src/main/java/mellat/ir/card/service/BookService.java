package mellat.ir.card.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mellat.ir.card.model.Book;
import mellat.ir.card.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public ArrayList<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book save(Book book) {
		return bookRepository.save(book);
	}

	public Iterable<Book> saveAll(List<Book> books) {
		return bookRepository.saveAll(books);
	}

}