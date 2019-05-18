package com.camara.evenements;

public class TestPile {
	public TestPile() {
		System.out.println("Début de constructeur !");
		this.methode1();
		System.out.println("Fin de constructeur !");
	}
	
	private void methode1() {
		System.out.println("Début de méthode 1 !");
		this.methode2();
		System.out.println("Fin de méthode 1 !");
	}
	
	private void methode2() {
		System.out.println("Début de méthode 2 !");
		this.methode3();
		System.out.println("Fin de méthode 2 !");
	}
	
	private void methode3() {
		System.out.println("Début de méthode 3 !");
		System.out.println("Fin de méthode 3 !");
	}
}
