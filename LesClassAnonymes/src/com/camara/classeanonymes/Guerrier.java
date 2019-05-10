package com.camara.classeanonymes;
	
public class Guerrier {
	private Soin soin;
	public void setSoin(Soin s) {
		this.soin = s;
	}
	
	public void soigner() {
		this.soin.soigner();
	}
}
