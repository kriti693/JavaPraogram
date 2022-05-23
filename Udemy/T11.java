package Udemy;

import java.util.ArrayList;
import java.util.List;

public class T11 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(2));
		list.add(new Integer(1));
		list.add(new Integer(0));

		list.remove(list.indexOf(0));

		System.out.println(list);
		do {
			System.out.println(100);
		} while (false);
		System.out.println("Bye");
		
		 List<Character> list2 = new ArrayList<>();
         list2.add(0, 'V');
         list2.add('T');
         list2.add(1, 'E');
         list2.add(3, 'O');
 
         if(list.contains('O')) {
             list.remove('O');
         }
 
         for(char ch : list2) {
             System.out.print(ch);
         }
	}
}
