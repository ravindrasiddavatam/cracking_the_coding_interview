package Strings;

import java.util.HashSet;
import java.util.Set;

//Time Complexity : O(n) Space Complexity: O(1)
public class Longest_Substring_Without_Repeating_Characters_optimized {
	
public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        //"abcabcbb"
        for(int right=0;right<s.length();right++){
           
           while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
           }
            set.add(s.charAt(right));

            maxLength = Math.max(right - left + 1,maxLength);
           
        }

        return maxLength;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
