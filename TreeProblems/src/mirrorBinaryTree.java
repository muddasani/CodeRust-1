import java.util.*;


public class mirrorBinaryTree {
	
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
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
	
	public static void mirrorTree(TreeNode root){
		if(root == null){
			return;
		}
		if(root.left != null){
		    mirrorTree(root.left);
		}
		if(root.right != null){
		    mirrorTree(root.right);
		}
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
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