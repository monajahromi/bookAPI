package mellat.ir.card.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mellat.ir.card.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

	ArrayList<Book> findAll();

}

