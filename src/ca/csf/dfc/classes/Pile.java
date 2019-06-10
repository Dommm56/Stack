package ca.csf.dfc.classes;


import java.util.Arrays;

public class Pile<unType> {

	private final int tailleMax;
	private unType[] m_donnee;
	private int valeurTop;
	private int combienValeurs=0;
	
	/*
	 * Constructeur par initialisation
	 */
	public Pile(int taille) throws IllegalArgumentException  {
		if (taille<=0) {
			throw new IllegalArgumentException("Taille negative");
		}
		this.tailleMax=taille;
		this.valeurTop=-1;
		this.m_donnee= (unType[]) new Object[tailleMax];
	}
	
	public void empiler(unType p_ajouter) throws PilePleineException{
		if (combienValeurs>=tailleMax) {
			
			throw new PilePleineException();
			
		}
		this.m_donnee[++valeurTop]=p_ajouter;
		this.combienValeurs+=1;
		
	}//fin empiler
	
	public void depiler() throws PileVideException{
		if (combienValeurs==0) {
			
			throw new PileVideException();
			
		}
		this.m_donnee[valeurTop]=null;
		this.combienValeurs-=1;
		
	}//fin depiler
	
	public Boolean estVide(Pile<unType> p_laPile) {
		Boolean estVideouNon= true;
		if (combienValeurs>0) {
			estVideouNon= false;
		}
		return estVideouNon;
		
	}//fin est vide
	
	public unType sommet(Pile<unType> p_pile) {
		
		
		return this.m_donnee[valeurTop];
		
	}//fin sommet

	@Override
	public String toString() {
		return "Pile [tailleMax=" + this.tailleMax + ", m_donnee=" + Arrays.toString(this.m_donnee)  + ", combienValeurs=" + this.combienValeurs + "]";
	}


	
	

	
	
	
	
}//fin Pile
