package com.camara.entresortie;

public class Notice {
	private String langue;
	public Notice() {
		this.langue = "Fran�ais";
	}
	public Notice(String langue) {
		this.langue = langue;
	}
	
	
	public String toString() {
		return "\t Langue de la notice : " + this.langue + "\n";
	}
	
}
