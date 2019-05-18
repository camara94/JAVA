package com.camara.evenements;

public class TestPile {
	public TestPile() {
		System.out.println("D�but de constructeur !");
		this.methode1();
		System.out.println("Fin de constructeur !");
	}
	
	private void methode1() {
		System.out.println("D�but de m�thode 1 !");
		this.methode2();
		System.out.println("Fin de m�thode 1 !");
	}
	
	private void methode2() {
		System.out.println("D�but de m�thode 2 !");
		this.methode3();
		System.out.println("Fin de m�thode 2 !");
	}
	
	private void methode3() {
		System.out.println("D�but de m�thode 3 !");
		System.out.println("Fin de m�thode 3 !");
	}
}
