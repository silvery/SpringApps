
public class TestParams {

	class Record
	{
	  int num;
	  String name;
	  
	 
	}
	
	 
	public void testObject(){
		Record rec = new Record();
		rec.num = 7;
		rec.name = "Michael";
		
		System.out.println("Before Record num = "+rec.num +" name "+rec.name);
		
		changeRecord(rec);
		
		System.out.println("After Record num = "+rec.num +" name "+rec.name);
		
	}
	
	private void changeRecord(Record rec){

		/*
		 * We cannot however make the object parameter refer to a different object 
		 * by reassigning the reference or calling new on the reference. 
		 * For example the following method would not work as expected:
		 * 
		 * rec = new Record();
		 * 
		 */
		
		
		
		rec.num = 17;
		rec.name = "Sergey";
	}
	
	public void testString(String str){
		System.out.println("In Before-"+str);
		//str = str+ "2222";
		str = new String ("2222");
		System.out.println("In After-"+str);
	}
	
	/*
	 * Pass-by-value means that when you call a method, 
	 * a copy of the value of each actual parameter is passed to the method.   
	 * You can change that copy inside the method, 
	 * but this will have no effect on the actual parameter.
	 */
	 public void tryPrimitives(int i, double f, char c, boolean test)
	  {
	    i += 10;    //This is legal, but the new values
	    c = 'z';    //won't be seen outside tryPrimitives.
	    if(test)
	      test = false;
	    else 
	      test = true;
	    f = 1.5;
	  }
	
	 /*
	  * Arrays are references. 
	  * This means that when we pass an array as a parameter, 
	  * we are passing its handle or reference. 
	  * So, we can change the contents of the array inside the method.
	  */
	 public void testArray(char[] b)
	  {
	    b[0] = 'x';
	    b[1] = 'y';
	    b[2] = 'z';
	  }
	 
	 public static void main(String[] args) {
		TestParams test = new TestParams();
		 String str = "11111";
		//System.out.println("Before-"+str);
  	    //test.testString(str); 
		//System.out.println("After-"+str);
		/*
		 int ii = 1;
		 double ff = 1.0;
		 char cc = 'a';
		 boolean bb = false;
		 System.out.println("Before :ii = " + ii + ", ff = " + ff +
                 ", cc = " + cc + ", bb = " + bb);
		 tryPrimitives(ii, ff, cc, bb); 
		    System.out.println("After : ii = " + ii + ", ff = " + ff +
		                       ", cc = " + cc + ", bb = " + bb);
		    
		  */
		 
		//test.testObject();
		  
		 char[] a = {'a', 'b', 'c'};
		 System.out.println("Before a[0] = " + a[0] + ", a[1] = " + a[1] + 
                 ", a[2] =" + a[2]);

		 test.testArray(a);
		 System.out.println("After a[0] = " + a[0] + ", a[1] = " + a[1] + 
		                       ", a[2] =" + a[2]);
		    

	}

}
