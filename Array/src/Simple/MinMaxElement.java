package Simple;

public class MinMaxElement {
	public int min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
		
	}
	public int max(int arr[]) {
		int max=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MinMaxElement  p=new  MinMaxElement();
		int arr[]= {2,56,78,90,34};
		System.out.println(p.min(arr));	
		System.out.println(p.max(arr));
	}

}
