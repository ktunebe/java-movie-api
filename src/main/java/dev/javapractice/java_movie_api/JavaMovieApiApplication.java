package dev.javapractice.java_movie_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaMovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMovieApiApplication.class, args);
	}



}
