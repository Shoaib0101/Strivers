import java.util.*;
public class Union{
	public static void main(String args[]){
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,7};
		//1 2 3 4 5 7
		int arr3[] = new int[arr1.length+arr2.length];
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		int k = 0;
		
		//Take two pointer and put in oth place of the array after that run the loop still both array length are same
		while(i<arr1.length && j<arr2.length){
			//check for match and already exist or not in the resultan array
			if(arr1[i]==arr2[j] && (arr1[i]!=arr3[i] || k==0)){
				arr3[k++] = arr1[i];
				i++;
				j++;
			}else if(arr1[i]<arr2[j] && (arr1[i]!=arr3[i] || k==0)){
				arr3[k++] = arr1[i];
				i++;
			}else if(arr1[i]>arr2[j] && (arr1[i]!=arr3[i] || k==0)){
				arr3[k++] = arr2[j];
				j++;
			}
		}
		
		//if any remaining element copy it in result
		while(i<arr1.length){
			if(arr3[k]!=arr1[i]){
				arr3[k++] = arr1[i];
				i++;
			}
		}
		
		while(j<arr2.length){
			if(arr3[k]!=arr2[j]){
				arr3[k++] = arr2[j];
				j++;
			}
		}
		
		for(int a=0;a<k;a++){
			System.out.print(arr3[a]+" ");
		}
		System.out.println();
	}
}
