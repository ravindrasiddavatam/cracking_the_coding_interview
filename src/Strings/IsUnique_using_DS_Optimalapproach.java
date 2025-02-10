package Strings;


//implement an algorithm to determine if a string has all unique characters. 
//what if you cannot use additional data structures?

//Time O(n) , space O(1)
public class IsUnique_using_DS_Optimalapproach {
	
	public boolean isUniqueCharacters(String str) {
		
		if(str.length() > 256) {
			return false;
		}
		
		boolean[] seen = new boolean[256];
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i);
			if(seen[val] == true) {
				return false;
			}
			seen[val] = true;
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsUnique_using_DS_Optimalapproach a = new IsUnique_using_DS_Optimalapproach();
		System.out.println(a.isUniqueCharacters("abcdefgh{[><?|"));
	}

}
