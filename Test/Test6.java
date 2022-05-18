package Test;

public class Test6 {
	static void test() throws RuntimeException {
		try {
			System.out.print("test ");
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}

	static void testr() {
		try {
			String x = null;
			System.out.print(x.toString() + " ");
		} finally {
			System.out.print("finally ");
		}
	}

	public static void main(String[] args) {
		try {
			test();
			testr();
		} catch (RuntimeException ex) {
			System.out.print("runtime ");
		}
		catch (Exception ex) { System.out.print("exception "); }
	
		System.out.print("end ");
	}
	

}
