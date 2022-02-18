/*
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

 

Example 1:

Input: n = 987
Output: "987"
Example 2:

Input: n = 1234
Output: "1.234"


https://leetcode.com/problems/thousand-separator/
*/


class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n), res="";
        
        for(int i=0; i<s.length(); i++){
            if(i > 0 && (s.length() - i)%3 == 0 ){
                res +=".";
            }
            res +=s.charAt(i);
        }
        
        return res;
    }
}