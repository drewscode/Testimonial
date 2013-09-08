package paket1;

import javapack.Einlesen;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bitte Anschaffungskosten eingeben: ");
		
		double summe = Einlesen.LiesDouble();
		System.out.println("Bitte Nutzungsdauer eingeben: ");
		int nd = Einlesen.LiesInt();
		double aw = summe/nd;

		for (int i = 0; i < nd; i++) {

			summe -= aw;

			if (i == 0) {
				
				System.out.println(" _______________________________________________________________");
				System.out.println("|	Jahr	|	Restwert	|	Abschreibung	|");
				System.out.println("---------------------------");
				System.out.println("|" + (i+1) + "|" + summe + "|" + aw + "|" );
			} 
			
			else if (i > 0 && i < nd - 1) {

				System.out.println("---------------------------");
				System.out.println("|" + (i+1) + "|" + summe + "|" + aw + "|" );
			} 
			
			else {
				
				System.out.println("---------------------------");
				System.out.println("|" + (i+1) + "|  1€  |" + aw + "|" );
				System.out.println("---------------------------");
				

			}
		
		
	}

}
}
