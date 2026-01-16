package self.practice.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
	
	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		
		int nums1Len, nums2Len, tmpLen, nums1Counter, nums2Counter, tmpCounter, median;
		nums1Len = nums1.length;
		nums2Len = nums2.length;
		
		nums1Counter = nums2Counter = tmpCounter = 0;
		
		tmpLen = nums1Len + nums2Len;
		int[] tmpArr = new int[tmpLen];
		
		while(nums1Counter<nums1Len || nums2Counter<nums2Len) {
			
			if(nums1Counter<nums1Len && nums2Counter<nums2Len) {
				
				if(nums1[nums1Counter]<=nums2[nums2Counter]) {
					
					tmpArr[tmpCounter++] = nums1[nums1Counter++];
					
				}else {
					tmpArr[tmpCounter++] = nums2[nums2Counter++];
				}
				
			}else if(nums1Counter<nums1Len) {
				
				tmpArr[tmpCounter++] = nums1[nums1Counter++];
				
			}else {
				tmpArr[tmpCounter++] = nums2[nums2Counter++];
			}
			
		}
		
		median = tmpLen/2;
		
		if(tmpLen%2 != 0) { return tmpArr[median]; }
		else { return (tmpArr[median-1]+tmpArr[median])/2.0; }
		
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		List<Integer> l = new ArrayList<Integer>(0);
		
		for(int num : nums1) { l.add(num); }
		for(int num : nums2) { l.add(num); }
		
		Collections.sort(l);
		
		int lSize, median;
		lSize = l.size();
		
		if(lSize%2 != 0) {
			
			return l.get(lSize/2);
			
		}
		
		median = lSize/2;
		
		return (l.get(median-1)+l.get(median))/2.0;
		
	}
	
	public static void main(String[] args) {
		
		MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
		
//		System.out.println(m.findMedianSortedArrays(
//				new int[] {1, 3}, 
//				new int[] {2}
//			));
//		
//		System.out.println();
//		
//		System.out.println(m.findMedianSortedArrays(
//				new int[] {1, 2}, 
//				new int[] {3, 4}
//			));
		
		System.out.println(m.findMedianSortedArrays2(
				new int[] {1, 3}, 
				new int[] {2}
			));
		
		System.out.println();
		
		System.out.println(m.findMedianSortedArrays2(
				new int[] {1, 2}, 
				new int[] {3, 4}
			));
		
	}
	
}
