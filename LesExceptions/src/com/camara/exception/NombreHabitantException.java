package com.camara.exception;

public class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Le nombre d'habitant doit �tre sup�rieur � z�ro");
	}
	
	public NombreHabitantException(int nbre) {
		System.out.println("Le nombre d'habitant doit �tre sup�rieur � z�ro");
		System.out.println("\t=> " + nbre);
	}
}
