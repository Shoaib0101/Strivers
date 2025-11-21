public class MissingNumber{
	public static void main(String args[]){
		int arr[] = {1,2,3,5,6,7,8,9};
		
		int n = 6;	
		int totalSum = n*(n+1)/2;
		
		int actualSum = 0;
		for(int i=0;i<arr.length;i++){
			actualSum += arr[i];
		}	
		int miss = totalSum - actualSum;
		
		System.out.println("Missing number is:"+miss);
	}
}
