package self.practice.leetcode.easy;

public class AddBinary {
	
	public String addBinary3(String a, String b) {
		
		int aLen, bLen, sum;
		aLen = a.length()-1;
		bLen = b.length()-1;
		
		boolean shouldAdd = false;
		
		StringBuilder sb = new StringBuilder();
		
		while(aLen>=0 || bLen>=0) {
			
			sum = (aLen>=0?a.charAt(aLen)-'0':0) + 
					(bLen>=0?b.charAt(bLen)-'0':0);
			
			switch(sum) {
			
				case 2:
					
					if(shouldAdd) {
						sb.insert(0, '1');
					}else {
						sb.insert(0, '0');
						shouldAdd = true;
					}
					
					
					break;
					
				case 1:
					
					if(shouldAdd) {
						sb.insert(0, '0');
					}else {
						sb.insert(0, '1');
					}
					
					break;
					
				case 0:
					
					if(shouldAdd) {
						sb.insert(0, '1');
						shouldAdd = false;
					}else {
						sb.insert(0, '0');
					}
					
					break;
					
			}
			
			aLen--;
			bLen--;
			
		}
		
		if(shouldAdd) {
			
			sb.insert(0, '1');
			
		}
		
		return sb.toString();
		
	}
	
	public String addBinary2(String a, String b) {
		
		int aLen, bLen;
		aLen = a.length()-1;
		bLen = b.length()-1;
		
		char aChar, bChar;
		boolean shouldAdd = false;
		
		StringBuilder sb = new StringBuilder();
		
		while(aLen>=0 || bLen>=0) {
			
			aChar = aLen>=0?a.charAt(aLen):'\u0000';
			bChar = bLen>=0?b.charAt(bLen):'\u0000';
			
			if('1'==aChar && '1'==bChar && shouldAdd) {
				
				sb.insert(0, '1');
				
			}else if('1'==aChar && '1'==bChar) {
				
				sb.insert(0, '0');
				shouldAdd = true;
				
			}else if('0'==aChar && '0'==bChar && shouldAdd) {
				
				sb.insert(0, '1');
				shouldAdd = false;
				
			}else if('0'==aChar && '0'==bChar) {
				
				sb.insert(0, '0');
				
			}else if(('1'==aChar || '1'==bChar) && shouldAdd) {
				
				sb.insert(0, '0');
				shouldAdd = true;
				
			}else if('1'==aChar || '1'==bChar) {
				
				sb.insert(0, '1');
				
			}else {
				
				if(shouldAdd) {
					
					sb.insert(0, '1');
					shouldAdd = false;
					
				}else {
					sb.insert(0, '0');
				}
				
			}
			
			aLen--;
			bLen--;
			
		}
		
		if(shouldAdd) {
			sb.insert(0, '1');
		}
		
		return sb.toString();
		
	}
	
	public String addBinary(String a, String b) {
		
		int binA, binB;
		
		binA = Integer.parseInt(a, 2);
		binB = Integer.parseInt(b, 2);
		
		return Integer.toBinaryString(binA + binB);
		
	}
	
	public static void main(String[] args) {
		
		AddBinary a = new AddBinary();
		
//		System.out.println(a.addBinary("11", "1"));
//		System.out.println(a.addBinary("1010", "1011"));
		
//		System.out.println(a.addBinary2("11", "1"));
//		System.out.println(a.addBinary2("1010", "1011"));
//		System.out.println(a.addBinary2("101111", "10"));
//		System.out.println();
		
		System.out.println(a.addBinary3("11", "1"));
		System.out.println(a.addBinary3("1010", "1011"));
		System.out.println(a.addBinary3("101111", "10"));
		
	}
	
}
