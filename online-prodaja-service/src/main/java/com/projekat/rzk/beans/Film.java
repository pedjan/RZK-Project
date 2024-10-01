package com.projekat.rzk.beans;

import java.util.List;


public class Film {
	
	private int id;
	private String ime;
	private String reziser;
	private String zanr;
	private List<Prikaz> prikazs;
	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(int id, String ime, String reziser, String zanr, List<Prikaz> prikazs) {
		super();
		this.id = id;
		this.ime = ime;
		this.reziser = reziser;
		this.zanr = zanr;
		this.prikazs = prikazs;
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

	public String getReziser() {
		return reziser;
	}

	public void setReziser(String reziser) {
		this.reziser = reziser;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public List<Prikaz> getPrikazs() {
		return prikazs;
	}

	public void setPrikazs(List<Prikaz> prikazs) {
		this.prikazs = prikazs;
	}


	
	
}
