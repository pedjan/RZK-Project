package com.projekat.rzk.beans;

public class Karta {

	private int id;
	private int broj;
	private Korisnik korisnik;
	private Prikaz prikaz;
	public Karta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Karta(int id, int broj, Korisnik korisnik, Prikaz prikaz) {
		super();
		this.id = id;
		this.broj = broj;
		this.korisnik = korisnik;
		this.prikaz = prikaz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public Prikaz getPrikaz() {
		return prikaz;
	}
	public void setPrikaz(Prikaz prikaz) {
		this.prikaz = prikaz;
	}
	
	
}
