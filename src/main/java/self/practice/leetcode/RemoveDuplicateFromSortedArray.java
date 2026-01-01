package self.practice.leetcode;

import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicateFromSortedArray {
	
	public int removeDuplicates2(int[] nums) {
		
		int numsLen, numsIdx, resultIdx, maxNum;
		numsLen = nums.length;
		maxNum = nums[numsLen-1];
		
		numsIdx = 1;
		resultIdx = 0;
		
		while(numsIdx < numsLen) {
			
			if(nums[resultIdx] != nums[numsIdx]) {
				nums[++resultIdx] = nums[numsIdx];
				
				// comment this condition will improve performance???
				if(maxNum == nums[resultIdx]) {
					return resultIdx+1;
				}
				
			}
			
			numsIdx++;
			
		}
		
		return resultIdx+1;
		
	}
	
	public int removeDuplicates(int[] nums) {
		
		SortedSet<Integer> tmpSet = new TreeSet<Integer>();
		for(int i :nums) {
			tmpSet.add(i);
		}
		
		int idx = 0;
		for(int i: tmpSet) {
			nums[idx++] = i;
		}
		
		return tmpSet.size();
		
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicateFromSortedArray r = new RemoveDuplicateFromSortedArray();
		System.out.println(r.removeDuplicates(new int[] {1, 1, 2}));
		System.out.println(r.removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
		System.out.println();
		
		System.out.println(r.removeDuplicates2(new int[] {1, 1, 2}));
		System.out.println(r.removeDuplicates2(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
		
	}
	
}
