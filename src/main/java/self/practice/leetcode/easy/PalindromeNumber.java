package self.practice.leetcode.easy;

public class PalindromeNumber {
	
	public boolean isPalindrome5(int x) {
		
		if(x < 0) return false;
		if(x < 10) return true;
		
		int revert, tmpX;
		
		tmpX = x;
		revert = 0;
		
		while(tmpX>0) {
			
			revert = (revert*10) + tmpX%10;
			tmpX /= 10;
			
		}
		
		return x == revert;
		
	}
	
	public boolean isPalindrome4(int x) {
		
		if(x < 0) return false;
		if(x < 10) return true;
		
		char[] cArr = String.valueOf(x).toCharArray();
		int cLen, lBound;;
		cLen = cArr.length;
		
		char[] tmpCArr = new char[cLen];
		
		lBound = 0;
		
		
		for(int i=cLen-1 ; i>=0 ; i--) {
			
			tmpCArr[lBound++] = cArr[i];
			
		}
		
		return x==Integer.parseInt(new String(tmpCArr));
		
	}

	public boolean isPalindrome3(int x) {
		
		if(x < 0) return false;
		if(x < 10) return true;
		
		String inputStr = String.valueOf(x);
		int lBound, uBound;
		uBound = inputStr.length()-1;
		lBound = 0;
		
		while(lBound < uBound) {
			if(inputStr.charAt(lBound++) != inputStr.charAt(uBound--)) {
				return false;
			}
			
		}
		
		return true;
		
	}

	public boolean isPalindrome2(int x) {
		
		if(x < 0) return false;
		if(x < 10) return true;
		
		char[] cArr = String.valueOf(x).toCharArray();
		int lBound, uBound;
		uBound = cArr.length-1;
		lBound = 0;
		
		while(lBound < uBound) {
			if(cArr[lBound++] != cArr[uBound--]) {
				return false;
			}
			
		}
		
		return true;
		
	}

	public boolean isPalindrome(int x) {
		
		if(x < 0) return false;
		if(x < 10) return true;
		
		char[] cArr = String.valueOf(x).toCharArray();
		int cLen, uBound;
		uBound = cArr.length-1;
		
		cLen = uBound/2+1;
		
		for(int i=0 ; i<cLen ; i++) {
			if(cArr[i] != cArr[uBound--]) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		PalindromeNumber p = new PalindromeNumber();
		System.out.println(p.isPalindrome5(12321));
		
	}
	
}
