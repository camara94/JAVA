package com.camara.generiques;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Garage {
	List<Voiture> list = new ArrayList<Voiture>();
	
	public void add(List<? extends Voiture> listVoiture) {
		for(Voiture v: listVoiture) 
			list.add(v);
		
		System.out.println("Contenu de notre garage : ");
		ListIterator lv = list.listIterator();
		
		while(lv.hasNext())
			System.out.println(lv.next());
	}
}
