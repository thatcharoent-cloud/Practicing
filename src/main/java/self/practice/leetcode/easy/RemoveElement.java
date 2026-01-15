package self.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveElement {
	
	public int removeElement2(int[] nums, int val) {
		
		int pos = 0;
		for(int n : nums) {
			
			if(n != val) {
				
				nums[pos++] = n;
				
			}
			
		}
		
		return pos;
		
	}
	
	public int removeElement(int[] nums, int val) {
		
		int numsLen = nums.length;
		
		List<Integer> tmpList = new ArrayList<Integer>(numsLen);
		
		for(int idx=0 ; idx<numsLen ; idx++) {
			
			if(nums[idx] != val) {
				tmpList.add(nums[idx]);
			}
			
		}
		
		Collections.sort(tmpList);
		
		numsLen = 0;
		for(int idx : tmpList) {
			nums[numsLen++] = idx;
		}
		
		return tmpList.size();
		
	}
	
	public static void main(String[] args) {
		
		RemoveElement r = new RemoveElement();
		
		System.out.println(r.removeElement(new int[] {3, 2, 2, 3}, 3));
		System.out.println(r.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
		System.out.println();
		
		System.out.println(r.removeElement2(new int[] {3, 2, 2, 3}, 3));
		System.out.println(r.removeElement2(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
		
	}
	
}
