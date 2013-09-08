package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String wort = "50";
//		char a = 2.9;
//		System.out.println("Du hast eingegeben: " + a);
		
		System.out.println("Bitte geben Sie eine Feldlänge ein: ");
		
		// Typ array[] = new Typ[FELDLÄNGE];
		float array[] = new float[Einlesen.LiesInt()];
		
		
		// for( vonwo ; bis wohin; um wie viel weiter)
		for (int i = 0; i < array.length; i++){
			array[i] = (float) (0.5 * i);
			
		}
		
		// for( Typ Feld : array)
//		for(float wert : array){
//			
//			System.out.println(wert);
//			
//		}
//		
//		for(int i = 0; i < array.length; i++){
//			
//			System.out.println(array[i]);
//		}
//		
//		int counter = 0;
//		
//		while(counter < array.length){
//			
//			System.out.println(array[counter]);
//			counter++;
//		}
	}

}
