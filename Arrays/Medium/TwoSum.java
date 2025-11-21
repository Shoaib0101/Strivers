import java.util.Arrays;
public class TwoSum{
	public static String twoSum(int arr[],int target){
				
		int low = 0;
		int high = arr.length-1;
		
		while(low<high){
			
			int sum = arr[low]+arr[high];
			if(sum==target){
				return "Yes";
			}else if(sum>target){
				high--;
			}else{
				low++;
			}		
		}
		return "No";
	}
	public static void main(String args[]){
		int arr[] = {2,6,5,8,11};
		int target = 46;
		Arrays.sort(arr);
		System.out.println(twoSum(arr,target));
	}
}

