import java.util.*;
public class LonSubArraySumk{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<>();
		int arr[] = {-1,1,1};
		int k = sc.nextInt();
		
		int maxLen = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int end=0;end<arr.length;end++){//1<6
			sum += arr[end];//19	
			if(sum==	k){
				maxLen = Math.max(maxLen,end+1);
			}
			int rem = sum - k;
			if(map.containsKey(rem)){
				maxLen = Math.max(maxLen,end - map.get(rem));
			}
			
			if(!map.containsKey(sum)){
				map.put(sum,end);
			}
		}
		System.out.println(maxLen);
	}
}
