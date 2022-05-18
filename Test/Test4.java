package Test;

class TestA {
	public void start() {
		System.out.println("TestA");
	}
}

public class Test4 extends TestA {
	public void start() {
		System.out.println("TestB");
	}

	public static void main(String[] args) {
		((TestA) new Test4()).start();
		
	}
}
