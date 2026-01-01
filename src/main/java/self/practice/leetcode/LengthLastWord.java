package self.practice.leetcode;

public class LengthLastWord {
	
	public int lengthOfLastWord2(String s) {
		
		s = s.trim();
		
		return (s.length()-1)-s.lastIndexOf(" ");
		
	}
	
	public int lengthOfLastWord(String s) {
		
		String[] tmpArr = s.split(" ");
		
		return tmpArr[tmpArr.length-1].length();
		
	}
	
	public static void main(String[] args) {
		
		LengthLastWord l = new LengthLastWord();
		
		String tc1, tc2, tc3;
		tc1 = "Hello World";
		tc2 = "   fly me   to   the moon  ";
		tc3 = "luffy is still joyboy";
		
		System.out.println(l.lengthOfLastWord(tc1));
		System.out.println(l.lengthOfLastWord(tc2));
		System.out.println(l.lengthOfLastWord(tc3));
		System.out.println();
		
		System.out.println(l.lengthOfLastWord2(tc1));
		System.out.println(l.lengthOfLastWord2(tc2));
		System.out.println(l.lengthOfLastWord2(tc3));
		
	}

}
