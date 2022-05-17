package Simple;

class Test1 {
	public static int num = 0;
}

public class PeakElement {
	public static void main(String[] args) {
		Test1 a = new Test1();
		Test1 b = new Test1();
		a.num += 1;
		b.num += a.num;
		Test1.num = Test1.num * 5;
		System.out.println(a.num);
		System.out.println(b.num);
		Employee myManager = new Manager();
		//Manager myExec = new Executive();
	}
}

class Employee {
}

class Manager extends Employee {
}

class Executive extends Employee {

}
