package com.camara.streams;

//Et une classe de test : 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Personne> listP = Arrays.asList(
				new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
		);	
		
		Stream<Personne> sp = listP.stream();
		
		sp.filter(x->x.getPoids()>50)
			.map(x->x.getPoids())
			.forEach(System.out::println);
		
		sp = listP.stream();
		double d = sp
		.filter(x -> x.getPoids()>50)
		.map(x->x.getPoids())
		.reduce(0.0d, (x,y)->x+y);
		System.out.println("La somme des âges : " + d);
		
		sp = listP.stream();
		long lo = sp .filter(x->x.getPoids() >= 70)
			.map(x->x.getPoids())
			.count();
		System.out.println("Le nombre de personne restant : " + lo);
		//Stream.iterate(2d, (x)->x+1).limit(10).forEach(System.out::println);
		
	}
}