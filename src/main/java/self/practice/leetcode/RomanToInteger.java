package self.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public int romanToInt2(String s) {
		
		int sLenght, result;
		sLenght = s.length();
		result = 0;
		
		char currChar, nextChar;
		
		for(int i=0 ; i<sLenght ; i++) {
			
			currChar = s.charAt(i);
			nextChar = i<sLenght-1?s.charAt(i+1):'\u0000';
			
			switch(currChar) {
				case 'I' : 
					if(nextChar == 'V') {
						result += 4;
						i++;
					}else if(nextChar == 'X') {
						result += 9;
						i++;
					}else {
						result += 1;
					}
					break;
				case 'V' :
					result += 5;
					break;
				case 'X' : 
					if(nextChar == 'L') {
						result += 40;
						i++;
					}else if(nextChar == 'C') {
						result += 90;
						i++;
					}else {
						result += 10;
					}
					break;
				case 'L' : 
					result += 50;
					break;
				case 'C' : 
					if(nextChar == 'D') {
						result += 400;
						i++;
					}else if(nextChar == 'M') {
						result += 900;
						i++;
					}else {
						result += 100;
					}
					break;
				case 'D' : 
					result += 500;
					break;
				case 'M' : 
					result += 1000;
					break;
			}
			
		}
		
		return result;
		
	}
	
	public int romanToInt(String s) {
		
		Map<String, Integer> rTIMap = new HashMap<String, Integer>();
		rTIMap.put("I", 1);
		rTIMap.put("IV", 4);
		rTIMap.put("V", 5);
		rTIMap.put("IX", 9);
		rTIMap.put("X", 10);
		rTIMap.put("XL", 40);
		rTIMap.put("L", 50);
		rTIMap.put("XC", 90);
		rTIMap.put("C", 100);
		rTIMap.put("CD", 400);
		rTIMap.put("D", 500);
		rTIMap.put("CM", 900);
		rTIMap.put("M", 1000);
		
		String procStr;
		Integer procInt;
		
		int result = 0;
		int twoCharPos;
		
		int sLength = s.length();
		for(int idx=0 ; idx<sLength ; idx++) {
			
			twoCharPos = idx+2;
			procStr = s.substring(idx, twoCharPos>sLength?idx:twoCharPos);
			procInt = rTIMap.get(procStr);
			if(procInt == null) {
				
				result += rTIMap.get(s.substring(idx, idx+1));
				
			}else {
				
				result += procInt;
				idx++;
				
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		RomanToInteger r = new RomanToInteger();
		
		System.out.println("1:" + r.romanToInt2("III"));
		System.out.println("2:" + r.romanToInt2("LVIII"));
		System.out.println("3:" + r.romanToInt2("MCMXCIV"));
		System.out.println("4:" + r.romanToInt2("MMXXI"));
		
	}
	
}
