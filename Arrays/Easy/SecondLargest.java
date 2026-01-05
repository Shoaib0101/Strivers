public class SecondLargest{
	public static void main(String args[]){
		int arr[] = {4,5,6,4,6,8};
		int max = arr[0];
		int secMax = 0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				secMax = max;
				max = arr[i];
			}else if(arr[i]!=max && arr[i]>secMax){
				secMax = max;
			}
		}

		System.out.println("Secound Max is :"+secMax);
	}
}
