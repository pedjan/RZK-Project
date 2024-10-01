package com.projekat.rzk.rests;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projekat.rzk.model.Film;
import com.projekat.rzk.model.Karta;
import com.projekat.rzk.model.Prikaz;
import com.projekat.rzk.services.KartaService;

@Validated
@RestController
public class KartaController {

	@Autowired
	KartaService service;
	
	@Autowired
	Environment env;
	
	
	@GetMapping("/filmovi/sviFilmovi")
	public List<Film> sviFilmovi() {
		return service.sviFilmovi();
	}
	
	@GetMapping("/filmovi/filmoviZaNaziv/{ime}")
	public List<Film> filmoviZaNaziv(@PathVariable String ime) {
		return service.filmoviZaNaziv(ime);
	}
	
	@GetMapping("/filmovi/prikaziZaFilm/{idFilma}")
	public List<Prikaz> prikaziZaFilm(@PathVariable int idFilma) {
		return service.prikaziZaFilm(idFilma);
	}
	
	@PostMapping("/karte/kupiKartu/{idPrikaza}/{idKorisnika}")
	public Karta kupiKartu(@PathVariable int idPrikaza, @PathVariable int idKorisnika) {
		return service.kupiKartu(idPrikaza, idKorisnika);
	}
	
}
