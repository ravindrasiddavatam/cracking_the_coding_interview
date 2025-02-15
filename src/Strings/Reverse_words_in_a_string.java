package Strings;

//Time Complexity : O(n)
//Space Complexity : O(n)
public class Reverse_words_in_a_string {
	
	 public String reverseWords(String s) {

	        String trimmed = s.trim();

	        String[] words = trimmed.split("\\s+");

	        int left = 0; int right = words.length - 1;

	        while(left<right){
	            String temp = words[left];
	            words[left] = words[right];
	            words[right] = temp;
	            left++;
	            right--;
	        }

	        return String.join(" ", words);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_words_in_a_string rs = new Reverse_words_in_a_string();
		//String s = "the sky is blue";
		//String s = "  hello world  ";
		String s = "a good   example";
		System.out.println(rs.reverseWords(s));
	}

}
