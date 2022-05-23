package Udemy;

import java.util.*;

class Stu {
	private String name;
	private int age;

	Stu(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student[" + name + ", " + age + "]";
	}
}

public class T9 {
	public static void main(String[] args) {
	        List<Stu> students = new ArrayList<>();
	        students.add(new  Stu("James", 25));
	        students.add(new  Stu("James", 27));
	        students.add(new  Stu("James", 25));
	        students.add(new  Stu("James", 25));

	        students.remove(new  Stu("James", 25));

	        for( Stu stud : students) {
	            System.out.println(stud);
	        }
	        int [] arr = {2, 1, 0};
	         for(int i : arr) {
	             System.out.println(arr[i]);
	         }
//	         Double [] arr1 = new Double[2];
//	         System.out.println(arr1[0] + arr1[1]);
	         String [] arr1 = {"I", "N", "S", "E", "R", "T"};
	         for(int n = 1; n < arr1.length; n += 2) {
	             if (n % 2 == 0) {
	                 continue;
	             }
	             System.out.print(arr1[n]); //Line n1
	         }
	         
	     
	    }

}
