package com.camara.jeu;

public abstract class Personnage {
	protected String armes = "";
	protected String chaussure ="";
	protected String sacSoin = "";
	
	public String getArmes() {
		return armes;
	}
	public void setArmes(String armes) {
		this.armes = armes;
	}
	public String getChaussure() {
		return chaussure;
	}
	public void setChaussure(String chaussure) {
		this.chaussure = chaussure;
	}
	public String getSacSoin() {
		return sacSoin;
	}
	public void setSacSoin(String sacSoin) {
		this.sacSoin = sacSoin;
	}
	
	public void seDeplacer() {
		System.out.println("Je me déplace à pieds.");
	}
	public void combattre() {
		System.out.println("Je ne combats pas.");
	}
	public void soigner() {
		System.out.println("Je ne soigne pas.");
	}
}
