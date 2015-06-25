
public class binarySearch {
	
	public static void main(String Args[]){
		
	}
	
	public static int binarySearch(int a[],int low, int high, int key){
		if(low > high){
			return -1;
		}
		int mid = low + (high - low)/2;
		
		if(a[mid] == key){
			return mid;
		}
		
		if(a[mid] > key){
			return binarySearch(a, low, mid, key);
		} else {
			return binarySearch(a, mid+1,high,key);
		}
	}
	
	public static int binarySearch(int a[], int key){
		return binarySearch(a, 0, a.length,key);
		
	}

}
