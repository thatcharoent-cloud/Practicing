package self.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		int numsLength, expectValue, tmpIdx;
		numsLength = nums.length;
		
		Map<Integer, Integer> remainIdxMap = new HashMap<Integer, Integer>(numsLength);
		
		Integer result = null;
		
		for(int idx=1 ; idx<numsLength ; idx++) {
			
			tmpIdx = idx-1;
			
			expectValue = target-nums[tmpIdx];
			if(nums[idx]==expectValue) {
				return new int[] {(tmpIdx), idx};
			}
			
			result = remainIdxMap.get(nums[idx]);
			if(result != null) {
				return new int[] {result, idx};
			}
			
			remainIdxMap.put(expectValue, tmpIdx);
			
		}
		
		return new int[] {-1, -1};
		
	}
	
}
