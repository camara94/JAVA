package com.camara.classesabstraites;

public class Lion extends Felin {
	public Lion() {
	}
	
	public Lion(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je rugis dans la savane !");
	}

}
