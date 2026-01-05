public class MaxSumKadanes{
	public static void main(String args[]){
		int arr[] = {2, 3, -7, 2, -10, -4};
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		int indx = -1;
		for(int i=0;i<arr.length;i++){
			cs += arr[i];
			
			if(cs<0){
				cs = 0;
			}
			if(cs>ms){
				indx = i;
				ms = cs;
			}
		}
		
		System.out.println(ms+" ");
		for(int i=0;i<=indx;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
