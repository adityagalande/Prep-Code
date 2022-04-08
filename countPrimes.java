/*
Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0


https://leetcode.com/problems/count-primes/
*/


class Solution {
    public int countPrimes(int n) {
        boolean[] num = new boolean[n];
        int c=0;
        for(int i=2; i<n; i++){
            if(num[i] == false){
                c++;
                for(int j=2; j*i<n; j++){
                    num[j*i] = true;
                }
            }
        }
        return c;
    }
}
