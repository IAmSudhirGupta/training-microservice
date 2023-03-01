package com.training.microservice.person.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("also_known_as")
	private List<String> alsoKnownAs;
	@JsonProperty("biography")
	private String biography;
	@JsonProperty("birthday")
	private String birthday;
	@JsonProperty("gender")
	private Integer gender;
	@JsonProperty("known_for_department")
	private String knownForDepartment;
	@JsonProperty("place_of_birth")
	private String placeOfBirth;

	public List<String> getAlsoKnownAs() {
		return alsoKnownAs;
	}

	public void setAlsoKnownAs(List<String> alsoKnownAs) {
		this.alsoKnownAs = alsoKnownAs;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKnownForDepartment() {
		return knownForDepartment;
	}

	public void setKnownForDepartment(String knownForDepartment) {
		this.knownForDepartment = knownForDepartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
}
