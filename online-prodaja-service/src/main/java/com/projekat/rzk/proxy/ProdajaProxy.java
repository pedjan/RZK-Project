package com.projekat.rzk.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.projekat.rzk.beans.Film;
import com.projekat.rzk.beans.Karta;
import com.projekat.rzk.beans.Prikaz;


@FeignClient(name="karta-service", url="localhost:8080")
public interface ProdajaProxy {

	@GetMapping("/filmovi/sviFilmovi")
	public List<Film> sviFilmovi();

	@GetMapping("/filmovi/filmoviZaNaziv/{ime}")
	public List<Film> filmoviZaNaziv(@PathVariable String ime);
	
	@GetMapping("/filmovi/prikaziZaFilm/{idFilma}")
	public List<Prikaz> prikaziZaFilm(@PathVariable int idFilma);
	
	@PostMapping("/karte/kupiKartu/{idPrikaza}/{idKorisnika}")
	public Karta kupovinaKarata(@PathVariable int idPrikaza, @PathVariable int idKorisnika);

}
