package com.projekat.rzk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.rzk.exceptions.KartaException;
import com.projekat.rzk.exceptions.MaxKarataException;
import com.projekat.rzk.model.Film;
import com.projekat.rzk.model.Karta;
import com.projekat.rzk.model.Prikaz;
import com.projekat.rzk.repositories.FilmRepository;
import com.projekat.rzk.repositories.KartaRepository;
import com.projekat.rzk.repositories.KorisnikRepository;
import com.projekat.rzk.repositories.PrikazRepository;

@Service
public class KartaService {

	@Autowired
	KartaRepository kr;
	
	@Autowired
	KorisnikRepository kkr;
	
	@Autowired
	PrikazRepository pr;
	
	@Autowired 
	FilmRepository fr;
	
	public List<Karta> sveKarte() {
		return kr.findAll();
	}
	
	public List<Film> sviFilmovi() {
		return fr.findAll();
	}
	
	public List<Prikaz> prikaziZaFilm(int idFilma) {
		return pr.findByIdFilma(idFilma);
	}
	
	public Karta kupiKartu(int idPrikaza, int idKorisnika) {
		if(kr.getBrKarataByIdPrikaza(idKorisnika) > 20) {
			throw new MaxKarataException("Sve karte za ovu predstavu su prodate");
		} else {
			Karta k = new Karta();
			k.setBroj(7);
			k.setKorisnik(kkr.findById(idKorisnika).get());
			k.setPrikaz(pr.findById(idPrikaza).get());
			Karta novaKarta = kr.save(k);
			if(novaKarta == null) {
				throw new KartaException("Greska prilikom kupovine, korisnik: " + kkr.findById(idKorisnika).get().getIme() + " film: " + pr.findById(idPrikaza).get().getFilm().getIme());
			} else {
				return novaKarta;
			}
		}
	}

	public List<Film> filmoviZaNaziv(String naziv) {
		return fr.findByName(naziv);
	}
}
