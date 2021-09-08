package mellat.ir.card;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import mellat.ir.card.model.Book;
import mellat.ir.card.service.BookService;

@SpringBootApplication
public class CardApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CardApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BookService bookService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
			//mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>(){};
			//File file = new File(getClass().getResource("jsonschema.json").getFile());
			//mapper.readValue(file, Book.class);
			InputStream inputStream = TypeReference.class.getResourceAsStream("/books.json");
			
			System.out.println("inputStream : " + inputStream);
			
			try {
//				Collection<Book> readValues = new ObjectMapper().readValue(
//					    jsonAsString, new TypeReference<Collection<COrder>>() { }
//					);
				List<Book> books = mapper.readValue(inputStream,typeReference);
				//System.out.println("book : " + books.ge.toString());
				bookService.saveAll(books);
				System.out.println("books Saved!");
			} catch (IOException e){
				System.out.println("Unable to save books: " + e.getMessage());
			}
		};
	}
}
