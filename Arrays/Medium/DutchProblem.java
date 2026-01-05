import java.util.*;
public class DutchProblem{
	public static void main(String args[]){
		int arr[] = {1,0,2,1,0};
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		
		while(mid<=high){
			
			if(arr[mid] == 0){
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
			}else if(arr[mid]==1){
				mid++;
			}else if(arr[mid]==2){
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
