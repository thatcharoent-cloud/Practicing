package self.practice.leetcode;

public class ClimbingStairs {
	
	public int climbStairs3(int n) {
		
		if(n < 3) {
			return n;
		}
		
		int[] procArr = new int[3];
		procArr[0] = 1;
		procArr[1] = 2;
		procArr[2] = procArr[0] + procArr[1];
		
		int idx = 3;
		
		while(idx < n) {
			
			procArr[0] = procArr[1];
			procArr[1] = procArr[2];
			procArr[2] = procArr[0] + procArr[1];
			
			idx++;
			
		}
		
		return procArr[2];
		
	}
	
	public int climbStairs2(int n) {
		
		if(n < 3) { return n;}
		
		int idx, prev1, prev2, result;
		
		result = 0;
		
		idx = 3;
		
		prev1 = 2;
		prev2 = 1;
		result = prev1 + prev2;
		
		while(idx<n) {
			
			prev2 = prev1;
			prev1 = result;
			result = prev2 + prev1;
			
			idx++;
			
		}
		
		return result;
		
	}
	
	public int climbStairs(int n) {
		
		if(n == 2) {
			return 2;
		}
		
		if(n==1) {
			return 1;
		}
		
		return climbStairs(n-1) + climbStairs(n-2);
		
	}
	
	//1, 2, 3, 4, 5,  6,  7
	//1, 2, 3, 5, 8, 13, 21
	
	public static void main(String[] args) {
		
		ClimbingStairs c = new ClimbingStairs();
		
//		System.out.println(c.climbStairs(2));
//		System.out.println(c.climbStairs(3));
//		System.out.println(c.climbStairs(4));
//		System.out.println(c.climbStairs(45));
//		System.out.println();
		
		System.out.println(c.climbStairs2(2));
		System.out.println(c.climbStairs2(3));
		System.out.println(c.climbStairs2(4));
		System.out.println(c.climbStairs2(5));
		System.out.println(c.climbStairs2(6));
		System.out.println(c.climbStairs2(45));
		System.out.println();
		
		System.out.println(c.climbStairs3(2));
		System.out.println(c.climbStairs3(3));
		System.out.println(c.climbStairs3(4));
		System.out.println(c.climbStairs3(5));
		System.out.println(c.climbStairs3(6));
		System.out.println(c.climbStairs3(45));
		
	}
	
}
