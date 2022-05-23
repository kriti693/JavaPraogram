package Udemy;

import java.time.LocalDate;

class Student {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class T6 {
	private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }
	public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);
        int a = 100;
        System.out.println(-a++);
        int i = '5';
        m(i);
        m('5');
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);
    }

}
