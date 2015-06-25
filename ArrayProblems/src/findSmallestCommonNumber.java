
public class findSmallestCommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findSmallestNumber(int[] arr1, int[] arr2, int[] arr3){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length && k < arr3.length){
			
			if(arr1[i] == arr2[j]  && arr2[j] == arr3[k]){
				return arr1[i];
			}
			
			if(arr1[i] <= arr2[j] && arr2[j] <= arr3[k]){
				i++;
			}
			
			if(arr2[j] <= arr3[k] && arr2[j] <= arr1[i]){
				j++;
			}
			
			if(arr3[k] <= arr2[j] && arr3[k] <= arr1[i]){
				k++;
			}
			
		}
		
		return -1;
	}

}