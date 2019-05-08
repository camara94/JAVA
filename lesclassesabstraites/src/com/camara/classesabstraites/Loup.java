package com.camara.classesabstraites;

public class Loup extends Canin{
	public Loup() {
	}
	
	public Loup(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je hurle à la lune en faisant ouhouh !");
	}

}
