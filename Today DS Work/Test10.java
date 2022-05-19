package Test;

public class Test10 {
	public static void main(String[] args) {
		int i=5,j=0;
		try {
			System.out.println(i/j);
			 
			
		}catch(ArithmeticException e) {
			System.out.println("Exception");
		}
	}

}
