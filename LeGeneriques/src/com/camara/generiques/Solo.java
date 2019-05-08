package com.camara.generiques;

public class Solo<T> {
	private T valeur;
	
	public Solo(T valeur) {
		this.valeur = valeur;
	}

	public T getValeur() {
		return valeur;
	}

	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	
}
