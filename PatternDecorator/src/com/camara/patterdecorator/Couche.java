package com.camara.patterdecorator;

public abstract class Couche extends Patisserie {
	protected Patisserie pat;
	protected String nom;
	
	public Couche(Patisserie pat) {
		this.pat = pat;
	}
	
	@Override
	public String preparer() {
		String str = this.pat.preparer();
		return str + this.nom;
	}
	
}
