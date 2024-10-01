package com.projekat.rzk.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projekat.rzk.beans.Film;
import com.projekat.rzk.beans.Karta;
import com.projekat.rzk.beans.Prikaz;
import com.projekat.rzk.proxy.ProdajaProxy;

@RestController
public class ProdajaController {

	@Autowired
	ProdajaProxy proxy;
	
	@GetMapping("/filmovi/prikaz")
	public List<Film> prikazFilmova() {
		return proxy.sviFilmovi();
		
	}
	
	@GetMapping("/filmovi/filmoviByIme/{ime}")
	public List<Film> prikazFilmovaZaIme(@PathVariable String ime) {
		return proxy.filmoviZaNaziv(ime);	
	}
	
	@GetMapping("/filmovi/prikaziZaFilm/{idFilma}")
	public List<Prikaz> prikaziZaFilm(@PathVariable int idFilma) {
		return proxy.prikaziZaFilm(idFilma);
	}
	
	@PostMapping("/karte/kupi/{idPrikaza}/{idKorisnika}")
	public Karta kupovinaKarata(@PathVariable int idPrikaza, @PathVariable int idKorisnika) {
		return proxy.kupovinaKarata(idPrikaza, idKorisnika);
		
	}	
	
}
