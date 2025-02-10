package Strings;

//leetcode : 58

//Time Complexity: O(n)
//Space Complexity: O(n) (due to the array created by split(" "))

public class length_of_lastWord_Bruteforce {
	
	public int lengthOfLastWord(String s) {
		String word1 = s.trim();
		String[] arr = word1.split(" ");
		String lastWord = arr[arr.length-1];
		return lastWord.length();
	}
	
	public static void main(String[] args) {
		length_of_lastWord_Bruteforce ls = new length_of_lastWord_Bruteforce();
		//System.out.println(ls.lengthOfLastWord("Hello World"));
		
		//System.out.println(ls.lengthOfLastWord("   fly me   to   the moon  "));
		
		System.out.println(ls.lengthOfLastWord("luffy is still joyboy"));
	}
	

}
