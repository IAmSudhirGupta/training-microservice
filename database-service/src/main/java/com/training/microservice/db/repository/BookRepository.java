package com.training.microservice.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.training.microservice.db.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	Optional<Book> findByName(String name);

	@Query("select u from Book u where u.name = :name")
	List<Book> findByNameBookList(String name);

}
