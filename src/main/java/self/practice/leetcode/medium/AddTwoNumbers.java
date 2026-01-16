package self.practice.leetcode.medium;

import self.practice.leetcode.utils.ListNode;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		
		ListNode tmpL1, tmpL2, resultNode, tmpResultNode;
		tmpL1 = l1;
		tmpL2 = l2;
		
		resultNode = new ListNode();
		tmpResultNode = resultNode;
		
		int tmpVal;
		
		boolean isPlus = false;
		
		while(tmpL1!=null || tmpL2!=null) {
			
			tmpVal = 0;
			
			if(tmpL1!=null && tmpL2!=null) {
				
				tmpVal = tmpL1.val + tmpL2.val;
				
				tmpL1 = tmpL1.next;
				tmpL2 = tmpL2.next;
				
			}else if(tmpL1 != null) {
				
				tmpVal = tmpL1.val;
				tmpL1 = tmpL1.next;
				
			}else {
				
				tmpVal = tmpL2.val;
				tmpL2 = tmpL2.next;
				
			}
			
			if(isPlus) {
				
				tmpVal += 1;
				isPlus = false;
				
			}
			
			if(tmpVal > 9) {
				
				isPlus = true;
				tmpVal = tmpVal%10;
				
			}
			
			tmpResultNode.next = new ListNode(tmpVal);
			tmpResultNode = tmpResultNode.next;
			
		}
		
		if(isPlus) {
			
			tmpResultNode.next = new ListNode(1);
			tmpResultNode = tmpResultNode.next;
			
		}
		
		return resultNode.next;
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		String l1Str, l2Str, resultStr;
		l1Str = toStr(l1);
		l2Str = toStr(l2);
		
		resultStr = "";
		
		char[] l1Ch, l2Ch;
		l1Ch = l1Str.toCharArray();
		l2Ch = l2Str.toCharArray();
		
		int l1Pos, l2Pos, l1Len, l2Len, tmp;
		l1Pos = l2Pos = 0;
		
		l1Len = l1Ch.length;
		l2Len = l2Ch.length;
		
		boolean isPlus = false;
		
		
		while(l1Pos<l1Len || l2Pos<l2Len) {
			
			tmp = 0;
			
			if(l1Pos<l1Len && l2Pos<l2Len) {
				
				tmp = Integer.parseInt(String.valueOf(l1Ch[l1Pos])) + Integer.parseInt(String.valueOf(l2Ch[l2Pos]));
				if(isPlus) {
					
					tmp += 1;
					isPlus = false;
					
				}
				
			}else if(l1Pos<l1Len) {
				
				tmp = Integer.parseInt(String.valueOf(l1Ch[l1Pos]));
				if(isPlus) {
					
					tmp += 1;
					isPlus = false;
					
				}
				
			}else if(l2Pos<l2Len) {
				
				tmp = Integer.parseInt(String.valueOf(l2Ch[l2Pos]));
				if(isPlus) {
					
					tmp += 1;
					isPlus = false;
					
				}
				
			}
			
			if(tmp > 9) {
				
				isPlus = true;
				resultStr += String.valueOf(tmp%10);
				
			}else {
				resultStr += String.valueOf(tmp);
			}
			
			l1Pos++;
			l2Pos++;
			
		}
		
		if(isPlus) {
			resultStr += "1";
		}
		
		ListNode resultNode, tmpNode;
		
		resultNode = new ListNode();
		
		tmpNode = resultNode;
		
		char[] resultArr = resultStr.toCharArray();
		for(char c : resultArr) {
			
			tmpNode.next = new ListNode(c - '0');
			tmpNode = tmpNode.next;
			
		}
		
		return resultNode.next;
		
	}
	
	private String toStr(ListNode l) {
		
		ListNode tmp = l;
		
		String result = "";
		while(tmp != null) {
			
			result += tmp.val;
			
			tmp = tmp.next;
			
		}
		
		return result;
	}

	public int toNumber(ListNode l) {
		
		ListNode tmp = l;
		
		int multiply, result;
		multiply = 1;
		result = 0;
		
		while(tmp != null) {
			
			result += (tmp.val) * multiply;
			
			tmp = tmp.next;
			multiply *= 10;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		AddTwoNumbers a = new AddTwoNumbers();
		
		ListNode l1, l2;
		l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		a.printResult(a.addTwoNumbers(l1, l2));
		System.out.println();
		a.printResult(a.addTwoNumbers2(l1, l2));
		System.out.println();
		
		l1 = new ListNode(0);
		l2 = new ListNode(0);
		
		a.printResult(a.addTwoNumbers(l1, l2));
		System.out.println();
		a.printResult(a.addTwoNumbers2(l1, l2));
		System.out.println();
		
		l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);
		
		l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		
		a.printResult(a.addTwoNumbers(l1, l2));
		System.out.println();
		a.printResult(a.addTwoNumbers2(l1, l2));
		System.out.println();
		
	}
	
	private void printResult(ListNode l) {
		
		while(l != null) {
			
			System.out.println(l.val);
			
			l = l.next;
			
		}
		
	}
	
}