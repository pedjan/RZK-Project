package com.projekat.rzk.beans;

import java.util.Date;
import java.util.List;

public class Prikaz {

	private int id;
	private Date vreme;
	private List<Karta> kartas;
	private Film film;
	private Sala sala;
	public Prikaz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prikaz(int id, Date vreme, List<Karta> kartas, Film film, Sala sala) {
		super();
		this.id = id;
		this.vreme = vreme;
		this.kartas = kartas;
		this.film = film;
		this.sala = sala;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getVreme() {
		return vreme;
	}
	public void setVreme(Date vreme) {
		this.vreme = vreme;
	}
	public List<Karta> getKartas() {
		return kartas;
	}
	public void setKartas(List<Karta> kartas) {
		this.kartas = kartas;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
}
