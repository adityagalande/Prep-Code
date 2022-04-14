/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].


https://leetcode.com/problems/find-the-difference-of-two-arrays/
*/


class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<List<Integer>> li = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        for(int num : nums1){
            if(!binarySearch(nums2, num)){
                if(!l1.contains(num)){
                    l1.add(num);
                }
            }
        }
        li.add(l1);
        
        for(int num : nums2){
            if(!binarySearch(nums1, num)){
                if(!l2.contains(num)){
                    l2.add(num);
                }
            }
        }
        li.add(l2);
        return li;
    }
    
    public boolean binarySearch(int[] arr, int target){
        int s=0, e=arr.length-1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }else if(target > arr[m]){
                s=m+1;
            }else{
                return true;
            }
        }
        return false;
    }
}