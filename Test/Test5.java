package Test;

public class Test5 {
	static void test() throws Error {
		try {
			if (true)
				throw new AssertionError("asdfgh");
			System.out.print("test ");
		} catch (Exception e) {
			System.out.print("exception ");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
		System.out.print("end ");
	}
}
