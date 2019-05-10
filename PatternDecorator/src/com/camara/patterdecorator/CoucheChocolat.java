package com.camara.patterdecorator;

public class CoucheChocolat extends Couche{

	public CoucheChocolat(Patisserie pat) {
		super(pat);
		this.nom = "\t- Une couche de chocolat.\n";
	}
}
