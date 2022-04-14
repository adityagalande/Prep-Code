/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


https://leetcode.com/problems/intersection-of-two-arrays/
*/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        int i=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums1){
            if(binarySearch(nums2, num)){
                hs.add(num);
            }
        }
        int[] temp = new int[hs.size()];
        for(Integer num : hs){
            temp[i] = num;
            i++;
        }
        return temp;
    }
    
    public boolean binarySearch(int[] nums2, int target){
    int s=0, e=nums2.length-1;
    
    while(s<=e){
        int m = s+(e-s)/2;
        if(target < nums2[m]){
            e=m-1;
        }else if(target > nums2[m]){
            s=m+1;
        }else{
            return true;
        }
    }
    return false;
}
}

