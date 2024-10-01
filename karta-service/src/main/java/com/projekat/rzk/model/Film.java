package com.projekat.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the film database table.
 * 
 */
@Entity
@NamedQuery(name="Film.findAll", query="SELECT f FROM Film f")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String ime;

	private String reziser;

	private String zanr;

	@JsonIgnore
	//bi-directional many-to-one association to Prikaz
	@OneToMany(mappedBy="film")
	private List<Prikaz> prikazs;

	public Film() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getReziser() {
		return this.reziser;
	}

	public void setReziser(String reziser) {
		this.reziser = reziser;
	}

	public String getZanr() {
		return this.zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public List<Prikaz> getPrikazs() {
		return this.prikazs;
	}

	public void setPrikazs(List<Prikaz> prikazs) {
		this.prikazs = prikazs;
	}

	public Prikaz addPrikaz(Prikaz prikaz) {
		getPrikazs().add(prikaz);
		prikaz.setFilm(this);

		return prikaz;
	}

	public Prikaz removePrikaz(Prikaz prikaz) {
		getPrikazs().remove(prikaz);
		prikaz.setFilm(null);

		return prikaz;
	}

}