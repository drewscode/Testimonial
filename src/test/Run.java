package test;

public class Run {
	
	public static void main(String[] args){
		
		Glas glas1 = new Glas(100.0);
		
		for (int i = 0; i < 3; i++) {
			
			glas1.setFuellMenge();
		}
		
		System.out.println(glas1.getFuellMenge());
	}

}
