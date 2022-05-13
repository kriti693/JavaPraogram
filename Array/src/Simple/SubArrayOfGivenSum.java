package Simple;

public class SubArrayOfGivenSum {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int curr_sum=0,start=0;
		int sum=15;
		for(int i=0;i<arr.length;i++) {
			while(curr_sum>sum && start<i-1) {
				curr_sum=curr_sum-arr[start];
				start++;
			}
			if(curr_sum==sum) {
				System.out.println((start+1)+" "+i);
				 break;
				 
			}
			if(i<arr.length) {
				curr_sum=curr_sum+arr[i];
			}
			 
		}
		
		 
	}

}
