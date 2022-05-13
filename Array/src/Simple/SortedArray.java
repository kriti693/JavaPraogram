package Simple;

public class SortedArray {
	public void sortArray(int arr[]) {
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				 
			}
			System.out.println(arr[i]); 
		}
		

	}
	public static void main(String[] args) {
		SortedArray s=new SortedArray();
		int arr[]= {1,9,5,0,0};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		s.sortArray(arr);
	}

}
