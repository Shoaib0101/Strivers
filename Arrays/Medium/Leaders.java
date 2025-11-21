public class Leaders{
	public static void main(String args[]){
		int arr[] = {4, 7, 1, 0};
		int maxRight = arr[arr.length-1];
		System.out.println(maxRight);
		
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>maxRight){
				System.out.println(arr[i]);
				maxRight = arr[i];
			}
		}
	}	
}
