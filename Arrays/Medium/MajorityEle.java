public class MajorityEle{
	public static void main(String args[]){
		int arr[] = {7,0,0,1,7,7,2,7,7};
		
		int freq = 0;
		int maj = arr[0];
		for(int i=0;i<arr.length;i++){
			if(freq==0){
				maj = arr[i];
				freq++;
			}else if(arr[i]==maj){
				freq++;
			}else{
				freq--;
			}
		}
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==maj){
				cnt++;
			}
		}
		if(cnt>(arr.length/2)){
			System.out.println(maj+"");	
		}else{
			System.out.println("No Majority");
		}
	}
}
