public class LeftRotateK{
	public static void reverse(int arr[],int low,int high){
		while(low<high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6};  //3 4 5 6 1 2   
		int k = 2;

		//6 5 4 3 2 1
		reverse(arr,0,arr.length-1);
		//3 5 4 3 1 2
		reverse(arr,0,arr.length-k-1);//0 1 2 3
		//3 4 5 6 2 1
		reverse(arr,arr.length-k,arr.length-1);

		for(int a:arr){
			System.out.print(a+" ");
		}

		System.out.println();
	}
}
