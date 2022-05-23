package Udemy;

import java.time.LocalTime;
import java.util.*;

public class T1 {
	public static void main(String[] args) {
//		try {
//			main(args);
//		}
//		catch(Exception e) {
//			System.out.println("CATCH-");
//		}
//		System.out.println(" Out-");

		byte var = 100;
		switch (var) {
		case 100:
			System.out.println("var is 100");
			break;
		//case 200:
			//System.out.println("var is 200");
			//break;
		default:
			System.out.println("In default");
		}
		List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);

        System.out.println(list1);
        
        LocalTime time = LocalTime.of(16, 40);
       // String amPm = time.getHour() >= 12 ? ((time.getHour() == 12) ? "PM" : "AM");
       // System.out.println(amPm);
	}

}
