package com.camara.entresortie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {

	public static void main(String[] args) {
		/*File file = new File("test.txt");
		System.out.println("Nom du fichier : " + file.getName());
		System.out.println("Lien du fichier : " + file.getAbsolutePath());
		System.out.println("Type de " + file.getName() + " est " + (file.isFile()? "est un fichier texte":"c'est pas un fichier"));
		System.out.println("Le fichier " + file.getName() + (file.exists()? " existe":" n'existe pas"));
		
		String str = file.getName();
		System.out.println(str.substring(str.indexOf('.')+1));
		
		File[] tab = file.listRoots();
		try {
			for(File f: tab) {
				System.out.println(f.getAbsolutePath());
				for(String s: f.list()) {
						
						for(int i = 0; i < f.list().length; i++) {
							System.out.print(s + " ");
							if( i%6 == 0) System.out.println();
						}
						
					}
				}
			} catch(Exception e) {}
		
		
		File dossier = new File("./dossiers/texte.txt");
		try {
			if(dossier.createNewFile()) {
				System.out.println("Vous avez crée le fichier " + dossier + " dans " + dossier.getAbsolutePath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("dossiers/texte.txt"));
			
			byte[] buf = new byte[8];
			while(fis.read(buf) > 0) {
				fos.write(buf);
				buf = new byte[8];
			}
			System.out.println("Copie terminée !");
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		/*FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			 fis = new FileInputStream(new File("../dictionnaire.txt"));
			 fos = new FileOutputStream(new File("dossiers/texte.txt"));
			 bis = new BufferedInputStream(new FileInputStream( new File("../dictionnaire.txt")));
			 bos = new BufferedOutputStream(new FileOutputStream(new File("dossiers/texte2.txt")));
			 
			 long startTime = System.currentTimeMillis();
			 byte[] buf = new byte[8];
			 while(fis.read(buf) != -1) {
				 fos.write(buf);
			 }
			 System.out.println("Le temps d'écriture avec FileOutputStream : " + (System.currentTimeMillis() - startTime));
			 
			 startTime = System.currentTimeMillis();
			 buf = new byte[8];
			 while(bis.read(buf) != -1) {
				 bos.write(buf);
			 }	
			 System.out.println("Le temps d'écriture avec BufferedOutputStream : " + (System.currentTimeMillis() - startTime));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		//writeWithDataOutputStream();
		//readWithDataInputStream();
		//Nous allons écrire chaque objet Game dans le fichier
	      Game[] o = {new Game("Assassin Creed", "Aventure", 45.69), new Game("Tomb Raider", "Plateforme", 23.45), new Game("Tetris", "Stratégie", 2.50)};
	     //writeWithObjectOutputStream("dossiers/game.txt", o);
	      String url = "dossiers/game.txt";
	      readWithObjectInputStream(url);
	}
	
	private static void writeWithDataOutputStream() {
		DataOutputStream dos = null;
		try {
			 dos = new DataOutputStream(
									new BufferedOutputStream(
										new FileOutputStream(
											new File("dossiers/sdz.txt"))));
			dos.writeByte(12);
			dos.writeBoolean(true);
			dos.writeChar('C');
			dos.writeShort(5);
			dos.writeInt(100);
			dos.writeDouble(12.05);
			dos.writeFloat(100.52f);
			dos.writeLong(123456789L);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void readWithDataInputStream() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(
					new BufferedInputStream(
						new FileInputStream(
							new File("dossiers/sdz.txt"))));
			System.out.println(dis.readByte());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readLong());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void writeWithObjectOutputStream(String url, Game[] o) {
		ObjectOutputStream oops = null;
		try {
			oops = new ObjectOutputStream(
										new BufferedOutputStream(
											new FileOutputStream(
												new File(url))));
			for(Game g : o) {
				oops.writeObject(g);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oops != null)
					oops.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void readWithObjectInputStream(String url) {
		ObjectInputStream oips = null;
		
		try {
			oips = new ObjectInputStream(
						new BufferedInputStream(
							new FileInputStream(
								new File(url))));
			while (oips != null) {
					//if ((Game)oips).readObject())
					System.out.println(((Game)oips.readObject()).toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oips != null)
					oips.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void autreMethode1() {
		CharArrayWriter caw = new CharArrayWriter();
	    CharArrayReader car;
	        
	    try {
	      caw.write("Coucou les Zéros");
	      //Appel à la méthode toString de notre objet de manière tacite
	      System.out.println(caw);
	            
	      //caw.close() n'a aucun effet sur le flux
	      //Seul caw.reset() peut tout effacer
	      caw.close();
	            
	      //On passe un tableau de caractères à l'objet qui va lire le tampon
	      car = new CharArrayReader(caw.toCharArray());
	      int i;
	      //On remet tous les caractères lus dans un String
	      String str = "";
	      while(( i = car.read()) != -1)
	        str += (char) i;
	            
	      System.out.println(str);

	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	private static void encoreAutreMethode() {
		 StringWriter sw = new StringWriter();
		    StringReader sr;
		        
		    try {
		      sw.write("Coucou les Zéros");
		      //Appel à la méthode toString de notre objet de manière tacite
		      System.out.println(sw);
		            
		      //caw.close() n'a aucun effet sur le flux
		      //Seul caw.reset() peut tout effacer
		      sw.close();
		            
		      //On passe un tableau de caractères à l'objet qui va lire le tampon
		      sr = new StringReader(sw.toString());         
		      int i ;
		      //On remet tous les caractères lus dans un String
		      String str = "";
		      while(( i = sr.read()) != -1)
		        str += (char) i;

		      System.out.println(str);

		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
}
