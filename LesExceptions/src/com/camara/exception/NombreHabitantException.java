package com.camara.exception;

public class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Le nombre d'habitant doit être supérieur à zéro");
	}
	
	public NombreHabitantException(int nbre) {
		System.out.println("Le nombre d'habitant doit être supérieur à zéro");
		System.out.println("\t=> " + nbre);
	}
}
