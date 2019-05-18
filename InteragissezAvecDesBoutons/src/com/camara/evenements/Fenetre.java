package com.camara.evenements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	private Panneau pan = new Panneau();
	private boolean animate = true;
	private JLabel label1 = new JLabel("Mon premier JLabel");
	private int compteur = 0;
	private JButton bouton1, 
					bouton2;
	public Fenetre() {
		this.setTitle("Les évènements en Java");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		label1.setForeground(Color.magenta);
		label1.setFont(new Font("Tohama", Font.BOLD, 18));
		pan.add(label1);
		Bouton bouton = new Bouton("Mon Bouton");
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compteur++;
				label1.setText("Vous avez cliqué " + compteur + " fois");
			}
		});
		//this.getContentPane().add(bouton, BorderLayout.SOUTH);
		JPanel container = new JPanel();
		this.getContentPane().add(container, BorderLayout.SOUTH);
		this.getContentPane().add(pan, BorderLayout.CENTER);
		bouton1 = new Bouton("Damarrer");
		bouton2 = new Bouton("Stop     ");
		container.add(bouton1);
		container.add(bouton2);
		
		bouton1.addActionListener(new Bouton1ActionListener());
		bouton2.addActionListener(new Bouton2ActionListener());
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		
		go();
	}
	
	private void go() {
		boolean backX = false,
				backY = false;
		int x = pan.getPosX(),
				y = pan.getPosY();
		while(this.animate) {
			if (x < 1) backX = false;
			if (x > pan.getWidth() - 50) backX = true;
			
			if (y < 1) backY = false;
			if (x > pan.getHeight() - 50) backY = true;
			
			if (!backX) 
				pan.setPosX(++x);
			else
				pan.setPosX(--x);
			
			if (!backY) 
				pan.setPosY(++y);
			else
				pan.setPosY(--y);
			pan.repaint();
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public class Bouton1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			animate = true;
			bouton1.setEnabled(false);
			bouton2.setEnabled(true);
			go();
		}
	}
	
	public class Bouton2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			animate = false;
			bouton1.setEnabled(true);
			bouton2.setEnabled(false);
			
		}
	}
}
