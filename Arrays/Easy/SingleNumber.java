import java.util.Arrays;
public class SingleNumber{
	public static void main(String args[]){
		int arr[] = {1, 2, 2, 4, 3, 1, 4};//1 1 2 2 3 4 4
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			if((i==0 || arr[i]!=arr[i-1]) && (i==arr.length-1 || arr[i] != arr[i+1])){
				System.out.println(arr[i]);
			}
		}	
	}
}
