package com.mandaglio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandaglio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
	
}
