package Udemy2;

import java.util.*;

public class P5 {
	public static void main(String[] args) {
		System.out.println(args.length);
		  List<String> list = new ArrayList<>();
	         list.add(0, "Array");
	         list.add(0, "List");
	 
	         System.out.println(list);
	         
	         List<String> list1 = new ArrayList<>();
	         list1.add("ONE");
	         list1.add("TWO");
	         list1.add("THREE");
	         list1.add("THREE");
	 
//	         if(list1.remove(2)) {
//	             list.remove("THREE");
//	         }
//	 
	         System.out.println(list);
	}

}
