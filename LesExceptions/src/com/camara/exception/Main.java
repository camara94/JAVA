package com.camara.exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int j = 20, i = 0;
		try {
			System.out.println(" =>" + j/i);
		} catch(ArithmeticException e) {
			System.out.println("La division par zéro ! " + e.getMessage());
		} finally {
			System.out.println("Action faite systématiquement");
		}*/
		Ville djerba = null;
		try {
			djerba = new Ville("Djerba",12456, "Tunisie");
			
		} catch (NombreHabitantException | NomVilleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if(djerba == null)
				djerba = new Ville();
		}
		
		System.out.println(djerba.toString());
		
	}

}
