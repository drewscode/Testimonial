package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe5Auftragsposition {
	// Klassenvariablen
	String bezeichnung = "";
	int menge = 0;
	double einzelpreis = 0.0;
	double wert = 0.0;

	public Uebung5Aufgabe5Auftragsposition(String bezeichnung, int menge,
			double einzelpreis) {
		super();
		this.bezeichnung = bezeichnung;
		this.menge = menge;
		this.einzelpreis = einzelpreis;
		this.wert = menge * einzelpreis;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getEinzelpreis() {
		return einzelpreis;
	}

	public void setEinzelpreis(double einzelpreis) {
		this.einzelpreis = einzelpreis;
	}

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

}
