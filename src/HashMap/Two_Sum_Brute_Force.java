package HashMap;
//Time Complexity : O(n2)
//Space Complexity : O(1)
public class Two_Sum_Brute_Force {
	
	 public int[] twoSum(int[] nums, int target) {
	        
	        int[] result = new int[2];

	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    result[0]=i;
	                    result[1]=j;
	                }
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
