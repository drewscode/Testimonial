package tools;

import javapack.Einlesen;

public class Run {

	public static void main(String[] args) {
		//Klassenname Objektname = new Konstruktorenname();
		//1te Vokabel!!!
		Werkzeugkasten w = new Werkzeugkasten();
		
		String zeichenfolge = "blabla";
		int[] zahlenArray = w.initNrArray(9);
		
		w.print(zeichenfolge);
		
		w.stringlength(zeichenfolge);
		
		do{
			w.getNextLetter(Einlesen.LiesChar());
			
			
			String string1 = w.liesString();
			
			String string2 = w.liesString();
			
			w.stringCompare(w.liesString(), w.liesString());
			
			
		}while(w.weiter());

	}

}
