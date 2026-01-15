package self.practice.leetcode.easy;

public class MaxDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root) {
		
		if(root == null) { return 0; }
		
		return Math.max(
				maxDepth(root.left), 
				maxDepth(root.right)
			) + 1;
		
	}
	
	public static void main(String[] args) {
		
		MaxDepthOfBinaryTree m = new MaxDepthOfBinaryTree();
		
		TreeNode t;
		
		t = new TreeNode(3);
		
		t.left = new TreeNode(9);
		
		t.right = new TreeNode(20);
		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(7);
		
		System.out.println(m.maxDepth(t));
		
		t = new TreeNode(1);
		
		t.right = new TreeNode(2);
		
		System.out.println(m.maxDepth(t));
		
	}
	
	public static class TreeNode{
	
		int val;
		
		TreeNode left;
		TreeNode right;
		
		TreeNode(){}
		TreeNode(int val) { this.val = val; }
		
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	
	}
	
}
