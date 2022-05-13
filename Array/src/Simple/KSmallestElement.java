package Simple;

public class KSmallestElement {
	public static void main(String[] args) {
		SortedArray so=new SortedArray();
		int arr[]= {3,4,7,12,3,89,0};
		so.sortArray(arr);
		int k=4;
		 System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(arr[k-1]);
	}
	
}
