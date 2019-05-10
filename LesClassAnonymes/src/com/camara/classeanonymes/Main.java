package com.camara.classeanonymes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Guerrier pers = new Guerrier();
		
		pers.setSoin(new Soin() {
			public void soigner() {
				System.out.println("Je soigne avec une classe anonyme !");
			}
		});
		//pers.soigner();
		Soin p = new Soin() {
			 public void soigner() {System.out.println("Je soigne avec une lambda en java !");}
		};
		
		p.soigner();
		p.toto(10);
		
		Dialoguer d = new Dialoguer() {
			public void parler(String[] lang) {
				System.out.println("Je parle " + lang.length + " langue(s) : \n");
				for(String str: lang) {
					System.out.println(" * " +str);
				}
			}
		};
		String[] lang = {"Français", "Anglais"};
		Dialoguer d = (lan)-> {
			System.out.println("Je parle " + lan.length + " langue(s)\n");
			for(String l: lan)
				System.out.println(" * " + l);
		};
		
		d.parler(lang);
			Function<Double, Double> de = (dd) ->{return dd*5;};
			
			double l  = de.apply(40.5);
			System.out.println(l);
			
			Predicate<Integer> pp = (pr)->{if (pr> 10) return true;
			return false;};
			
			if(pp.test(8+1+5)) {
				System.out.println("Bonne valeur");
			} else {
				System.out.println("Augmenter la valeur encore !");
			}
		
		List<Personne> pers1 = Arrays.asList(
				new Personne(24,"Camara"),
				new Personne(23, "Karamo"),
				new Personne(22,"Kaba"),
				new Personne(45, "Traoré")
		);
		
		Function<Personne, Integer> lamb = (pp)->{
			int age = pp.getAge() * 3;
			pp.setAge(age);
			return pp.getAge()*3;
		};
		
		ListIterator ld = pers1.listIterator();
		
		for(Personne i: pers1) {
			lamb.apply(i);
			System.out.println(ld.next().toString());
		}
		
		Predicate<Personne> dd = (pa)->{
			if (pa.getAge()>=18) return true;
			return false;
		};
		
		while(ld.hasNext()) {
			if (dd.test((Personne)ld.next()))
				System.out.println(((Personne)ld.next()).getNom() + " est majeur");
		}*/
		
		
		List<Personne> lPersonne = Arrays.asList(
				new Personne(10, "toto"),
				new Personne(20, "titi"),
				new Personne(30, "tata"),
				new Personne(40, "tutu")
		);
		
		/*Function<Personne, String> f1 = (Personne p) -> p.getNom();
		Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
		System.out.println(transformToListString(lPersonne, f1));
		System.out.println(transformToListInt(lPersonne, f2));*/
		
		Consumer<String> dd = System.out::println;
		
		dd.accept("Camara Laby Damaro");
		
		Dialoguer ddd = System.out::println;
		ddd.parler("Je parle bien le Français");
		
		
	}
	
	
	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
		List<String> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici le nom de l'objet Personne
		}
		return ls;		
	}
	public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
		List<Integer> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
		}
		return ls;		
	}

}
