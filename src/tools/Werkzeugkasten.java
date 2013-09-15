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

	
	/***
	 * 
	 * @param sum
	 * 		wert aus dem stunden/minuten/sekunden berechnet werden soll
	 */
	public static void calculateTime(int sum){
		
		if(sum < 60){
			
			System.out.println(sum + " Sekunden");
		} else if(sum >= 60 && sum < 3600){
			
			int minuten = sum / 60;
			int sekunden = sum % 60;
			System.out.println(minuten + " Minuten " + sekunden + " Sekunden");
		} else if(sum >= 3600){
			
			int stunden = sum / 3600;
			System.out.println(stunden);
			int minuten = (sum - (stunden * 3600)) / 60;
			System.out.println(minuten);
			int sekunden = (sum - (stunden * 3600) - (minuten * 60));
			System.out.println(sekunden);
			
			System.out.println(stunden + " Stunden " + minuten + " Minuten " + sekunden + " Sekunden");
		}
	}
	
	
	/***
	 * 
	 * @param myArray
	 * 		
	 * @return
	 */
	public static int arraySum(int[] myArray){
		
		int sum = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		
		return sum;	
	}
	
	
	public void drawArray(int[] array) {

		String field = "";
		for (int number : array) {
			field += "[" + number + "]-";

		}
		System.out.println(field);
	}
	
	/***
	 * 
	 * @param character
	 * 		zu �bergebender character
	 */
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
