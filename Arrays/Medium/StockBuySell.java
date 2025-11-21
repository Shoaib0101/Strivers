public class StockBuySell{
	public static void main(String args[]){
		int arr[] = {5, 4, 3, 2, 1};//4
		
		int minPrice = Integer.MAX_VALUE;
		int maxPro = 0;
		
		for(int i=0;i<arr.length;i++){
			if(minPrice>arr[i]){
				minPrice = arr[i];
				maxPro   =  arr[i] - minPrice;
			}
		}
		
		System.out.println("Profit is :"+maxPro);	
	}
}
