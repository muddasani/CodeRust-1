import java.util.*;

public class findMaxInASlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { -4, 2, -5, 3, 6};
		
		findMaxSliding(array, 3);

	}
	
	public static void findMaxSliding(int[] array, int windowSize){
		if(array.length < windowSize){
			return;
		}
		ArrayDeque<Integer> window = new ArrayDeque<Integer>();
		
		//find max in a sliding window
		for(int i = 0; i < windowSize; i++){
			while(!window.isEmpty() && array[i] >= array[window.peekLast()]){
				window.removeLast();
			}
			window.addLast(i);
			
		}
		
		System.out.print(array[window.peekFirst()] + ", ");
		
		for(int i = windowSize; i < array.length; i++){
			while(!window.isEmpty() && array[i] >= array[window.peekLast()]){
				window.removeLast();
			}
			if(!window.isEmpty() && window.peekFirst() <= i - windowSize){
				window.removeFirst();
			}
			
			window.addLast(i);
			System.out.print(array[window.peekFirst()]+ ", ");
		}
		
		
	}

}