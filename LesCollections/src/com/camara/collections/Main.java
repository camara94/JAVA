package com.camara.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new LinkedList();
		l.add(12);
		l.add("Toto");
		l.add(12.20f);
		l.set(1, "PC Acer");
		
		/*for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		List la = new ArrayList();
		la.add(12);
		la.add("Une chaîne de caractère !");
		la.add(12.20f);
		la.add('D');
		
		ListIterator al = la.listIterator();
		while(al.hasNext())
			System.out.println(al.next());
		
		
		System.out.println(la.get(1));
		
		Hashtable ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(2,"été");
		ht.put(3,"automne");
		ht.put(4,"hiver");
		ht.put(5,"hiver");
		
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		HashSet hs = new HashSet();
		hs.add("M. Ourir");
		hs.add("M. Anis");
		hs.add("M. Fria");
		hs.add("M. Dahmane");
		hs.add("M. Dahmane");
		Iterator it = hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
