package com.camara.jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	public void paintComponent(Graphics g){
		
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("Tiens ! Le site du zéro !", 10, 20);
		Image img;
		try {
			img = ImageIO.read(new File("th.jpg"));
			g.drawImage(img, 200, 0, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
	    g.drawPolygon(x, y, 8);
	
	    int x2[] = {50, 60, 80, 90, 90, 80, 60, 50};
	    int y2[] = {60, 50, 50, 60, 80, 90, 90, 80};
	    g.fillPolygon(x2, y2, 8);
  }               
}