package com.camara.classeanonymes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrier pers = new Guerrier();
		
		pers.setSoin(new Soin() {
			public void soigner() {
				System.out.println("Je soigne avec une classe anonyme !");
			}
		});
		pers.soigner();
	}

}
