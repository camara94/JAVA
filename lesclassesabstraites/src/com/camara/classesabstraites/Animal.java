package com.camara.classesabstraites;

public abstract class Animal {
	protected int poids;
	protected String couleur;
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void manger() {
		// TODO Auto-generated method stub
		System.out.println("Je mange de la viande !");
	}
	public void boire() {
		// TODO Auto-generated method stub
		System.out.println("Je bois de l'eau !");
	}
	
	public abstract void deplacement();
	public abstract void crier();
	
	@Override
	public String toString() {
		String str = "Je suis un objet de la " + this.getClass().getName() + ", je suis " + this.couleur + ", je pèse " + this.poids;
		return str;
	}
	
}
