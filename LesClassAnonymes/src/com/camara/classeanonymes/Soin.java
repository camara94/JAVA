package com.camara.classeanonymes;
@FunctionalInterface
public interface Soin {
	void soigner();	
	public default void toto(int i) {
		System.out.println("Je suis une methode en java !");
	}
}
