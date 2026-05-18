/*
LeetCode Link: https://leetcode.com/problems/fibonacci-number/
*/

class Solution {
    public int fib(int n) {
        int dp[] = new int[31];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    static int solve(int n, int[] dp)
    {
        if(n < 2)
        return n;

        if(dp[n] != -1)
        return dp[n];

        int a = solve(n-1, dp);
        int b = solve(n-2, dp);
        dp[n-1] = a;
        dp[n-2] = b;

        return a+b;
    }
}
