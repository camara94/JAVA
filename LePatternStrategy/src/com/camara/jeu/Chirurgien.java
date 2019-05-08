package com.camara.jeu;

public class Chirurgien extends Personnage {
	@Override
	public void soigner() {
		if (this.sacSoin.equals("gros sac")) {
			System.out.println("Je fais de merveilles.");
		} else {
			System.out.println("e fais des opérations.");
		}
	}
}
