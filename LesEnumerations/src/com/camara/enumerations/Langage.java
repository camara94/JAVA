package com.camara.enumerations;

public enum Langage {
	JAVA("Le langage JAVA","Eclipse"),
	PHP("Le langage", "SublimeText"),
	JS("Le langage JavaScript", "VSCode"),
	CPlus("Le langage C++","Visual Studio"),
	CSharp("Le langage C#","Visual Studio");
	
	private String name = "";
	private String editeur = "";
	
	private Langage(String name, String editeur) {
		this.name = name;
		this.editeur = editeur;
	}
	
	public void getEditeur() {
		System.out.println("Editeur : " + this.editeur);
	}
	
	public void getName() {
		System.out.println(this.editeur);
	}
	public String toString() {
		return this.name + ": éditeur " + this.editeur;
	}
}
