class Solution {
    int dp[] = new int[100002];
    public int climbStairs(int n, int[] costs) {
        Arrays.fill(dp, -1);
        return solve(0, n, costs);
    }

    //this function will return (minimum) cost 
    int solve(int stair, int n, int[] costs)
    {
        //BASE CASE: when present stair > available stairs
        if(stair >= n)
        return 0;

        if(dp[stair] != -1)
        return dp[stair];

        int cost = 0;

        //choices -- recursion 
        if(stair+1 <= n)
        cost = (costs[stair] + 1) + solve(stair+1, n, costs);

        if(stair+2 <= n)
        cost = Math.min(cost, (costs[stair+1] + 4) + solve(stair+2, n, costs));

        if(stair+3 <= n)
        cost = Math.min(cost, (costs[stair+2] + 9) + solve(stair+3, n, costs));

        return dp[stair] = cost;
    }
}
