package com.projekat.rzk.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the karta database table.
 * 
 */
@Entity
@NamedQuery(name="Karta.findAll", query="SELECT k FROM Karta k")
public class Karta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int broj;

	//bi-directional many-to-one association to Korisnik
	@JsonIgnore
	@ManyToOne
	private Korisnik korisnik;

	//bi-directional many-to-one association to Prikaz
	@JsonIgnore
	@ManyToOne
	private Prikaz prikaz;

	public Karta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBroj() {
		return this.broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public Korisnik getKorisnik() {
		return this.korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Prikaz getPrikaz() {
		return this.prikaz;
	}

	public void setPrikaz(Prikaz prikaz) {
		this.prikaz = prikaz;
	}

}