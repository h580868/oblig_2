package no.hvl.dat102;

import java.io.*;

public class Balansering {
	// Her opphever du kommentarsetning naar du har faat lagt inn
	// noevendig kode
	//SirkulaerStabel<Parentesinfo>stabel = new
	// SirkulaerStabel<Parentesinfo>();

	private boolean passer(char open, char close) {
		switch (open) {
		case '(':
			return (close == ')');
		case '[':
			return (close == ']');
		case '{':
			return (close == '}');
		default:
			return false;
		}
	}//

	public void foretaBalansering(String innDataStreng, int linjenr) {

		int lengde = innDataStreng.length();
		// Fyll ut

	}//

	public void lesFraFil(String filnavn) {
		FileReader tekstFilLeser = null;
		try {
			tekstFilLeser = new FileReader(filnavn);
		} catch (FileNotFoundException unntak) {
			System.out.println("Finner ikke filen!");
			System.exit(-1);
		}

		BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
		String linje = null;
		int linjenr = 0;
		try {
			linje = tekstLeser.readLine();
			while (linje != null) {
				for (int i = 0; i < linje.length(); i++) {
					
				}
				linjenr++;
			} // while
		}

		catch (IOException unntak) {
			System.out.println("Feil ved innlesing!");
			System.exit(-1);
		}
		try {
			tekstFilLeser.close();
		} catch (IOException unntak) {
			System.out.println("Feil ved lukking av fil!");
		}

	}// metode

}// class
