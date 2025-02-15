package Strings;

//Time Complexity: O(n * m)
//Space Complexity: O(1)
public class Longest_common_prefix {
	
	 public String longestCommonPrefix(String[] strs) {
	        
	        if(strs.length == 0 || strs == null){
	            return "";
	        }
	            int n = strs.length;
	            String first = strs[0];
	            for(int i =0;i<first.length();i++){
	                char c = first.charAt(i);
	                for(int j=1;j<n;j++){
	                    if(i>=strs[j].length()||strs[j].charAt(i)!=c){
	                       return  first.substring(0,i);
	                    }
	                }
	            }
	            return first;
	 }

	public static void main(String[] args) {
		
		
		Longest_common_prefix lcp = new Longest_common_prefix();
	//	String[] strs = {"flower","flow","flight"};
		String[] strs = {"dog","racecar","car"};
		System.out.println(lcp.longestCommonPrefix(strs));

	}

}
