package com.camara.jeu;

import com.camara.comportement.Deplacement;
import com.camara.comportement.EspritCombatif;
import com.camara.comportement.PremierSoin;
import com.camara.comportement.Soin;

public class Medecin extends Personnage{

	public Medecin() {
		this.soin = new PremierSoin();
	}
	public Medecin(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
		// TODO Auto-generated constructor stub
	}
	
}
