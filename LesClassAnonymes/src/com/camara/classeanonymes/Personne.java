package com.camara.classeanonymes;

public class Personne {
	private int age;
	private String nom;
	public Personne(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Je m'appelle " + this.nom + " et j'ai " + this.age + " ans";
	}
	
	
	
}
