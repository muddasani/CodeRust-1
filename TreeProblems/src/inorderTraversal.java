import java.util.*;




public class inorderTraversal {
	
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
	
	public static void iterativeInOrder(TreeNode root){
		if(root == null){
			return;
		}
		Stack<TreeNode> stk = new Stack<TreeNode>();
		while(!stk.isEmpty() || root != null){
			if(root != null){
				stk.push(root);
				root = root.left;
				continue;
			}
			System.out.print(stk.peek().data + " ");
			root = stk.pop().right;
		}
		
	}
	
	public static void main(String args[]){
		//1st Tree
		TreeNode root = new TreeNode(5);
		TreeNode h1 = new TreeNode(0);
		TreeNode h2 = new TreeNode(10);
		
		root.left = h1;
		root.right = h2;
		
		h1.left = null;
		h1.right = null;
		
		h2.left = null;
		h2.right = null;
		
		//2nd Tree
		TreeNode root1 = new TreeNode(5);
		TreeNode b1 = new TreeNode(0);
		TreeNode b2 = new TreeNode(9);
		
		root1.left = b1;
		root1.right = b2;
		
		b1.left = null;
		b1.right = null;
		
		b2.left = null;
		b2.right = null;
		
		iterativeInOrder(root);
	}

}
