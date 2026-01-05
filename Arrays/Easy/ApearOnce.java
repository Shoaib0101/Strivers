import java.util.*;
public class ApearOnce{
	public static int apearOnce(int arr[]){
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			Integer cnt  = map.get(arr[i]);
			if(cnt == null){
				cnt = 0;
			}
			++cnt;
			map.put(arr[i],cnt);	
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue()==1){
				return entry.getKey();
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int arr[] = {4,1,2,1,2};
		
		int xor = 0;
		
		for(int i=0;i<arr.length;i++){
			xor ^= arr[i];
		}
		
		System.out.println(xor);
	}
}
