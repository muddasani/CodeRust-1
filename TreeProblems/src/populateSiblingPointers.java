import java.util.*;


public class populateSiblingPointers {
	
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		
		public TreeNode(int data){
			this.data = data;
		}
	}
	
	public static void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data);
			System.out.print(" ");
			inOrder(root.right);
		}
	}
	
	
	public static void populatePointers(TreeNode root){
		if(root == null){
			return;
		}
		TreeNode current = root;
		TreeNode last = root;
		
		while(current != null){
			if(current.left!= null){
				last.next = current.left;
				last = current.next;
			}
			if(current.right != null){
				last.next = current.right;
				last = current.right;
			}
			current  = current.next;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode h1 = new TreeNode(0);
		TreeNode h2 = new TreeNode(10);
		
		root.left = h1;
		root.right = h2;
		
		h1.left = null;
		h1.right = null;
		
		h2.left = null;
		h2.right = null;
		inOrder(root);

	}

}