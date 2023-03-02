package com.training.microservice.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	public Book() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String name;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + "]";
	}
	
}
