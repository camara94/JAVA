package com.camara.generiques;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Solo<Integer> val = new Solo<Integer>(12);
		  Solo<String> valS = new Solo<String>("TOTOTOTO");
		  Solo<Float> valF = new Solo<Float>(12.2f);
		  Solo<Double> valD = new Solo<Double>(12.202568); 
		  
		  System.out.println(val.getValeur());
		  System.out.println(valS.getValeur());
		  System.out.println(valF.getValeur());
		  System.out.println(valD.getValeur());
		  
		  Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", true);
		  System.out.println("Valeur de l'objet dual : val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());
		                
		  Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		  System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2()); 
		  
		  System.out.println("Liste de String");
		  System.out.println("------------------------------");
		  List<String> listeString= new ArrayList<String>();
		  listeString.add("Une chaîne");
		  listeString.add("Une autre");
		  listeString.add("Encore une autre");
		  listeString.add("Allez, une dernière");

		  for(String str : listeString)
		    System.out.println(str);

		  System.out.println("\nListe de float");
		  System.out.println("------------------------------");
		                
		  List<Float> listeFloat = new ArrayList<Float>();
		  listeFloat.add(12.25f);
		  listeFloat.add(15.25f);
		  listeFloat.add(2.25f);
		  listeFloat.add(128764.25f);
		                
		  for(float f : listeFloat)
		    System.out.println(f);
		  
		  List<Voiture> listVoiture = new ArrayList<Voiture>();
		  listVoiture.add(new Voiture());
		  listVoiture.add(new Voiture());
		  
		  List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		  listVoitureSP.add(new VoitureSansPermis());
		  listVoitureSP.add(new VoitureSansPermis());
		  listVoitureSP.add(new VoitureSansPermis());
		  
		  Garage gv = new Garage();
		  gv.add(listVoitureSP);
		  gv.add(listVoiture);
		  
		  //afficher(listVoitureSP);
	}
	
	private static void afficher(List<? extends Voiture> l) {
		for(Voiture v: l)
			System.out.println(v.toString());
	}

}
