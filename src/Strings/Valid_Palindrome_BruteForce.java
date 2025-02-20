package Strings;

//Time Complexity : O(n) // Space Complexity : O(n)
public class Valid_Palindrome_BruteForce {
	
	public boolean isPalindrome(String s) {
        if(s==null ){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s1.length();i++){
           char c = s1.charAt(i);
           if((c>='a'&&c<='z') || (c>='0'&&c<='9')){
            sb.append(c);
           }
        }
        StringBuilder reversed = new StringBuilder(sb);
        reversed.reverse();

        return sb.toString().equals(reversed.toString());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valid_Palindrome_BruteForce vp = new Valid_Palindrome_BruteForce();
		//System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(vp.isPalindrome("race a car"));
	}

}
