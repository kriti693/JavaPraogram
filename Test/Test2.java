package Test;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Pencil");
		list.add("Pen");
		list.add("box");
		list.add("KKKK");
		list.add("AAAAAAAAA");
		list.add("PPPPP");
		list.add("Paa");
		for(String i:list) {
			if(i.indexOf("P")==0) {
				 
				 continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
