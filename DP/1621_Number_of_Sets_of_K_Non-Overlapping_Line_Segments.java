class Solution {
    int M = 1000000007;
    int dp[][] = new int[1002][1002];
    public int numberOfSets(int n, int k) {
        for(int i = 0; i<1002; i++)
        Arrays.fill(dp[i], -1);

        return solve(n, k, 0);
    }
    int solve(int n, int k, int i)
    {
        if(k == 0)
        return 1;
        if(i >= n)
        return 0;

        if(dp[k][i] != -1)
        return dp[k][i];

        long skip = 0, take = 0;
        skip = solve(n, k, i+1) % M;
        //for take - list of possible ending points
        for(int j = i+1; j<n; j++)
        {
            take += solve(n, k-1, j) % M;
        }
        return dp[k][i] = (int) ((take + skip) % M);
    }
}
