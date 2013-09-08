package Uebung5Alex;

public class Auftragsposition extends Object {
    
    String bezeichnung = "";
    int menge = 0;
    double einzelpreis = 0.0f;
    double wert = 0.0f;
     
    public Auftragsposition(String bezeichnung, int menge, double einzelpreis){
        this.bezeichnung = bezeichnung;
        this.menge = menge;
        this.einzelpreis = einzelpreis;
        this.wert = menge * einzelpreis;
        this.toString();
    }
 
    public String getBezeichnung() {
        return bezeichnung;
    }
 
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
 
    public int getMenge() {
        return menge;
    }
 
    public void setMenge(int menge) {
        this.menge = menge;
    }
 
    public double getEinzelpreis() {
        return einzelpreis;
    }
 
    public void setEinzelpreis(double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }
 
    public double getWert() {
         
        return wert;
    }
 
    public void setWert(double wert) {
        this.wert = wert;
    }
     
//    @Override
    public String toString() {
//        super.toString();
        String summary = "Auftragsposition mit der Bezeichnung: " + this.bezeichnung +
                 "\n                           der Menge: " + this.menge +
                 "\n                           und Preis: " + this.einzelpreis;
        return summary;
    }
    
    
     
}