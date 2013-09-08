package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		static int WERT = 2;
		System.out.println("Bitte eine Zahl eingeben: ");
		int Zahl = Einlesen.LiesInt();
		Einlesen.LiesBoolean();
		
		System.out.println(Einlesen.LiesString());
		
		check(Zahl);
		
	}
	
	static void check(int wert){
				
		String[] array = {"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
		
		if (wert < 10 && wert > -1){
			System.out.println("Zahl als Wort: "+array[wert]);
		} else if(wert < 0 && wert > -10){
						
			wert = wert * -1;
			System.out.println("Zahl als Wort: -"+array[wert]);
		}
		
		
		else{
			System.out.println("Bitte geben Sie eine Zahl ein, die kleiner als Zehn ist" );
			wert = Einlesen.LiesInt();
			check(wert);
			
		}
	}

}
