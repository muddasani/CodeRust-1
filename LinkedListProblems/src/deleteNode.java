import java.util.*;


public class deleteNode {
	
	public class LinkedListNode {
		int data;
		LinkedListNode next;
	}
	
	
	public static LinkedListNode deleteNodeLL(LinkedListNode head, int key){
		
		LinkedListNode prev  = null;
		LinkedListNode current = head;
		
		while(current != null){
			if(current.data == key){
				break;
			}
			prev = current;
			current = current.next;
		}
		
		if(current == null){
			return head;
		}
		prev.next = current.next;
		return head;
	}

}
