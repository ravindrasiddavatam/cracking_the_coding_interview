package Strings;

//time O(n2) space O(1)
public class isUniqueWithoutDS_Brute_force {
	
	public boolean isUniqueWithoutDS(String str) {
		
		for(int i=0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			
			for(int j = i+1;j<str.length();j++) {
				if(currentChar == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isUniqueWithoutDS_Brute_force a = new isUniqueWithoutDS_Brute_force();
		System.out.println(a.isUniqueWithoutDS("abcdefgh{[><?|AA"));
		
	}

}
