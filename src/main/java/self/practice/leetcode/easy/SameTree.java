package self.practice.leetcode.easy;

public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		return checkTree(p, q);
		
	}
	
	private boolean checkTree(TreeNode p, TreeNode q) {
		
		if(p==null && q==null) { return true; }
		
		if(p==null && q!=null) { return false; }
		if(p!=null && q==null) { return false; }
		
		if(p.val != q.val) { return false;}
		
		if(!checkTree(p.left, q.left)) { return false; }
			
		if(!checkTree(p.right, q.right)) { return false; }
		
		return true;
		
	}

	public static void main(String[] args) {
		
		SameTree b = new SameTree();
		
		TreeNode p, q;
		
		p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		
		q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		System.out.println(b.isSameTree(p, q));
		
		p = new TreeNode(1);
		p.left = new TreeNode(2);
		
		q = new TreeNode(1);
		q.right = new TreeNode(2);
		
		System.out.println(b.isSameTree(p, q));
		
		p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(1);
		
		q = new TreeNode(1);
		q.left = new TreeNode(1);
		q.right = new TreeNode(2);
		
		System.out.println(b.isSameTree(p, q));
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
