package com.camara.evenements;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener{
	private String name;
	private Image img;
	public Bouton(String str) {
		super(str);
		this.name = str;
		
		try {
			img = ImageIO.read(new File("../paysages_mer.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		//this.setSize(600, 100);
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
		g2d.setPaint(gp);
		
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.white);
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.drawString(this.name,  this.getWidth()/2 - (this.getWidth() / 2 / 4), (this.getHeight()/2) + 5);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			img = ImageIO.read(new File("../paysages_mont.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		try {
			img = ImageIO.read(new File("../ani_sauvages.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		try {
			img = ImageIO.read(new File("../paysages_mer.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
