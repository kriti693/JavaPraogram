package Test;

public class Test8 extends Thread implements Runnable {
	public static void main(String[] args) throws Exception {

//		Thread t = new Thread(new Test8());
//		t.start();
//		System.out.print("Started");
//		t.join();
//		System.out.print("Complete");
	}

//	public void run() {
//		for (int i = 0; i < 4; i++) {
//			System.out.print(i);
//		}
//	}
	Runnable r=new Runnable(){
		public void run(){System.out.print("Cat");}};
	Thread t = new Thread(r)
	{
	public void run()
	{
	System.out.print("Dog");
	}
	};
	//t.start();
}