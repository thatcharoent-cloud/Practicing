package self.practice.leetcode.easy;

public class SqrtX {
	
	public int mySqrt2(int x) {
		return (int)Math.sqrt(x);
	}
	
	public int mySqrt(int x) {
		return (int)Math.pow(8, 0.5);
	}
	
	public static void main(String[] args){
		
		SqrtX s = new SqrtX();
		
		System.out.println(s.mySqrt(4));
		System.out.println(s.mySqrt(8));
		
		System.out.println(s.mySqrt2(4));
		System.out.println(s.mySqrt2(8));
		
	}
	
}
