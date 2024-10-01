package com.projekat.rzk.beans;

import java.util.List;

public class Sala {

	private int id;
	private int fotelja;
	private String ime;
	private List<Prikaz> prikazs;
	public Sala() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sala(int id, int fotelja, String ime, List<Prikaz> prikazs) {
		super();
		this.id = id;
		this.fotelja = fotelja;
		this.ime = ime;
		this.prikazs = prikazs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFotelja() {
		return fotelja;
	}
	public void setFotelja(int fotelja) {
		this.fotelja = fotelja;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public List<Prikaz> getPrikazs() {
		return prikazs;
	}
	public void setPrikazs(List<Prikaz> prikazs) {
		this.prikazs = prikazs;
	}
	
	
}
