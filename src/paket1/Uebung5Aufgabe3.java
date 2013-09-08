package paket1;

import javapack.Einlesen;

public class Uebung5Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Felder f1 und f2 werden angelegt
		System.out.println("Bitte feldlänge eingeben: ");
		int feldlaenge = Einlesen.LiesInt();
		int[] f1 = new int[feldlaenge];
		int[] f2 = new int[f1.length];
		
		int sumF1 = 0, sumF2 = 0;
		
		
		//Array f1 und f2  wird befüllt
		for (int i = 0; i < f2.length; i++) {
			f1[i] = (int) (Math.random()* 10);
			f2[i] = (int) (Math.random()* 10);
		}
		
		//Positionen der Arrays vergleichen
		for (int i = 0; i < f2.length; i++) {
		
			sumF1 += f1[i];
			sumF2 += f2[i];
			
			if(f1[i]==f2[i]){
				System.out.println(i+". " + f1[i] + " == "+ f2[i]);
			}else if(f1[i]<f2[i]){
				System.out.println(i+" <");
			}else{
				System.out.println(i+" >");
			}
			
		}
		System.out.println("F1: " +  sumF1 + "\nF2: " + sumF2);
		


	}

}
