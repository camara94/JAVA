package com.camara.classesabstraites;

public class Tigre extends Felin {

	public Tigre() {
	}
	
	public Tigre(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je grogne très fort !");
	}

}
