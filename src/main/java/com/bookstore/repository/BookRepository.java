package com.bookstore.repository;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

	ArrayList<Book> findAll();
	Optional<Book>  findById(Integer id);
	ArrayList<Book> findByTitleContainingIgnoreCase(String title);
	ArrayList<Book> findByAuthorsContainingIgnoreCase(String authors);
	ArrayList<Book> findByCategoriesContainingIgnoreCase(String categories);
	
	ArrayList<Book> findByTitleContainingIgnoreCaseOrAuthorsContainingIgnoreCaseOrCategoriesContainingIgnoreCase(String title ,String author, String category);
	
	

}

