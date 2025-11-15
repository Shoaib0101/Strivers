public class RemoveDuplicate{
	public static void main(String args[]){
		int arr[] = {0, 0, 3, 3, 5, 6};
		int j = 0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=arr[j]){
				j++;
				arr[j] = arr[i];
			}
		}

		for(int i=0;i<=j;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
