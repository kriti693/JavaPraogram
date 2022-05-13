package Simple;

public class ReverseArray {
	 
		static void rev(int  arr[], int start, int end) {
			while(start<end) {
				int temp= arr[start];
				arr[start]= arr[end];
				arr[end]= temp;
				start++;
				end--;
			}
		}
		static void display(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		public static void main(String []args) {
		int arr[] = {2,11,6,5,45,98,3};
		display(arr);
		rev(arr,0,arr.length-1);
		display(arr);	
		 
		 
		}
	}


