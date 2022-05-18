package Test;

public class Test3 {
	public static void main(String args[]) {
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t | ((i++) == 0));
		b = (f | ((i += 2) > 0));
		System.out.println(i);

		// ++++++++++++++++++++++++++++++++
		boolean x = true;
		int a;
		if (x)
			a = x ? 1 : 2;
		else
			a = x ? 3 : 4;
		System.out.println(a);

		// ++++++++++++++++++++++++++++++++++
		int i2 = 0, j = 2;
		do {
			i2 = ++i2;
			j--;
		} while (j > 0);
		System.out.println(i2);
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		Integer i3 = new Integer(1) + new Integer(2);

		switch (i3) {
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
			break;
		}

		// +++++++++++++++++++++++++++++++++++++++++++++++++++
		String s = "Fred";
		s = s + "47";
		s = s.substring(2, 5);
		s = s.toUpperCase();
		System.out.println(s);

	}

}
