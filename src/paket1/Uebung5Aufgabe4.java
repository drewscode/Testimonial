package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Beliebigen String eingeben: ");
		String s1 = Einlesen.LiesString();
		System.out.println("Beliebigen String eingeben: ");
		String s2 = Einlesen.LiesString();
		if (s1.length() == s2.length()&&s1.equals(s2)) {
			System.out.println("Die Strings sind gleich lang und identisch");
			
		}else if (s1.length() == s2.length()) {
			System.out.println("Die Strings sind gleich lang");
		}
		
		else {
			System.out.println("Die Strings sind unterschiedlich lang");
		}
		
		s1 += s2;
		System.out.println(s1);
		
	}

}
