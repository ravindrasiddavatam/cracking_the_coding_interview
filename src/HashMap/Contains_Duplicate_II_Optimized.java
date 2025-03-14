package HashMap;

import java.util.HashMap;
import java.util.Map;
//Time Complexity : O(n)
//Space Complexity : O(min(n,k))
public class Contains_Duplicate_II_Optimized {
	
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        
	        Map<Integer,Integer> map = new HashMap<>();

	        for(int i=0;i<nums.length;i++){

	            if(map.containsKey(nums[i])){
	                int lastIndex = map.get(nums[i]);

	                if(i-lastIndex <=k){
	                    return true;
	                }
	            }

	            map.put(nums[i],i);
	        }

	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
