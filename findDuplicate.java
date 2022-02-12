/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3


https://leetcode.com/problems/find-the-duplicate-number/
*/


class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            int abs_value = Math.abs(nums[i]);
            if(nums[abs_value - 1] > 0){
                nums[abs_value - 1] = - nums[abs_value - 1];
            }else{
             return abs_value;   
            }
        }
        return 0;        
    }
}