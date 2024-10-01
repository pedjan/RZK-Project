package com.projekat.rzk.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projekat.rzk.model.Prikaz;

public interface PrikazRepository extends JpaRepository<Prikaz, Integer>{

	@Query("select p from Prikaz p where p.film.id =:id")
	List<Prikaz> findByIdFilma(@Param("id") Integer id);
}
