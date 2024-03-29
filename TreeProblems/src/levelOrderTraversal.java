import java.util.*;


public class levelOrderTraversal {

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
	
	public static void levelOrderTraversal(TreeNode root){
		if(root == null){
			return;
		}
		
		ArrayList<Queue<TreeNode>> queues = new ArrayList<Queue<TreeNode>>();
		queues.add(new ArrayDeque<TreeNode>());
		queues.add(new ArrayDeque<TreeNode>());
		
		Queue<TreeNode> currentQueue = queues.get(0);
		Queue<TreeNode> nextQueue = queues.get(1);
		
		currentQueue.add(root);
		int level =0;
		
		while(!currentQueue.isEmpty()){
			TreeNode temp = currentQueue.poll();
			System.out.print(temp.data + " ");
			
			if(temp.left != null){
				nextQueue.add(temp.left);
			}
			if(temp.right != null){
				nextQueue.add(temp.right);
			}
			
			if(currentQueue.isEmpty()){
				System.out.println();
				level++;
				currentQueue = queues.get(level % 2);
				nextQueue = queues.get((level+1) % 2 );
			}				
		}
		System.out.println();
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
