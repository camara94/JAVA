package com.camara.jeu;

import com.camara.comportement.CombatPistolet;
import com.camara.comportement.Deplacement;
import com.camara.comportement.EspritCombatif;
import com.camara.comportement.Soin;

public class Guerrier extends Personnage{
	public Guerrier(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		super(espritCombatif, deplacement, soin);
		// TODO Auto-generated constructor stub
	}

	public Guerrier() {
		this.espritCombatif = new CombatPistolet();
	}
}
