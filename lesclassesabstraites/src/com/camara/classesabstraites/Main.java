package com.camara.classesabstraites;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chien c = new Chien("Gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
		System.out.println("---------------------------------------------------");
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
	}

}
