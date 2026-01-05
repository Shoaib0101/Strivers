public class LinearSearch{
	public static void main(String args[]){
		int arr[] = {4,5,6,5,8,9};
		int x = 5;
		boolean flag = false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Found");
		}else{
			System.out.println("Not");
		}
	}
}
