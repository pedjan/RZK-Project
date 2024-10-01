package com.projekat.rzk.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projekat.rzk.model.Karta;

public interface KartaRepository extends JpaRepository<Karta, Integer> {
	
	@Query("select count(k.id) from Karta k where k.prikaz.id =:id")
	Integer getBrKarataByIdPrikaza(@Param("id") Integer id);

}
