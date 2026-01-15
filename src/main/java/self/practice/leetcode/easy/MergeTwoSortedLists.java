package self.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
		
		ListNode tmp, tmp2, result, tmpPointer;
		tmp = list1;
		tmp2 = list2;
		
		result = new ListNode(-1);
		tmpPointer = result;
		
		int tmpVal, tmpVal2;
		
		while(tmp != null) {
			
			tmpVal = tmp.val;
			while(tmp2 != null) {
				
				tmpVal2 = tmp2.val;
				if(tmpVal2 < tmpVal) {
					
					tmpPointer.next = new ListNode(tmpVal2);
					tmpPointer = tmpPointer.next;
					
				}else {
					break;
				}
				
				tmp2 = tmp2.next;
				
			}
			
			tmpPointer.next = new ListNode(tmpVal);
			tmpPointer = tmpPointer.next;
			
			tmp = tmp.next;
			
		}
		
		while(tmp2 != null) {
			
			tmpVal2 = tmp2.val;
			
			tmpPointer.next = new ListNode(tmpVal2);
			tmpPointer = tmpPointer.next;
			
			tmp2 = tmp2.next;
			
		}
		
		return result.next;
		
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		List<Integer> procArr = new ArrayList<Integer>();
		
		ListNode tmp =  list1;
		
		while(tmp != null) {
			
			procArr.add(tmp.val);
			tmp = tmp.next;
			
		}
		
		tmp =  list2;
		while(tmp != null) {
			
			procArr.add(tmp.val);
			tmp = tmp.next;
			
		}
		
		Collections.sort(procArr);
		
		ListNode result = new ListNode(-1);
		tmp = result;
		for(int i : procArr) {
			
			tmp.next = new ListNode(i);
			tmp = tmp.next;
			
		}
		
		return result.next;
		
	}
	
	public static void main(String[] args) {
		
		MergeTwoSortedLists m = new MergeTwoSortedLists();
		
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(10);
		l1.next.next = new ListNode(15);
		l1.next.next.next = new ListNode(15);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(20);
		
		ListNode resultNode = m.mergeTwoLists2(l1, l2);
		while(resultNode!=null) {
			
			System.out.println(resultNode.val);
			
			resultNode = resultNode.next;
			
		}
		
	}
	
}

class ListNode{
	
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	
}
