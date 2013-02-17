package my.exceptions;

public class Exception1 {
	
	public int getNumber (int num) {
		if (num ==0)
			throw new NullPointerException("getNumber: the passing number must not be a zero");
		return num;
	}
   
	public void calc(){
		int res = 0;
		
		res = getNumber(5)+getNumber(0);
		
		System.out.println("Result="+res);
	}
		
	public static void main(String[] args){
		
		Exception1 ex1 = new Exception1();
		ex1.calc();
		
	}
}
