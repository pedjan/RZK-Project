package com.projekat.rzk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.rzk.model.Korisnik;
import com.projekat.rzk.repositories.KorisnikRepository;

@Service
public class KorisnikService {

	@Autowired
	KorisnikRepository kr;

	public Korisnik login(String korIme, String sifra) {
		return kr.login(korIme, sifra);
	}

	public boolean register(String ime, String korIme, String sifra) {
		Korisnik k = new Korisnik();
		k.setIme(ime);
		k.setKorIme(korIme);
		k.setSifra(sifra);
		Korisnik novi = kr.save(k);
		if(novi != null) {
			return true;
		} else {
			return false;
		}
	}	
}
