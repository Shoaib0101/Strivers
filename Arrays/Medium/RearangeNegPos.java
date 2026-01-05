public class RearangeNegPos{
	public static void main(String args[]){
		int arr[] = {1, -1, -3, -4, 2, 3};
		int res[] = new int[arr.length];
		
		int ptr1 = 0;
		int ptr2 = 1;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				res[ptr1] = arr[i];
				ptr1+=2;
			}else{
				res[ptr2] = arr[i];
				ptr2+=2;	
			}
		}
		
		for(int a:res){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
