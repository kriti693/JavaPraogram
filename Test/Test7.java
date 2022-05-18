package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test7 {
	public static Iterator reverse(List list)
	{
	Collections.reverse(list);
	return list.iterator();
	}
	public static void main(String[] args)
	{
	int arr[]=new int[5];
	 
	List list = new ArrayList();
	list.add("1"); list.add("2"); list.add("3");
	//for (Object obj: reverse(list))
	//System.out.print(obj + ", ");
	} 

}
