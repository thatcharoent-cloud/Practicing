package self.practice.leetcode;

public class FindFirstOccurInString {
	
	public int strStr(String haystack, String needle) {
		
		return haystack.indexOf(needle);
		
	}
	
	public static void main(String[] args) {
		
		FindFirstOccurInString f = new FindFirstOccurInString();
		
		System.out.println(f.strStr("sadbutsad", "sad"));
		System.out.println(f.strStr("leetcode", "leeto"));
		
	}
	
}
