package ca.csf.dfc.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.classes.Pile;
import ca.csf.dfc.classes.PilePleineException;
import ca.csf.dfc.classes.PileVideException;

class PileTest {

	@Test
	void testPile_CREATIONTAILLE1_INT() {
		Integer value1 = 1;
		Pile<Integer> laPile = new Pile<Integer>(value1);
		try {
			laPile.empiler(1);
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//fin testPile_CREATIONTAILLE1_INT()
	
	@Test
	void testPile_CREATIONTAILLE1_Double() {
		Integer value1 = 1;
		Pile<Double> laPile = new Pile<Double>(value1);
		try {
			laPile.empiler(1.0);
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//fin testPile_CREATIONTAILLE1_Double()
	
	@Test
	void testPile_EMPILER_Double_MARCHEPAS() {
		Integer value1 = 1;
		Pile<Double> laPile = new Pile<Double>(value1);
		try {
			laPile.empiler(1.0);
			laPile.empiler(1.0);
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//fin testPile_CREATIONTAILLE1_Double()
	
	@Test
	void testPile_DEPILER_Double_MARCHEPAS() throws PileVideException,PilePleineException {
		Integer value1 = 1;
		Pile<Double> laPile = new Pile<Double>(value1);
		try {
			laPile.empiler(1.0);
			
			laPile.depiler();
		} catch (PilePleineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//fin testPile_CREATIONTAILLE1_Double()

}//fin des tests
