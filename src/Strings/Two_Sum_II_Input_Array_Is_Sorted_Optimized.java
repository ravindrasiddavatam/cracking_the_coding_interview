package Strings;

import java.util.Arrays;

//Time Complexity : O(n) , Space Complexity : O(1) // as it is fixed size array:
public class Two_Sum_II_Input_Array_Is_Sorted_Optimized {
	
	public int[] twoSum(int[] numbers, int target) {
	    // Edge case: If the array is empty or has less than 2 elements, return an empty array
	    if (numbers == null || numbers.length < 2) {
	        return new int[0];
	    }

	    int left = 0; // Pointer to the start of the array
	    int right = numbers.length - 1; // Pointer to the end of the array

	    // Use two-pointer technique to find the pair
	    while (left < right) {
	        int sum = numbers[left] + numbers[right];
	        if (sum > target) {
	            right--; // Move the right pointer to the left to reduce the sum
	        } else if (sum < target) {
	            left++; // Move the left pointer to the right to increase the sum
	        } else {
	            // Return the indices (1-based) of the two numbers that add up to the target
	            return new int[]{left + 1, right + 1};
	        }
	    }

	    // If no solution is found, return an empty array
	    return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_Sum_II_Input_Array_Is_Sorted_Optimized ts = new Two_Sum_II_Input_Array_Is_Sorted_Optimized();
		System.out.println(Arrays.toString(ts.twoSum(new int[] {2,7,11,15}, 9)));
		
	}

}
