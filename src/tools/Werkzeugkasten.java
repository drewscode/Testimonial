package tools;

import javapack.Einlesen;

/***
 * 
 * @author GG
 * Meine Hotkeys:
 * 
 * Strg + Shift + F		--> Formatiert markierten Code
 * Strg + Shift + O		--> Importiert fehlende Libraries
 * 
 * Strg + klickAufMethodenname --> springt auf die betreffende Stelle
 * 
 * /*** + Enter			--> Erstellt kommentar wie dieses. Über methode zeigt Parameter an
 * 
 */

public class Werkzeugkasten {
	
	/***
	 * 
	 * @param string
	 */
	public void print(String string){
		System.out.println(string);
		
	}

	public void printChar(char character){
		
		System.out.println("Dein Character ist" + character);
	}
	
	public void stringCompare(String string1, String string2){
		
		if (string1.length() == string2.length()) {
			System.out.print("String 1 und String 2 sind gleich lang ");
			if (string1.equals(string2)) {
				System.out.println("und auch inhaltlich gleich");
			} else
				System.out.println("aber inhaltlich verschieden");
		} else
			System.out
					.println("String 1 und String 2 sind unterschiedlich lang und somit inhaltlich unterschiedlich");

		// Vereinigen Sie String1 mit String2
		// und geben Sie dann die einzelnen Zeichen des Gesamt‐Strings aus

		String neuerText = "Strings vereint: " + string1 + " und " + string2;
		System.out.println(neuerText);
	}
	
	/***
	 * 
	 * @param string
	 */
	public void stringlength(String string){
		string = string.substring(1);
		string = string.substring(0, 2);
		System.out.println(string);
		System.out.println(string.length());
		
	}
	
	/***
	 * 
	 * @param felder
	 * 			wie groß soll dein Feld werden
	 * @return
	 *          ein int array mit zahlen befüllt und mit der größe von felder
	 */
	public int[] initNrArray(int felder){
		
		int[] neuesArray = new int[felder];
		
		for (int i = 0; i < neuesArray.length; i++) {
			
			neuesArray[i] = i;
		}
		
		return neuesArray;
	}
	
	/***
	 * 
	 * @return
	 */
	public String liesString(){
		System.out.println("Gib ein Wort ein: ");
		String string = Einlesen.LiesString();
		return string;
	}
	
	/***
	 * 
	 * @return
	 */
	public static boolean weiter() {
		char op;
		while (true) {
			System.out.print("Nochmal ausführen?(Ja/Nein)> ");
			op = Einlesen.LiesChar();
			if (op == 'j' || op == 'J')
				return true;
			else if (op == 'n' || op == 'N' )
				System.out.println("ENDE");
			else
				System.out.println(op + " ist nicht zulässig!!");
		}

	}
	
	public void getNextLetter(char character){
		
		System.out.println((char)(character + 1));
	}
	
}
