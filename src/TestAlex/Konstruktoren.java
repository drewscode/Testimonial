package TestAlex;

public class Konstruktoren {

	int nr1 = 0;
	int nr2 = 0;
	double pr1 = 0.0;
	double pr2 = 0.0;
	String gg = "";

	public Konstruktoren(int nr1, int nr2, double pr1, double pr2, String gg) {

		this.nr1 = nr1;
		this.nr2 = nr2;
		this.pr1 = pr1;
		this.pr2 = pr2;
		this.gg = gg;
		
		System.out.println("Konstruktor mit 5 Variablen");
	}

	public Konstruktoren() {
		System.out.println("default constructor");
	}
	
	public Konstruktoren(int nr1, int nr2, double pr1, double pr2) {
		this.nr1 = nr1;
		this.nr2 = nr2;
		this.pr1 = pr1;
		this.pr2 = pr2;
		System.out.println("Konstruktor mit 4 Variablen");
	}
	
	public Konstruktoren(int nr1, int nr2, double pr1){
		this.nr1 = nr1;
		this.nr2 = nr2;
		this.pr1 = pr1;
		System.out.println("Konstruktor mit 3 Variablen");
	}
	
	public Konstruktoren(int nr1, int nr2) {
		this.nr1 = nr1;
		this.nr2 = nr2;
		System.out.println("Konstruktor mit 2 Variablen");
	}
	
	public Konstruktoren(int nr1){
		this.nr1 = nr1;
		System.out.println("Konstruktor mit einer Variable");
	}
}
