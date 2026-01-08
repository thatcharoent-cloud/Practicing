package self.practice.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> resultList= new ArrayList<Integer>();
		
		TreeNode currNode = root;
		
		if(currNode == null) {
			return resultList;
		}
		
		Stack<TreeNode>  nodeStack = new Stack<TreeNode>();
		
		while(currNode != null || !nodeStack.isEmpty()) {
			
			while(currNode != null) {
				
				nodeStack.push(currNode);
				currNode = currNode.left;
				
			}
			
			currNode = nodeStack.pop();
			resultList.add(currNode.val);
			currNode = currNode.right;
			
		}
		
		return resultList;
		
	}
	
	public static void main(String[] args) {
		
		BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
		
		TreeNode t;
		
		t = new TreeNode(1);
		t.right = new TreeNode(2);
		t.right.left = new TreeNode(3);
		
		for(Integer i : b.inorderTraversal(t)) { System.out.println(i); };
		System.out.println();
		
		t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);
		
		t.left.left = new TreeNode(4);
		t.left.right = new TreeNode(5);
		t.left.right.left = new TreeNode(6);
		t.left.right.right = new TreeNode(7);
		
		t.right.right = new TreeNode(8);
		t.right.right.left = new TreeNode(9);
		
		for(Integer i : b.inorderTraversal(t)) { System.out.println(i); };
		System.out.println();
		
		for(Integer i : b.inorderTraversal(new TreeNode())) { System.out.println(i); };
		System.out.println();
		
		for(Integer i : b.inorderTraversal(new TreeNode(1))) { System.out.println(i); };
		
	}
	
}

class TreeNode{
	
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
