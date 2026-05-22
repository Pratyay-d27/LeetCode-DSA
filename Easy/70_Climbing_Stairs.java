/*
LeetCode Link: https://leetcode.com/problems/climbing-stairs/
*/

//Recursion + Memoization
class Solution {
    public int climbStairs(int n) {
        int t[] = new int[n+1];
        return solve(n, t);
    }
    static int solve(int n, int t[])
    {
        if(n<0)
        return 0;
        if(n == 0)
        return 1;
        //memiozation
        if(t[n] != 0)
        return t[n];
        return t[n] = (solve(n-1, t)+solve(n-2, t));
    }
}


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
