/*
LeetCode Link: https://leetcode.com/problems/climbing-stairs/
*/

//Bottom Up Method
class Solution {
    public int climbStairs(int n) {
        int t[] = new int[46];
        t[0] = 0;t[1] = 1;t[2] = 2;
        if(n<2)
        return t[n];
        for(int i = 3; i<=n; i++)
        t[i] = t[i-1] + t[i-2];
        return t[n];
    }
}
