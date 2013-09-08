package paket1;

public class Test2 {


	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		int[] array = new int[10];
		
		int[] array2 = {1,2,3,4};
		
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i;
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			
			System.out.println("Wert an Feld: " + (i+1) + " ist " + array2[i]);
			
		}
		
		for (int i : array2) {
			
		}

		Test1 objekt1 = new Test1();
		
		Test1 objekt2 = new Test1(100);
		
		Test1 objekt3 = new Test1(100, 115, 120);
		
		
		Test1[] testarray = {objekt1, objekt2, objekt3};
		
		
		for (Test1 test1 : testarray) {
			System.out.println(test1);
		}
		
		
//		System.out.println(objekt1.getAge());
//		
//		System.out.println(objekt2);
//		
//		System.out.println(objekt3);
//		
//		System.out.println(objekt1.toString());
//		
		
		
		
		
		
		
		
}

}

