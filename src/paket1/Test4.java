package paket1;

import javapack.Einlesen;

public class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Geben Sie eine Zahl zwischen 0 und 9 ein: ");
		int zahl = Einlesen.LiesInt();
		check(zahl);
		
	}
	
	static void check(int wert) {
		String[] array = { "Null", "Eins", "Zwei", "Drei", "Vier", "Fünf",
				"Sechs", "Sieben", "Acht", "Neun" };
		if (wert < 10 && wert > -1) {
			System.out.println("Deine Zahl: " + array[wert]);

		} else {
			System.out.println("Geben Sie bitte eine einstellige Zahl ein: ");
			wert = Einlesen.LiesInt();
			check(wert);
		}
	}	
}


