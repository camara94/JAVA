package com.camara.exception;

public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHbts;
	public Ville() {
		this.nomVille = "Inconnu";
		this.nomPays = "Inconnu";
		this.nbreHbts = 0;
	}
	public Ville(String nomVille, int nbreHbts, String nomPays) throws NombreHabitantException, NomVilleException {
		if (nbreHbts < 0) {
			throw new NombreHabitantException(nbreHbts);
		}
		if(nomVille.length() < 3){
			throw new NomVilleException("Le nom d'une ville doit être supérieur à 3 caractère");
		}else {
			this.nomVille = nomVille;
			this.nomPays = nomPays;
			this.nbreHbts = nbreHbts;
		}
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHbts() {
		return nbreHbts;
	}

	public void setNbreHbts(int nbreHbts) {
		this.nbreHbts = nbreHbts;
	}
	
	@Override
	public String toString() {
		String str = this.getNomVille() + " est une ville de " + this.getNomPays() + ", elle comporte : " + this.getNbreHbts() + " habitant(s)";
		return str;
	}

}
