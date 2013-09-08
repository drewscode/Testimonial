package test;

public class Glas {
	
	private double fuellMenge = 0.0;
	private double volumen = 0.0;
	private double durchmesser = 0.0;
	private boolean befuellt;
	
	// konstruktor 1
	public Glas(){
	
		befuellt = false;		
	}
	
	// konstruktor 2
	public Glas(double volumen){
		
		this.volumen = volumen;
		if(volumen > 0.0){
			this.befuellt = true;
		}
	}

	public Glas(double volumen, double fuellMenge){
		
	}

	public double getFuellMenge() {
		return fuellMenge;
	}

	public void setFuellMenge() {

		this.setFuellMenge((Math.random() * volumen) + this.fuellMenge);
	}
	
	public void setFuellMenge(double fuellmenge) {
		
		System.out.println(fuellmenge);
		if(fuellmenge > this.volumen){
			fuellmenge = this.volumen;
			System.out.println("Digger, pass das nächste mal besser auf!!");
		} else {
			
			System.out.println("Aiiight, es sind " + (this.fuellMenge + fuellmenge) + " ml im Glas");
		}
		
		this.fuellMenge = fuellmenge;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getDurchmesser() {
		return durchmesser;
	}

	public void setDurchmesser(double durchmesser) {
		this.durchmesser = durchmesser;
	}

	public boolean isBefuellt() {
		
		if(this.fuellMenge > 0.0){
			befuellt = true;
		} else {
			befuellt = false;
		}
		
		return befuellt;
	}

	public void setBefuellt(boolean befuellt) {
		this.befuellt = befuellt;
	}
	

}
