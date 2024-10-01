package com.projekat.rzk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projekat.rzk.model.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	@Query("select f from Film f where f.ime =:ime")
	List<Film> findByName(@Param("ime") String ime);

}
