package com.camara.classesabstraites;

public class Chat extends Felin{

	public Chat() {
	}
	
	public Chat(String couleur, int poids) {
		this.poids = poids;
		this.couleur = couleur;
	}
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je miaule sur les toits !");
	}

}
