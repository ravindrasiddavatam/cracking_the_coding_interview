package Strings;

//Time Complexity : O(n) //Space Complexity : O(1)
public class Valid_Palindrome_Optimized {
	
	  public boolean isPalindrome(String s) {

	        int left =0;
	        int right = s.length()-1;

	        while(left < right){
	            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
	                left++;
	            }

	            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
	                right--;
	            }

	            if(Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right))){
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Valid_Palindrome_Optimized vp = new Valid_Palindrome_Optimized();
		System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));

	}

}
