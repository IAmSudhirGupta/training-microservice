package com.training.microservice.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.microservice.movieinfo.model.Movie;
import com.training.microservice.movieinfo.model.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.key}")
	private String apiKey;
	@Value("${api.baseUrl}")
	private String baseUrl;

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		// https://api.themoviedb.org/3/movie/500?api_key=55fd3b2e904fd20e99£052117df1b859&language=en-US
		MovieSummary moviesummary = restTemplate.getForObject(
				baseUrl + "/movie/" + movieId + "?api_key=" + apiKey + "&language=en-US", MovieSummary.class);
		return new Movie(movieId, moviesummary.getTitle(), moviesummary.getOverview());
	}
}
