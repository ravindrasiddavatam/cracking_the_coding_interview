package HashMap;

import java.util.HashMap;
import java.util.Map;

//Time Complexity: O(n) Space complexity: O(1)
public class Isomorphic_Strings_Optimized {
	
	 public boolean isIsomorphic(String s, String t) {
	        
	        Map<Character,Integer> smap = new HashMap<>();
	        Map<Character,Integer> tmap = new HashMap<>();

	        for(int i=0;i<s.length();i++){
	            if(!smap.containsKey(s.charAt(i))){
	                smap.put(s.charAt(i),i);
	            }
	            if(!tmap.containsKey(t.charAt(i))){
	                tmap.put(t.charAt(i),i);
	            }

	            if(smap.get(s.charAt(i))!=tmap.get(t.charAt(i))){
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 
	 
//	 s = egg  t = add
//
//			 !false
//			 e->0
//			 g->1
//			 !true
//
//			 a->0
//			 d->1
//			 !true
//
//			 0==0
//			 1==1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
