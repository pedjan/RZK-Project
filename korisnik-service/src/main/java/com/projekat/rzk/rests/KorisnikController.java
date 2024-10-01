package com.projekat.rzk.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.projekat.rzk.model.Korisnik;
import com.projekat.rzk.services.KorisnikService;

@RestController
public class KorisnikController {

	@Autowired
	KorisnikService service;
	
	@GetMapping("/korisnik/login/{korIme}/{sifra}")
	public Korisnik login(@PathVariable String korIme, @PathVariable String sifra){
		return service.login(korIme, sifra);
	}
	
	@GetMapping("/korisnik/register/{ime}/{korIme}/{sifra}")
	public boolean register(@PathVariable String ime, @PathVariable String korIme, @PathVariable String sifra){
		return service.register(ime, korIme, sifra);
	}	
}
