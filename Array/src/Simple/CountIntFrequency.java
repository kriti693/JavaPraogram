package Simple;

public class CountIntFrequency {
	public static int CountFrequecy(int arr[], int x) {
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
		}
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 3, 4, 4 };
		System.out.println(CountFrequecy(arr, 1));
		
//		int i = 0;
//		boolean t = true;
//		boolean f = false, b;
//		b = (t | ((i++) == 0));
//		b = (f | ((i+=2) > 0));
//		System.out.println(14 ^ 23);
	}
}
