package self.practice.leetcode;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid4(String s) {
		
		int sLen, currPos;
		sLen = s.length();
		currPos = 0;
		
		Stack<Character> charStack = new Stack<Character>();
		char currChar, tmpChar;
		currChar = tmpChar = '\u0000';
		
		while(currPos<sLen) {
			
			currChar = s.charAt(currPos);
			if('('==currChar || 
					'['==currChar || 
					'{'==currChar) {
				
				charStack.push(currChar);
				
			}else {
				
				if(charStack.isEmpty() || (
						currChar==')'&&charStack.pop()!='(' || 
						currChar==']'&&charStack.pop()!='[') || 
						currChar=='}'&&charStack.pop()!='{'){
					return false;
				}
				
			}
			
			currPos++;
			
		}
		
		if(charStack.isEmpty()) {
			return true;
		}
		
		return false;
		
	}
	
	public boolean isValid3(String s) {
		
		int sLen, currPos;
		sLen = s.length();
		currPos = 0;
		
		Stack<Character> charStack = new Stack<Character>();
		char currChar, tmpChar;
		currChar = tmpChar = '\u0000';
		
		while(currPos<sLen) {
			
			currChar = s.charAt(currPos);
			if(')'==currChar || 
					']'==currChar || 
					'}'==currChar) {
				
				try {
					
					tmpChar = charStack.pop();
					switch(currChar) {
						case ')':
							if(tmpChar != '(') { return false; }
							break;
						case ']':
							if(tmpChar != '[') { return false; }
							break;
						case '}':
							if(tmpChar != '{') { return false; }
							break;
					}
					
				}catch(EmptyStackException eSEx) {
					return false;
				}
				
			}else {
				charStack.push(currChar);
			}
			
			currPos++;
			
		}
		
		if(charStack.size() == 0) {return true; }
		
		return false;
		
	}
	
	public boolean isValid2(String s) {
		
		int sLen, currPos;
		sLen = s.length();
		
		currPos = 0;
		
		Stack<Character> charStack = new Stack<Character>();
		char[] cArr = s.toCharArray();
		char currChar, tmpChar;
		currChar = tmpChar = '\u0000';
		
		while(currPos<sLen) {
			
			currChar = cArr[currPos];
			if(')'==currChar || 
					']'==currChar || 
					'}'==currChar) {
				
				tmpChar = charStack.pop();
				switch(currChar) {
					case ')':
						if(tmpChar != '(') {
							return false;
						}
						break;
					case ']':
						if(tmpChar != '[') {
							return false;
						}
						break;
					case '}':
						if(tmpChar != '{') {
							return false;
						}
						break;
				}
				
			}else {
				charStack.push(currChar);
			}
			
			currPos++;
			
		}
		
		if(charStack.size() == 0) {return true; }
		
		return false;
		
	}

	public boolean isValid(String s) {
		
		Set<Character> chkSet = new HashSet<Character>(3);
		chkSet.add(')');chkSet.add(']');chkSet.add('}');
		
		int sLen, currPos;
		sLen = s.length();
		
		currPos = 0;
		
		Stack<Character> charStack = new Stack<Character>();
		char[] cArr = s.toCharArray();
		char currChar, tmpChar;
		currChar = tmpChar = '\u0000';
		
		while(currPos<sLen) {
			
			currChar = cArr[currPos];
			if(chkSet.contains(cArr[currPos])) {
				
				if(!charStack.isEmpty()) {
					
					tmpChar = charStack.pop();
					switch(currChar) {
						case ')':
							if(tmpChar != '(') {
								return false;
							}
							break;
						case ']':
							if(tmpChar != '[') {
								return false;
							}
							break;
						case '}':
							if(tmpChar != '{') {
								return false;
							}
							break;
					}
					
				}else {
					return false;
				}
				
			}else {
				charStack.push(currChar);
			}
			
			currPos++;
			
		}
		
		if(charStack.size() == 0) {return true; }
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		ValidParentheses vP = new ValidParentheses();
		
//		System.out.println("1=" + vP.isValid("()"));
//		System.out.println("2=" + vP.isValid("()[]{}"));
//		System.out.println("3=" + vP.isValid("(]"));
//		System.out.println("4=" + vP.isValid("([])"));
//		System.out.println("5=" + vP.isValid("([)]"));
//		
//		System.out.println("1=" + vP.isValid2("()"));
//		System.out.println("2=" + vP.isValid2("()[]{}"));
//		System.out.println("3=" + vP.isValid2("(]"));
//		System.out.println("4=" + vP.isValid2("([])"));
//		System.out.println("5=" + vP.isValid2("([)]"));
		
//		System.out.println("1=" + vP.isValid3("()"));
//		System.out.println("2=" + vP.isValid3("()[]{}"));
//		System.out.println("3=" + vP.isValid3("(]"));
//		System.out.println("4=" + vP.isValid3("([])"));
//		System.out.println("5=" + vP.isValid3("([)]"));
		
		System.out.println("1=" + vP.isValid4("()"));
		System.out.println("2=" + vP.isValid4("()[]{}"));
		System.out.println("3=" + vP.isValid4("(]"));
		System.out.println("4=" + vP.isValid4("([])"));
		System.out.println("5=" + vP.isValid4("([)]"));
		
	}
	
}
