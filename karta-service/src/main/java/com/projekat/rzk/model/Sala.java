package com.projekat.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the sala database table.
 * 
 */
@Entity
@NamedQuery(name="Sala.findAll", query="SELECT s FROM Sala s")
public class Sala implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int fotelja;

	private String ime;

	@JsonIgnore
	//bi-directional many-to-one association to Prikaz
	@OneToMany(mappedBy="sala")
	private List<Prikaz> prikazs;

	public Sala() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFotelja() {
		return this.fotelja;
	}

	public void setFotelja(int fotelja) {
		this.fotelja = fotelja;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public List<Prikaz> getPrikazs() {
		return this.prikazs;
	}

	public void setPrikazs(List<Prikaz> prikazs) {
		this.prikazs = prikazs;
	}

	public Prikaz addPrikaz(Prikaz prikaz) {
		getPrikazs().add(prikaz);
		prikaz.setSala(this);

		return prikaz;
	}

	public Prikaz removePrikaz(Prikaz prikaz) {
		getPrikazs().remove(prikaz);
		prikaz.setSala(null);

		return prikaz;
	}

}