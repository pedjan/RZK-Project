package com.projekat.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the prikaz database table.
 * 
 */
@Entity
@NamedQuery(name="Prikaz.findAll", query="SELECT p FROM Prikaz p")
public class Prikaz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@JsonIgnore
	@Temporal(TemporalType.DATE)
	private Date vreme;

	
	//bi-directional many-to-one association to Karta
	@JsonIgnore
	@OneToMany(mappedBy="prikaz")
	private List<Karta> kartas;

	//bi-directional many-to-one association to Film
	@JsonIgnore
	@ManyToOne
	private Film film;

	//bi-directional many-to-one association to Sala
	@JsonIgnore
	@ManyToOne
	private Sala sala;

	public Prikaz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getVreme() {
		return this.vreme;
	}

	public void setVreme(Date vreme) {
		this.vreme = vreme;
	}

	public List<Karta> getKartas() {
		return this.kartas;
	}

	public void setKartas(List<Karta> kartas) {
		this.kartas = kartas;
	}

	public Karta addKarta(Karta karta) {
		getKartas().add(karta);
		karta.setPrikaz(this);

		return karta;
	}

	public Karta removeKarta(Karta karta) {
		getKartas().remove(karta);
		karta.setPrikaz(null);

		return karta;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}