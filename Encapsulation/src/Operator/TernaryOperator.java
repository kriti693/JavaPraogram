package Operator;

public class TernaryOperator {
	public static void main(String[] args) {
		int x=9,y=3;
		x=(x/y<3) ? (x+=y):(x*=y) ;
		System.out.println("After ternary operator "+x);
	}

}
