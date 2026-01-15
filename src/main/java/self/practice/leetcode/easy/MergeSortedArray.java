package self.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
	
	public void merge3(int[] nums1, int m, int[] nums2, int n) {
		
		if(n == 0) {
			return ;
		}
		
		int tmpArrLen, nums1Idx, nums2Idx, tmpArrIdx;
		
		tmpArrLen = m+n;
		int[] tmpArr = new int[tmpArrLen];
		
		nums1Idx = nums2Idx= tmpArrIdx = 0;
		
		while(nums1Idx<m) {
			
			while(nums2Idx < n) {
				
				if(nums2[nums2Idx] > nums1[nums1Idx]) {
					break;
				}
				
				tmpArr[tmpArrIdx++] = nums2[nums2Idx++];
				
			}
			
			tmpArr[tmpArrIdx++] = nums1[nums1Idx++];
			
		}
		
		if(nums2Idx <= n) {
			
			while(nums2Idx < n){
				
				tmpArr[tmpArrIdx++] = nums2[nums2Idx++];
				
			}
			
		}
		
		for(int i=0 ; i<tmpArrLen ; i++) { nums1[i] = tmpArr[i]; }
		
	}
	
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		
		if(n == 0) {
			return ;
		}
		
		int nums1Len, nums2Bound, idx;
		idx = 0;
		nums1Len = nums1.length;
		nums2Bound = nums2.length-1;
		
		for(int i=0 ; i<nums1Len ; i++) {
			
			if(nums1[i]==0 && idx<=nums2Bound) {
				nums1[i] = nums2[idx++];
			}
			
		}
		
		Arrays.sort(nums1);
		
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		if(n == 0) {
			return ;
		}
		
		List<Integer> intList = new ArrayList<Integer>(n + m);
		for(int num : nums1) { intList.add(num); }
		for(int num : nums2) { intList.add(num); }
		
		int idx = 0;
		
		for(int num : intList) {
			
			if(num == 0) {
				continue;
			}
			
			nums1[idx++] = num;
			
		}
		
		Arrays.sort(nums1);
		
	}
	
	public static void main(String[] args) {
		
		MergeSortedArray m = new MergeSortedArray();
		
		m.merge(new int[] {1, 2, 3, 0, 0, 0},  3, new int[] {2, 5, 6}, 3);
		m.merge(new int[] {1}, 1, new int[] {}, 0);
		m.merge(new int[] {0}, 0, new int[] {1}, 1);
		
		m.merge2(new int[] {1, 2, 3, 0, 0, 0},  3, new int[] {2, 5, 6}, 3);
		m.merge2(new int[] {1}, 1, new int[] {}, 0);
		m.merge2(new int[] {0}, 0, new int[] {1}, 1);
		
		m.merge3(new int[] {1, 2, 3, 0, 0, 0},  3, new int[] {2, 5, 6}, 3);
		m.merge3(new int[] {1}, 1, new int[] {}, 0);
		m.merge3(new int[] {0}, 0, new int[] {1}, 1);
		
	}
	
}
