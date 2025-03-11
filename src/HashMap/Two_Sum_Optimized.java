package HashMap;

import java.util.HashMap;
import java.util.Map;

//Time Complexity : O(n) 
// Space Complexity : O(n)

public class Two_Sum_Optimized {
	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {

	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            map.put(nums[i], i);
	        }
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];

	            if (map.containsKey(complement) &&
	                    map.get(complement) != i) {
	                return new int[] { i, map.get(complement) };
	            }
	        }

	        return new int[] {};
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
