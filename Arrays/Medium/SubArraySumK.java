public class SubArraySumK{
	public static int subarraySum(int[] nums, int k) {
         
        int sum = 0;
        int cnt = 0;
        int start = 0;
      
        for(int i=0;i<nums.length;i++){//1<1
        	sum+=nums[i];
        	
            	System.out.println("cnt="+cnt);
            	while(sum>k){
              	sum-=nums[start];
                	start++;
        	}
        	
        	System.out.println("sum="+sum+" k="+k);
            	if(sum==k){//1==0
                cnt++;
            	}
        }
        		System.out.println("cnt="+cnt);
    		return cnt;
	}
	public static void main(String args[]){
		int arr[] = {1};
		System.out.print(subarraySum(arr,0));
	}
}
