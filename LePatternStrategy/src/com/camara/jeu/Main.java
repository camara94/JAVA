package com.camara.jeu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
		String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil � pompe", "couteau"};
		for(int i = 0; i < tPers.length; i++) {
			System.out.println("\nInstance de " + tPers[i].getClass().getName());
			System.out.println("******************************************");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}
			
	}

}