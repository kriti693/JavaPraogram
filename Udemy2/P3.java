package Udemy2;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
	public abstract void m1() ;
}

class Sub extends Super {
	@Override
	public void m1()  {
		throw new ArrayIndexOutOfBoundsException("dfghj");
	}
}

public class P3 {
	public static void main(String[] args)  {
		Super s = new Sub();
		try {
			s.m1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("A");
		} finally {
			System.out.print("C");
		}
	}

}
