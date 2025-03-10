package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Complexity	Worst-Case Complexity
//Time	        O(n * m log m)
//Space	        O(n * m)
public class Group_Anagrams {
	
	  public List<List<String>> groupAnagrams(String[] strs) {
	        Map<String, List<String>> map = new HashMap<>();
	        
	        for (String word : strs) {
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String sortedWord = new String(chars);
	            
	            if (!map.containsKey(sortedWord)) {
	                map.put(sortedWord, new ArrayList<>());
	            }
	            
	            map.get(sortedWord).add(word);
	        }
	        
	        return new ArrayList<>(map.values());
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
