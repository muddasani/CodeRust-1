import java.util.*;


public class swapNode {
	
	public static class LinkedListNode {
		int data;
		LinkedListNode next;
	}
	
	public static void print(LinkedListNode head){
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
		System.out.print("null");
	}

	
	public static void main(String Args[]){
			LinkedListNode head = new LinkedListNode();
			LinkedListNode h2 = new LinkedListNode();
			LinkedListNode h3 = new LinkedListNode();
			LinkedListNode h4 = new LinkedListNode();
			LinkedListNode h5 = new LinkedListNode();
			
			head.data = 1;
			
			head.next = h2;
			
			
			h2.data = 2;

			
			h2.next = h3;
			
			
			h3.data = 3;
			
			h3.next = null;
			
			print(head);
			
			LinkedListNode current = swapNodeLL(head, 2);
			
			print(current);
			
			
	}
	
	public static LinkedListNode swapNodeLL(LinkedListNode head, int n){
		LinkedListNode prev = null;
		LinkedListNode cur = head;
		
		//Edge case 1
		if(head == null){
			return null;
		}
		
		//Edge case:1
		if(n == 1){
			return head;
		}
		
		for(int count = 1; cur != null && count < n;count++){
			prev = cur;
			cur = cur.next;
		}
		
		
		prev.next = head;
		LinkedListNode temp = head.next;
		head.next = cur.next;
		cur.next = temp;
		
		return cur;
	}

}
