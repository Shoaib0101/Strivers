public class SortZeroOneTwo{
	public static void sortZeroOneTwo(int arr[]){
		int l = 0;
		int m = 0;
		int h = arr.length-1;
		
		while(m<=h){
			if(arr[m]==0){
				int temp = arr[m];
				arr[m] = arr[l];
				arr[l] = temp;
				l++;
				m++;
			}else if(arr[m]==1){
				m++;
			}else if(arr[m]==2){
				int temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
	}
	public static void main(String args[]){
		int arr[] = {1, 0, 2, 1, 0};
		sortZeroOneTwo(arr);
		
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
