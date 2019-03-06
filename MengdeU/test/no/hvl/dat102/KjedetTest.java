package no.hvl.dat102;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class KjedetTest {

	private KjedetMengde<Integer> liste1;
	private KjedetMengde<Integer> liste2;
	private KjedetMengde<Integer> liste3;

	// Test data
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;

	@Before
	public final void setup() {
		liste1 = new KjedetMengde<Integer>();
		liste2 = new KjedetMengde<Integer>();
		liste3 = new KjedetMengde<Integer>();
	}
	
	@Test
	public final void nyKjedeErTom() {
		assertTrue(liste1.erTom());
	}
	
	@Test
	public final void leggTilOgFjern() { 
		liste1.leggTil(e0); 
		liste1.leggTil(e1); 
		liste1.leggTil(e2); 
		liste1.leggTil(e3); 
		liste1.leggTil(e4); 
		liste1.leggTil(e5); 
		assertEquals(e5, liste1.fjern(e5)); 
		assertEquals(e4, liste1.fjern(e4));
		assertEquals(e3, liste1.fjern(e3));
		assertEquals(e2, liste1.fjern(e2));
		assertEquals(e1, liste1.fjern(e1));
		assertEquals(e0, liste1.fjern(e0));
		assertTrue(liste1.erTom());
	}
	
	@Test
	public final void equals() {
		liste1.leggTil(e0); 
		liste1.leggTil(e1); 
		liste1.leggTil(e2); 
		liste1.leggTil(e3); 
		liste1.leggTil(e4); 
		liste1.leggTil(e5); 
		assertTrue(liste1.equals(liste1));
		assertFalse(liste2.equals(liste1));
	}
	
	@Test
	public final void testUnion() {
		liste1.leggTil(e0);
		liste1.leggTil(e1); 
		liste1.leggTil(e2); 
		liste1.leggTil(e3);
		
		liste2.leggTil(e0);
		liste2.leggTil(e1); 
		liste2.leggTil(e2); 
		liste2.leggTil(e3); 
		liste2.leggTil(e4); 
		liste2.leggTil(e5); 
		
		assertTrue(liste1.union(liste2).equals(liste2));
	}
	
	@Test
	public final void testSnitt() {
		liste1.leggTil(e0);
		liste1.leggTil(e1); 
		liste1.leggTil(e2); 
		liste1.leggTil(e3);
		
		assertTrue(liste1.snitt(liste2).erTom());
		
		liste2.leggTil(e0);
		liste2.leggTil(e1); 
		liste2.leggTil(e2); 
		liste2.leggTil(e3); 
		liste2.leggTil(e4); 
		liste2.leggTil(e5);
		liste2.leggTil(e5);
		
		assertTrue(liste1.equals(liste1.snitt(liste2)));
	}
	
	/** Test diff */
	@Test
	public final void testDiff() {
		//This currently requires an ordered table...
		//Mostly  due to how the third table is listed... having a sort function would solve this
		liste1.leggTil(e0);
		liste1.leggTil(e1); 
		liste1.leggTil(e2); 
		liste1.leggTil(e4);
		
		//assertTrue(liste1.differens(liste2).equals(liste1));
		
		liste2.leggTil(e0);
		liste2.leggTil(e1); 
		liste2.leggTil(e2); 
		liste2.leggTil(e3); 
		liste2.leggTil(e4); 
		liste2.leggTil(e5);
		
		liste3.leggTil(e3);
		liste3.leggTil(e5);
		
		assertTrue(liste3.equals(liste1.differens(liste2)));
		assertTrue(liste3.equals(liste2.differens(liste1)));
	}

}
