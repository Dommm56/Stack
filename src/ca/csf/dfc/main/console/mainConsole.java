package ca.csf.dfc.main.console;

import ca.csf.dfc.classes.Pile;
import ca.csf.dfc.classes.PilePleineException;
import ca.csf.dfc.classes.PileVideException;

public class mainConsole {

	public static void main(String[] args) {
		Integer value1 = 3;
		Pile<Double> laPile = new Pile<Double>(value1);
		System.out.println(laPile.toString());
		System.out.println(laPile.estVide(laPile));
		try {
			laPile.empiler(1.0);
			laPile.empiler(3.0);
		} catch (PilePleineException e) {
			
			e.printStackTrace();
		}
		System.out.println(laPile.toString());
		System.out.println(laPile.estVide(laPile));
		try {
			laPile.empiler(2.0);
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(laPile.toString());
		System.out.println(laPile.estVide(laPile));
		System.out.println("le sommet est: "+laPile.sommet(laPile));
		try {
			laPile.depiler();
		} catch (PileVideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(laPile.toString());
		System.out.println(laPile.estVide(laPile));
		System.out.println("le sommet est: "+laPile.sommet(laPile));
		
		System.out.println(laPile.toString());
		System.out.println(laPile.estVide(laPile));
		
		

	}//fin main

	
}//fin mainConsole
