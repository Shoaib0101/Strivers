import java.util.*;
public class LongestCons{
		public static boolean linearSearch(int arr[],int target){
			for(int i=0;i<arr.length;i++){
				if(arr[i]==target){
					return true;
				}
			}
			return false;
		}
		public static void main(String args[]){
			
			int arr[] = {100,102,105,103,104,4,5,101,1,3,2};
			int  maxLen = 1;
			
			//Brute Force aproach
			/*for(int i=0;i<arr.length;i++){
				int x = arr[i];
					
				int cnt = 1;
					
				while(linearSearch(arr,x+1)){
					x++;
					cnt++;
				}
				maxLen = Math.max(maxLen,cnt);
			}
			System.out.println(maxLen);*/
			
			/*Better Aproach
			Arrays.sort(arr);
			int cnt = 0;
			int smaller = Integer.MIN_VALUE;
			//1 2 3 4 5 100 200 300 400 500 600
			for(int i=0;i<arr.length;i++){
				if(arr[i] - 1 == smaller){
					cnt+=1;
					smaller = arr[i];
				}else if(arr[i] != smaller){
					smaller = arr[i];
					cnt = 1;
				}
				maxLen = Math.max(maxLen,cnt);
				
			}*/
			
			//Optimal aproach
			HashSet<Integer> set = new HashSet<>();
			
			for(int i=0;i<arr.length;i++){
				set.add(arr[i]);
			}
			
			for(Integer s:set){
				if(!set.contains(s-1)){
					int cnt = 1;
					int x = s;
					
					while(set.contains(x+1)){
						cnt++;
						x++;
					}
					maxLen = Math.max(maxLen,cnt);
				}
				
			}
			System.out.println(maxLen);
	}
}
