package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Time Complexity : O(n3) :The three nested loops result in O(n³) time complexity.
//Space Complexity: O(n) (for the Set storing unique triplets).
public class ThreeSum_Bruteforce {
	
	 public List<List<Integer>> threeSum(int[] nums) {

	        Set<List<Integer>> result = new HashSet<>();
	        int n = nums.length;

	        for(int i=0;i<n-2;i++){
	            for(int j=i+1;j<n-1;j++){
	                for(int k=j+1;k<n;k++){
	                    if(nums[i]+nums[j]+nums[k]==0){
	                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
	                        Collections.sort(list);

	                        result.add(list);
	                    }
	                }
	            }
	        }
	        return new ArrayList<>(result);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeSum_Bruteforce th = new ThreeSum_Bruteforce();
		System.out.println(th.threeSum(new int[] {-1,0,1,2,-1,-4}));

	}

}
