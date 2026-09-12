// 
class Solution {
    int dp[][];
    public int minDays(int n) {
        dp = new int[500][n+2];
        for(int i = 0; i<500; i++)
        Arrays.fill(dp[i], -1);
        
        return solve(n, 0, 0);
    }
    int solve(int n, int streak, int score)
    {
        if(score == n)
        return 0;
        if(score > n)
        return 100000000;

        if(dp[streak][score] != -1)
        return dp[streak][score];
        
        int take = 1 + solve(n, streak+1, score+streak+1);
        int skip;
        if(streak > 0)
        skip = 1 + solve(n, 0, score);
        else 
        skip = 100000000;

        return dp[streak][score] = Math.min(take, skip);
    }
}
