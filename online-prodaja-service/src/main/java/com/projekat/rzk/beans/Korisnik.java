package com.projekat.rzk.beans;

import java.util.List;

public class Korisnik {

	private int id;
	private String ime;
	private int jmbg;
	private String prezime;
	private List<Karta> kartas;
	public Korisnik() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Korisnik(int id, String ime, int jmbg, String prezime, List<Karta> kartas) {
		super();
		this.id = id;
		this.ime = ime;
		this.jmbg = jmbg;
		this.prezime = prezime;
		this.kartas = kartas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getJmbg() {
		return jmbg;
	}
	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public List<Karta> getKartas() {
		return kartas;
	}
	public void setKartas(List<Karta> kartas) {
		this.kartas = kartas;
	}
	
	
	
}
