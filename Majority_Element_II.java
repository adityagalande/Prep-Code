/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.


Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]


https://leetcode.com/problems/majority-element-ii/
*/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        if(nums.length == 0 || nums == null) return new ArrayList<Integer>();
        
        ArrayList<Integer> al = new ArrayList<>();
        int num1=nums[0], num2=nums[0], count1=0, count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }else if(count1 == 0){
                num1=nums[i];
                count1++;
            }else if(count2 == 0){
                num2=nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }
        }
        
        if(count1 > nums.length/3){
            al.add(num1);
        }
        if(count2 > nums.length/3){
            al.add(num2);
        }
        return al;
    }
}