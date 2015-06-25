
public class largestSumOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMaxSumArray(int[] A){
		if(A.length < 1){
			return 0;
		}
		int currentMax = A[0];
		int globalMax  = A[0];
		
		for(int i = 1; i < A.length; i++){
			if(currentMax < 0){
				currentMax = A[i];
			} else {
				currentMax += A[i];
			}
			
			if(globalMax < currentMax){
				globalMax = currentMax;
			}
		}
		
		return globalMax;
	}

}
