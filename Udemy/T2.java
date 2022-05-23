package Udemy;

import java.util.*;

class Message {
	String msg = "Happy New Year!";

	public void print() {
		System.out.println(msg);
	}
}

public class T2 {
	  static {
	         System.out.println(1/0);
	     }
	 
	     
	        
	     
	public static void change(Message m) { // Line n5
		m = new Message(); // Line n6
		m.msg = "Happy Holidays!"; // Line n7
	}

	public static void main(String[] args) {
		Message obj = new Message(); // Line n1
		obj.print(); // Line n2
		change(obj); // Line n3
		obj.print(); // Line n4
		 List<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(100);
         list.add(200);
         list.remove(1);
         System.out.println("HELLO");
         System.out.println(list);
	}
}
