public class LonSubArraySumk{
	public static void main(String args[]){
		int arr[] = {10, 5, 2, 7, 1, 9};
		int k = 15;
		int start = 0;
		int ml = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int end=0;end<arr.length;end++){//1<6
			sum += arr[end];//19
		
			while(sum>k){//15 == 15				
				sum -= arr[start++];//sum = 10   start = 2 
			}
			
			if(sum==k){
				int cl = end - start+1;//4
				ml = Math.max(cl,ml);//4
			}
		}
		System.out.println(ml);
	}
}
