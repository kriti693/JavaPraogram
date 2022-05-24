package Udemy2;

import java.util.*;

public class P4 {
	public static void main(String[] args) {
		System.out.println("Output is: " + (10 != 5));
		Boolean b1 = new Boolean("tRuE");
		Boolean b2 = new Boolean("fAlSe");
		Boolean b3 = new Boolean("abc");
		Boolean b4 = null;
		System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);

		add(10.0,null);
		
		
		String str1 = " ";
        boolean b = str1.isEmpty();
        System.out.println(b);
        String s=str1.trim();
        b =  s.isEmpty();
        System.out.println(b);

        
        List<Integer> list = new ArrayList<>();
      //  list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.add(100);
        list.remove(new Integer(100));

        System.out.println(list);
	}

	private static void add(double d1, double d2) {
		System.out.println("double version: " + (d1 + d2));
	}

	private static void add(Double d1, Double d2) {
		System.out.println("Double version: " + (d1 + d2));
	}
}
