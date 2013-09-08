package paket1;

//import
import javapack.*;

//Klassenname
public class Test1 {

	//Variablen
	private int age = 18;								//package?
	protected int age2 = 18;
	public int age3 = 18;
	
//Konstruktor
	public Test1(){
		
	}
	
	public Test1(int age){
		this.age = age;
	}
	
	public Test1(int age, int age2){
		this.age = age;
		this.age2 = age2;
	}
	
	
	
	
	
	public Test1(int age, int age2, int age3) {  			//alledrei? this?
		super();
		this.age = age;
		this.age2 = age2;
		this.age3 = age3;
	}

	//Methode
	
	/***
	 * macht etwas
	 */
	void doSomething(){										//void?
		
	}

	//getter / setter
	public int getAge() {
		System.out.println("GET AGE");
		return age;											//return=syso_?n
	}

	public void setAge(int age) {							//void?
		System.out.println("SET AGE");
		this.age = age;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}
	
	@Override
	public String toString() {
		System.out.println("HIER");
		
		String userinfo="alter: " + this.age + 
						", alter2: " + this.age2 +					//age aus konstruktor? auch ohne konstruktor möglich?
						", alter3: " + this.age3;					//this holt etwas aus der klasse? + verkettet?
		
		return userinfo;											//gibt etwas zurück?
	}
	
	
}
	
	
	
	
	
