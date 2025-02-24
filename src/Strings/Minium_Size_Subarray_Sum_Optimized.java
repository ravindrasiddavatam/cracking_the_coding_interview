package Strings;

//Time Complexity : O(n) Space Complexity: O(1)
public class Minium_Size_Subarray_Sum_Optimized {
	
	  public int minSubArrayLen(int target, int[] nums) {
	        
	        int currentSum =0;
	        int left =0;
	        int minWindow = Integer.MAX_VALUE;

	        for(int right =0;right<nums.length;right++){
	            currentSum+=nums[right];
	            while(currentSum>=target){
	                minWindow = Math.min(minWindow,right- left +1);
	                currentSum-=nums[left];
	                left++;
	            }
	        }

	        return (minWindow==Integer.MAX_VALUE) ? 0 : minWindow;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
