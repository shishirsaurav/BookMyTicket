package com.Learning.MovieTicket.repository;


import com.Learning.MovieTicket.domain.Movie;
import com.Learning.MovieTicket.enums.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	boolean existsByTitle(String title);

	public Movie findByTitle(String title);

	public List<Movie> findByGenre(Genre genre);
}