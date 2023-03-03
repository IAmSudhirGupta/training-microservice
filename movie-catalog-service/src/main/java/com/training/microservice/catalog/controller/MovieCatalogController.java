package com.training.microservice.catalog.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.microservice.catalog.model.CatalogItem;
import com.training.microservice.catalog.model.UserRating;
import com.training.microservice.catalog.service.MovieInfo;
import com.training.microservice.catalog.service.UserRatingInfo;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	public MovieCatalogController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId){
		UserRating userRating = userRatingInfo.getUserRating(userId);
		
		return userRating.getRatings().stream()
				.map(rating -> movieInfo.getCatalogItem(rating))
				.collect(Collectors.toList());
	}

}