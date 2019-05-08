package com.camara.generiques;

public class Voiture {
	protected String couleur;
	protected String marque;
	protected int vitesse;
	
	public Voiture() {
		this.couleur = "Inconnue";
		this.marque = "Inconnue";
		this.vitesse = 0;
	}

	public Voiture(String couleur, String marque, int vitesse) {
		this.couleur = couleur;
		this.marque = marque;
		this.vitesse = vitesse;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	@Override
	public String toString() {
		return "Voiture [couleur=" + couleur + ", marque=" + marque + ", vitesse=" + vitesse + "]";
	}
	
	
}
