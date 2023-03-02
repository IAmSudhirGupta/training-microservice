package com.training.microservice.db;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.microservice.db.model.Book;
import com.training.microservice.db.repository.BookRepository;

@SpringBootApplication
public class DatabaseServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		bookRepository.save(new Book("Java"));
		bookRepository.save(new Book("Machine Learning"));
		bookRepository.save(new Book("AI"));
		bookRepository.save(new Book("C++"));
		bookRepository.save(new Book("Spark"));
		bookRepository.save(new Book("Apache"));
		bookRepository.save(new Book("Kafka"));
		bookRepository.save(new Book("Redis"));
		bookRepository.save(new Book("Redis"));

		bookRepository.findAll().forEach(book -> System.out.println(book));

		Optional<Book> book = bookRepository.findById(2L);
		System.out.println("Book : " + book);
		Optional<Book> bookName = bookRepository.findByName("Data Science");
		if (!bookName.isPresent()) {
			bookRepository.save(new Book("Data Science"));
		}

		bookRepository.deleteById(1L);
		bookRepository.findAll().forEach(b -> System.out.println(b));

		System.out.println("Find by Name List Custom");
		bookRepository.findByNameBookList("Redis").forEach(bk -> System.out.println(bk));

	}

}
