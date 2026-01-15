package self.practice.leetcode.easy;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		
		int pos = 0;
		
		for(int n : nums) {
			
			if(n >= target) {
				return pos;
			}
			
			pos++;
			
		}
		
		return pos;
		
	}
	
	public static void main(String[] args) {
		
		SearchInsertPosition s = new SearchInsertPosition();
		
		System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 5));
		System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 2));
		System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 7));
		
	}
	
}
