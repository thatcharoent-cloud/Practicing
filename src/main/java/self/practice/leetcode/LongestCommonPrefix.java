package self.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix4(String[] strs) {
		
		String commonPrefix;
		commonPrefix = strs[0];
		
		int strsArrLen;
		strsArrLen = strs.length;
		
		for(int idx=1 ; idx<strsArrLen ; idx++) {
			
			while(!strs[idx].startsWith(commonPrefix)) {
				
				commonPrefix = commonPrefix.substring(0, commonPrefix.length()-1);
				
			}
			
		}
		
		return commonPrefix;
		
	}
	
	public String longestCommonPrefix3(String[] strs) {
		
		int strsArrLen, fElmLen, fPos;
		
		fPos = 0;
		strsArrLen = strs.length;
		
		fElmLen = strs[0]==null?0:strs[0].length();
		
		while(fPos<fElmLen) {
			
			for(int idx=1 ; idx<strsArrLen ; idx++) {
				
				try {
					if(strs[0].charAt(fPos) != strs[idx].charAt(fPos)) {
						return strs[0].substring(0, fPos);
					}
				}catch(Exception ex) {
					return strs[0].substring(0, fPos);
				}
				
			}
			
			fPos++;
			
		}
		
		return fPos==0?"":strs[0].substring(0, fPos);
		
	}
	
	public String longestCommonPrefix2(String[] strs) {
		
		char currChar, prevChar;
		currChar = prevChar = '\u0000';
		
		int strsArrLen, pos;
		strsArrLen = strs.length;
		pos = 0;
		
		while(true) {
			
			for(int idx=0 ; idx<strsArrLen ; idx++) {
				
				try {
					
					currChar = strs[idx].charAt(pos);
					
					if(idx != 0) {
						
						if(prevChar != currChar) { return strs[idx].substring(0, pos); }
						
					}
					
				}catch(Exception ex) {
					try{
						return strs[idx].substring(0, pos);
					}catch(Exception ex2) {
						return "";
					}
				}
				
				prevChar = currChar;
				
			}
			
			pos++;
			
		}
		
		
	}
	
	public String longestCommonPrefix(String[] strs) {
		
		String maxCommonPrefix, procStr;
		maxCommonPrefix = procStr = "";
		
		int currPos, strsArrLen;
		currPos = 0;
		
		strsArrLen = strs.length;
		if(strsArrLen <= 1) { return strs[0]; }
		
		boolean isSamePrefix = true;
		
		Set<Character> chkSet = new HashSet<Character>(0);
		
		while(isSamePrefix) {
			
			for(int idx=0 ; idx<strsArrLen ; idx++) {
				
				procStr = strs[idx];
				if(procStr.isEmpty()) { return maxCommonPrefix;}
				if(procStr.length()<=currPos) { return maxCommonPrefix; }
				
				chkSet.add(procStr.charAt(currPos));
				
			}
			
			if(chkSet.size() > 1) { return maxCommonPrefix; }
			
			maxCommonPrefix += strs[0].charAt(currPos);
			
			chkSet.clear();
			currPos++;
			
		}
		
		return maxCommonPrefix;
		
	}
	
	public static void main(String[] args) {
		
		LongestCommonPrefix lCP = new LongestCommonPrefix();
		
//		System.out.println("1=" + lCP.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
//		System.out.println("2=" + lCP.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
//		System.out.println("3=" + lCP.longestCommonPrefix(new String[] {"apple", "apply", "apricot"}));
//		System.out.println("4=" + lCP.longestCommonPrefix(new String[] {"tested", "testing", "tester"}));
//		System.out.println("5=" + lCP.longestCommonPrefix(new String[] {"", ""}));
//		System.out.println("6=" + lCP.longestCommonPrefix(new String[] {"ab", "a"}));
//		System.out.println("7=" + lCP.longestCommonPrefix(new String[] {null}));
//		
//		System.out.println("1=" + lCP.longestCommonPrefix2(new String[] {"flower", "flow", "flight"}));
//		System.out.println("2=" + lCP.longestCommonPrefix2(new String[] {"dog", "racecar", "car"}));
//		System.out.println("3=" + lCP.longestCommonPrefix2(new String[] {"apple", "apply", "apricot"}));
//		System.out.println("4=" + lCP.longestCommonPrefix2(new String[] {"tested", "testing", "tester"}));
//		System.out.println("5=" + lCP.longestCommonPrefix2(new String[] {"", ""}));
//		System.out.println("6=" + lCP.longestCommonPrefix2(new String[] {"ab", "a"}));
//		System.out.println("7=" + lCP.longestCommonPrefix2(new String[] {null}));
		
//		System.out.println("1=" + lCP.longestCommonPrefix3(new String[] {"flower", "flow", "flight"}));
//		System.out.println("2=" + lCP.longestCommonPrefix3(new String[] {"dog", "racecar", "car"}));
//		System.out.println("3=" + lCP.longestCommonPrefix3(new String[] {"apple", "apply", "apricot"}));
//		System.out.println("4=" + lCP.longestCommonPrefix3(new String[] {"tested", "testing", "tester"}));
//		System.out.println("5=" + lCP.longestCommonPrefix3(new String[] {"", ""}));
//		System.out.println("6=" + lCP.longestCommonPrefix3(new String[] {"ab", "a"}));
//		System.out.println("7=" + lCP.longestCommonPrefix3(new String[] {null}));
		
		System.out.println("1=" + lCP.longestCommonPrefix4(new String[] {"flower", "flow", "flight"}));
		System.out.println("2=" + lCP.longestCommonPrefix4(new String[] {"dog", "racecar", "car"}));
		System.out.println("3=" + lCP.longestCommonPrefix4(new String[] {"apple", "apply", "apricot"}));
		System.out.println("4=" + lCP.longestCommonPrefix4(new String[] {"tested", "testing", "tester"}));
		System.out.println("5=" + lCP.longestCommonPrefix4(new String[] {"", ""}));
		System.out.println("6=" + lCP.longestCommonPrefix4(new String[] {"ab", "a"}));
		System.out.println("7=" + lCP.longestCommonPrefix4(new String[] {null}));
		
		
	}
	
}
