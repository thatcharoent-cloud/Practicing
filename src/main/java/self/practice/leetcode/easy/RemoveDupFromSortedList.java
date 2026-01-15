package self.practice.leetcode.easy;

import self.practice.leetcode.utils.ListNode;

public class RemoveDupFromSortedList {
	
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode result, tmpNode;
		result = new ListNode(Integer.MIN_VALUE);
		tmpNode = result;
		
		int tmp = 0;
		
		while((head!=null)) {
			
			tmp = head.val;
			
			if(tmp != tmpNode.val) {
				
				tmpNode.next = new ListNode(tmp);
				tmpNode = tmpNode.next;
				
			}
			
			head = head.next;
			
		}
		
		result = result.next;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		RemoveDupFromSortedList r = new RemoveDupFromSortedList();
		
		ListNode n;
		
		n = new ListNode(1);
		n.next = new ListNode(1);
		n.next.next = new ListNode(2);
		r.deleteDuplicates(n);
		
		n = new ListNode(1);
		n.next = new ListNode(1);
		n.next.next = new ListNode(2);
		n.next.next.next = new ListNode(3);
		n.next.next.next.next = new ListNode(3);
		r.deleteDuplicates(n);
		
	}
	
}
