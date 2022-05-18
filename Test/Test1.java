package Test;

import java.util.ArrayList;
import java.util.List;

class Writer {
	public static void write() {
		System.out.println("Writing....");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing Book");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing coding");
	}
}

class One {
	public One() {
		System.out.print(1);
	}
}

class Two extends One {
	public Two() {
		System.out.print(2);
	}

}

class Three extends Two {
	public Three() {
		System.out.print(3);
	}

}

public class Test1 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		int a = (int) list.get(0);
		System.out.println(a);
		Writer wr = new Programmer();
		wr.write();

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		StringBuilder str = new StringBuilder("Java");
//		String str1 = "Love";
//		System.out.println(str.append(str1));
//		System.out.println(str.substring(4));
//		System.out.println(str);
//		int found = str.indexOf(str1);// (index position sencond string)
//		System.out.println(found);
	}

}
