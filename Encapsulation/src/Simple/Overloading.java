package Simple;

public class Overloading {

	int method1(int a) {
		return a;
	}

	String method1(String b) {
		return "zero";
	}

	int method1(double name) {
		return 0;
	}

	public static void main(String[] args) {
		Overloading test = new Overloading();
		System.out.println(test.method1("five"));
		System.out.println(test.method1(5));

		String rhyme = "She sells sea shells";
		StringBuilder sb = new StringBuilder(rhyme);
		System.out.println(sb.reverse());
		int x = 3;
		int y = 5;
		int z = 1;
		if (checkSum(x, y) || checkSum(y, z)) {
			System.out.print("a");
		}
	}

	private static boolean checkSum(int x, int y) {
		if (x + y >= 7) {
			System.out.print("b");
			return true;
		}
		System.out.println("c");
		return false;
	}
}
