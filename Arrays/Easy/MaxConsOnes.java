public class MaxConsOnes{
	public static void main(String args[]){
		int arr[] = {1, 1, 0, 0, 1, 1, 1, 0};
		int start = 0;
		
		int cnt = 0;
		int ml = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				cnt++;
			}else{
				cnt = 0;
			}
			
			if(cnt>ml)
				ml = cnt;//2
		}
		
		System.out.println(ml);		
	}
}
