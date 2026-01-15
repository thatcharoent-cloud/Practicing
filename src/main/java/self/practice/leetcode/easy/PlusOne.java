package self.practice.leetcode.easy;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		
		int arrLength, pos;
		arrLength = digits.length;
		
		pos = arrLength-1;
		
		if(digits[pos] != 9) {
			
			digits[pos] += 1;
			
			return digits;
			
		}
		
		while(pos >= 0) {
			
			if(digits[pos] == 9) {
				digits[pos] = 0;
			}else {
				digits[pos] += 1;
				return digits;
			}
			
			pos--;
			
		}
		
		arrLength = arrLength+1;
		
		int[] newArr = new int[arrLength];
		
		newArr[0] = 1;
		for(int idx=1 ; idx<arrLength ; idx++) {
			newArr[idx] = 0;
		}
		
		return newArr;
		
	}
	
	public static void main(String[] args) {
		
		PlusOne p = new PlusOne();
		
		int[] resultArr;
		
		resultArr = p.plusOne(new int[] {1, 2, 3});
		for(int n : resultArr) { System.out.print(n); }
		System.out.println();
		
		resultArr = p.plusOne(new int[] {4, 3, 2, 1});
		for(int n : resultArr) { System.out.print(n); }
		System.out.println();
		
		resultArr = p.plusOne(new int[] {9});
		for(int n : resultArr) { System.out.print(n); }
		System.out.println();
		
		resultArr = p.plusOne(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
		for(int n : resultArr) { System.out.print(n); }
		System.out.println();
		
		resultArr = p.plusOne(new int[] {9, 8, 9, 9});
		for(int n : resultArr) { System.out.print(n); }
		System.out.println();
		
	}
	
}
