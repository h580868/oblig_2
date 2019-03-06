package no.hvl.dat102.medlem;

public class MedlemKlient {
	
	private static Medlem medlem1;
	
	private static void setup() {
		medlem1 = new Medlem("Banana");
		medlem1.leggTilHobby("dansing");
		medlem1.leggTilHobby("skriking");
	}

	public static void main(String[] args) {
		setup();
		
		System.out.println(medlem1.hobbyToString());
	}

}
