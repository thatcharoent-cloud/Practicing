package self.practice.leetcode.easy;

import self.practice.leetcode.utils.TreeNode;

public class SymmetricTree {
	
	public boolean isSymmetric(TreeNode root) {
		
		if(root == null) {
			return true;
		}
		
		return check(root.left, root.right);
		
	}

	private boolean check(TreeNode p, TreeNode q) {
		
		if(p==null && q==null) {
			return true;
		}
		
		if(p==null || q==null) {
			return false;
		}
		
		if(p.val != q.val) {
			return	false;
		}
		
		return check(p.left, q.right)&&check(p.right, q.left);
		
	}

	public static void main(String[] args) {
		
		SymmetricTree b = new SymmetricTree();
		
		TreeNode root;
		
		root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		System.out.println(b.isSymmetric(root));
		System.out.println();
		
		root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		
		System.out.println(b.isSymmetric(root));
		System.out.println();
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(b.isSymmetric(root));
		
	}
	
}
