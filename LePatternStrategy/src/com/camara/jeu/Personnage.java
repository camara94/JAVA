package com.camara.jeu;

import com.camara.comportement.*;

public abstract class Personnage {
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Deplacement deplacement = new Marcher();
	protected Soin soin = new AucunSoin();
	
	public Personnage() {
		
	}
	public Personnage(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin) {
		this.espritCombatif = espritCombatif;
		this.deplacement = deplacement;
		this.soin = soin;
	}

	public void seDeplacer() {
		this.deplacement.deplacer();
	}
	
	public void combattre() {
		this.espritCombatif.combat();
	}
	
	public void soigner() {
		this.soin.soigner();
	}
	
	public void setSoin(Soin soin) {
		this.soin = soin;
	}
}
