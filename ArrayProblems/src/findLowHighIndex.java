import java.util.*;
public class findLowHighIndex {
	
	public static int findLowIndex(List<Integer> arr, int key){
		
		int low = 0;
		int high = arr.size() - 1;
		int mid = high/2;
		
		while(low <= high){
			int midElem = arr.get(mid);
			
			if(midElem > key){
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			
			mid = low + (high-low)/2;
		}
		
		if(arr.get(low) == key){
			return low;
		}
		
		
		
		return -1;
	}
	public static int findHighIndex(List<Integer> arr, int key){
		
		int low = 0;
		int high = arr.size() - 1;
		int mid = high/2;
		
		while(low <= high){
			int midElem = arr.get(mid);
			
			if(midElem <= key){
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			
			mid = low + (high-low)/2;
		}
		
		if(arr.get(low) == key){
			return low;
		}
		
		
		
		return -1;
	}


}
