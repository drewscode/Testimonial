package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe5Auftrag {
	
	int auftragsnummer = 0;
	Uebung5Aufgabe5Auftragsposition ap1 = null, ap2 = null;
	double auftragswert = 0.0;
	
	public Uebung5Aufgabe5Auftrag() {
		
		this.auftragsnummer = (int) (Math.random() * 100);
		
		System.out.println("Was?");
		String bezeichnung1 = Einlesen.LiesString();
		System.out.println("Wieviel?");
		int menge1 = Einlesen.LiesInt();
		System.out.println("Preis?");
		double preis1 = Einlesen.LiesDouble();
		ap1 = new Uebung5Aufgabe5Auftragsposition(bezeichnung1, menge1, preis1);
		
		System.out.println("Was?");
		String bezeichnung2 = Einlesen.LiesString();
		System.out.println("Wieviel?");
		int menge2 = Einlesen.LiesInt();
		System.out.println("Preis?");
		double preis2 = Einlesen.LiesDouble();
		ap2 = new Uebung5Aufgabe5Auftragsposition(bezeichnung2, menge2, preis2);
		
		this.auftragswert = ap1.getWert() + ap2.getWert();
		
		System.out.println("Auftragsnummer: " + this.auftragsnummer +
		"\nAuftragswert: " + this.auftragswert);
		
		
	}
	
	
	
	
	

}
