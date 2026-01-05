public class RearangeNegPosDifLen{
	public static void main(String args[]){
		int arr[] = {1,2,-4,-5,3,4};
		int posCnt = 0;
		int negCnt = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				negCnt++;
			}else{
				posCnt++;
			}
		}
		
		int pos[] = new int[posCnt];
		int neg[] = new int[negCnt];
		
		int j = 0;
		int k = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				pos[j++] = arr[i];
			}else{
				neg[k++] = arr[i];
			}
		}
		
		j = 0;
		k = 0;
		
		if(pos.length<neg.length){
			for(int i=0;i<pos.length;i++){
				arr[i*2] = pos[j++];
				arr[i*2+1] = neg[k++];
			}
			
			int idx = pos.length*2;
			for(int i=pos.length;i<neg.length;i++){
				arr[idx] = neg[i];
				idx++;
			}
		}else{
			for(int i=0;i<neg.length;i++){
				arr[i*2] = pos[j++];
				arr[i*2+1] = neg[k++];
			}
			
			int idx = neg.length*2;
			for(int i=neg.length;i<pos.length;i++){
				arr[idx] = pos[i];
				idx++;
			}
		}
		
		for(int a:arr){
			System.out.print(a+" ");
		}
		
		System.out.println();	
	}
}
