import java.util.*;
public class Leaders{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<>();
		int arr[] = {4, 7, 1, 0};
		int maxRight = arr[arr.length-1];
		list.add(maxRight);
		
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>maxRight){
				maxRight = arr[i];
				list.add(maxRight);
			}
		}
		
		System.out.println(list);
	}	
}
