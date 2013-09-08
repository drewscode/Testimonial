package Uebung5Alex;

import javapack.Einlesen;

public class Auftrag {
    
    int auftragsnummer = 0;
    Auftragsposition a1 = null, a2 = null;
    double auftragswert = 0.0f;
     
    public Auftrag(){
         
        auftragsnummer = (int) (Math.random() * 100);
         
        System.out.println("Für diesen Auftrag sind 2 " +
                "Auftragspositionen nötig");
        System.out.println("--------------------------");
        System.out.println("Auftragsposition 1");
        System.out.println("------------------");
        System.out.println("Bezeichnung:");
        String bez1 = Einlesen.LiesString();
        System.out.println("Menge:");
        int menge1 = Einlesen.LiesInt();
        System.out.println("Einzelpreis:");
        double preis1 = Einlesen.LiesDouble();
        a1 = new Auftragsposition(bez1, menge1, preis1);
         
         
//        System.out.println("Auftragsposition 2");
//        System.out.println("------------------");
//        System.out.println("Bezeichnung:");
//        String bez2 = Einlesen.LiesString();
//        System.out.println("Menge:");
//        int menge2 = Einlesen.LiesInt();
//        System.out.println("Einzelpreis:");
//        double preis2 = Einlesen.LiesDouble();
//        a2 = new Auftragsposition(bez2, menge2, preis2);
         
//       
        System.out.println("Auflistung");
        System.out.println("----------");
        System.out.println(a1);
//        System.out.println(a2.toString());
         
         
    }
 
}