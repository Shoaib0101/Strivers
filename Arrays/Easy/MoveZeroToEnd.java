public class MoveZeroToEnd{
	public static void main(String args[]){
		int arr[] = {0, 1, 4, 0, 5, 2};
		int j = 0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[j] = arr[i];
				j++;
			}
		}

		for(int i=j;i<arr.length;i++){
			arr[i] = 0;
		}

		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
