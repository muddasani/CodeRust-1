import java.util.*;


public class rotateLinkedList {
	
	public class LinkedListNode {
		int data;
		LinkedListNode next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printList()

	}
	
	public static void printList(LinkedListNode head){
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
	}
	
	public static int findLength(LinkedListNode head){
		int i = 0;
		while(head != null){
			i++;
			head = head.next;	
		}
		return i;
	}
	
	public static LinkedListNode rotateLL(LinkedListNode head, int n){
		
		//Find nth node(assume that n is less than the length of the list)
		if(head == null || n == 0){
			return head;
		}
		
		int len = findLength(head);
		int rotationsCount = len - n - 1;
		LinkedListNode temp = head;
		
		while(rotationsCount > 0){
			rotationsCount--;
			temp = temp.next;
		}
		
		//One node prior
		LinkedListNode newHead =temp.next;
		
		//Set new end of list
		temp.next = null;
		
		//Iterate to the end of list and link it to the original head
		temp = newHead;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
		
		return newHead;
	}

}