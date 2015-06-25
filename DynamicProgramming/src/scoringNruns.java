
public class scoringNruns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Scoring options are 1,2,4
	public static  int scoringOptionsRec(int n, int[] result){
		if(n < 0){
			return 0;
		}
		if(result[n] > 0){
			return result[n];
		}
		
		result[n] = scoringOptionsRec(n - 1, result) +
					scoringOptionsRec(n - 2, result) +
					scoringOptionsRec(n - 4, result);
		
		return result[n];
	}
	
	public static int scoringOptions(int n){
		if(n <= 0){
			return 0;
		}
		
		int[] result = new int[n+1];
		result[0] = 1;
		
		scoringOptionsRec(n, result);
		
		return result[n];
	}

}
