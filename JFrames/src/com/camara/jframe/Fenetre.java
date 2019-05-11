package com.camara.jframe;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre() {
		//Définir un titre pour notre fenêtre
		this.setTitle("Ma première fenêtre Java");
		//Définir sa taille : 400 pixels de large et 100 pixels de haut
		this.setSize(400, 200);
		//Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Définir un emplacement de votre fenêtre
		this.setLocation(100,100);
		//Garger la fenêtre au premier plan
		this.setAlwaysOnTop(true);
		//System.out.println(this.countComponents());
		this.setContentPane(new Panneau());
		//En fin, la rendre visible
		this.setVisible(true);
	}
}
