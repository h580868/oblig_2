package no.hvl.dat102.medlem;

import javax.swing.text.html.HTMLDocument.Iterator;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Medlem {
	private String navn;
	private KjedetMengde<Hobby> hobbyer; // Eller TabellMengde
	private int statusIndeks;

//... Konstruktør
//... Andre metoder
	public Medlem(String navn) {
		this.navn = navn;
		hobbyer = new KjedetMengde<Hobby>();
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}
	
	public void leggTilHobby(String hobby) {
		hobbyer.leggTil(new Hobby(hobby));
	}

	public boolean equals(Medlem medlem) {
		if (navn == medlem.getNavn()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String hobbyToString() {
		java.util.Iterator<Hobby> iter = hobbyer.oppramser();
		String result = "<" + iter.next();
		while (iter.hasNext()) {
			result += "," + iter.next();
		}
		return result + ">";
	}
}
