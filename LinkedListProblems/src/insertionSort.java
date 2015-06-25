import java.util.*;


public class insertionSort {
	
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

	public static void main(String[] args) {
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

	}
	
	public static LinkedListNode sortedInsert(LinkedListNode head, LinkedListNode node){
		if(node == null){
			return head;
		}
		if(head == null || node.data <= head.data){
			node.next = head;
			return node;
		}
		
		LinkedListNode cur = head;
		
		
		while((cur.next != null) && (cur.next.data <= node.data) ){
			cur = cur.next;
		}
		/*
		 * cur.next points to where it should be inserted 
		 */
		
		node.next = cur.next;
		cur.next = node;
		
		
		return head;
	}
	
	public static LinkedListNode insertionSort(LinkedListNode head){
		LinkedListNode sorted = null;
		LinkedListNode curr = head;
		
		while(curr != null){
			LinkedListNode temp = curr.next;
			sorted = sortedInsert(sorted, curr);
			curr = temp;
		}
		
		return sorted;
	}

}
