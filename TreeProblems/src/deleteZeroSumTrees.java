import java.util.*;


public class deleteZeroSumTrees {
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
	
	public static int deleteZeroSumSubtreeRec(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int sumLeft = deleteZeroSumSubtreeRec(root.left);
		int sumRight = deleteZeroSumSubtreeRec(root.right);
		
		if(sumLeft == 0){
			root.left = null;
		}
		if(sumRight == 0){
			root.right = null;
		}
		
		return sumLeft + sumRight + root.data;
	}
	
	public static void deleteZeroSumSubtree(TreeNode root){
		deleteZeroSumSubtreeRec(root);
	}

}
