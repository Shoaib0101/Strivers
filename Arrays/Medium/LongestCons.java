public class LongestCons{
	public static boolean linearSearch(int arr[],int x){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int arr[] = {100,200,4,1,2,3};
		
		int cnt = 1;
		int lon = 1;
		
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			cnt = 1;
			while(linearSearch(arr,x+1)){
				x+=1;
				cnt++;
			}
			
			lon = Math.max(cnt,lon);
		}
		
		System.out.println(lon);
	}
}
