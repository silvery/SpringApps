
public class TestFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestFinal.testFinalVar();

	}
	//Test Git - delete after testing 
	public static void testFinalVar(){
		
		int i = 0;
		while(i<5){
		   i++;
		   final int j = i;
		  // The final local variable j cannot be assigned.
		  // It can't be like  
		  // j++;
		   System.out.println(j);
		}
		
	}

}
