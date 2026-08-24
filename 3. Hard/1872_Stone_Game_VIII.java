class Solution {
    int dp[]; // 1-D memoization array
    public int stoneGameVIII(int[] stones) {
        dp = new int[stones.length+2];
        Arrays.fill(dp, 10005);
        
        for(int i = 1; i<stones.length; i++) //convert stones array to prefix sum 
        stones[i] += stones[i-1];

        return solve(1, stones);
    }
    int solve(int i, int stones[])
    {
        if(i == stones.length-1)
        return stones[stones.length-1];

        if(dp[i] != 10005) // memoization check
        return dp[i]; //end prematurely if memoization check is true

        int take = stones[i] - solve(i+1, stones);
        int skip = solve(i+1, stones);

        return dp[i] = Math.max(take, skip);
    }
}
