/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6


https://leetcode.com/problems/maximum-product-of-three-numbers/
*/


class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int b = nums[0] * nums[1] * nums[nums.length-1];
        return a > b ? a : b;
    }
}