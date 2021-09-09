package com.bookstore.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public ArrayList<Book> findAll() {
		return bookRepository.findAll();
	}

	public Iterable<Book> saveAll(List<Book> books) {
		return bookRepository.saveAll(books);
	}
	
	public Optional<Book> findById(Integer id) {
		return bookRepository.findById( id);
	}
	
	
	public List<Book> SearchByTerms(String searchTerm) {

		List<Book> list1 =  bookRepository.findByTitleContainingIgnoreCase(searchTerm);
		List<Book> list2 =  bookRepository.findByAuthorsContainingIgnoreCase(searchTerm);
		List<Book> list3 =  bookRepository.findByCategoriesContainingIgnoreCase(searchTerm);
		
		List<Book> newList = Stream.of(list1, list2, list3)
								.flatMap(Collection::stream)
								.collect(Collectors.toList());
		
		return newList ; 
                
	}
	

	

}