package Strings;


// Time Complexity: O(n)
// Space Complexity: O(1) (no extra array storage)

public class Length_of_lastword_Optimized_approach {
	
	public int lengthOfLastWord(String s) {
		int length  = 0;
		int i = s.length() - 1;
		
		while(i>0 && s.charAt(i) == ' ') {
			i--;
		}
		while(i>0 && s.charAt(i) != ' ') {
			length++;
			i--;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Length_of_lastword_Optimized_approach ls = new Length_of_lastword_Optimized_approach();
		System.out.println(ls.lengthOfLastWord("Hello World"));
		
		//System.out.println(ls.lengthOfLastWord("   fly me   to   the moon  "));
		
		//System.out.println(ls.lengthOfLastWord("luffy is still joyboy"));
	}

}
