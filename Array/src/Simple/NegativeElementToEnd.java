package Simple;

public class NegativeElementToEnd {
	public static void main(String[] args) {
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int [] temp=new int[arr.length];
		int j=0;
//		for (int i = 0; i < arr.length; i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<=0) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			System.out.println(arr[i]);
//
//		}
		
		//+++++++++++++++++++++++++++++++++++++++++++++
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)  
				temp[j++]=arr[i];
		}
		 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)  
				temp[j++]=arr[i];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
	}

}
