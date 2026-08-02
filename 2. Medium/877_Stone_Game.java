class Solution {
    public boolean stoneGame(int[] piles) {
        int dp[][] = new int[502][502];
        int sum = 0;
        for(int ele: piles)
        sum += ele;

        int scoreA = solve(0, piles.length-1, piles, dp);
        int scoreB = sum - scoreA;
        return (scoreA >= scoreB);
    }
    int solve(int i, int j, int piles[], int dp[][])
    {
        if( i > j)
        return 0;

        if (dp[i][j] != 0)
        return dp[i][j];

        int takeI = piles[i] + Math.min(solve(i+2, j, piles, dp), solve(i+1, j-1, piles, dp));
        int takeJ = piles[j] + Math.min(solve(i+1, j-1, piles, dp), solve(i, j-2, piles, dp));

        return dp[i][j] = Math.max(takeI, takeJ);
    }
}
