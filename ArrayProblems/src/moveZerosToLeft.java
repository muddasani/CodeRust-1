
public class moveZerosToLeft {
	public static void moveZerosToLeft(int[] A){
		int writeIndex = A.length - 1;
		int readIndex = A.length - 1;
		
		while(readIndex >= 0){
			if(A[readIndex] != 0){
				A[writeIndex] = A[readIndex];
				writeIndex--;
			} 
			readIndex--;
		}
		
		while(writeIndex >= 0){
			A[writeIndex] = 0;
			writeIndex--;
		}
	}
}
