class Solution {
    int dp[][] = new int[502][502]; //memoization array 
    public int minInsertions(String s) {
        for(int i = 0; i<502; i++)
        Arrays.fill(dp[i], -1);

        if(s.length() == 1)
        return 0;

        return solve(s, 0, s.length()-1);
    }
    int solve(String s, int i, int j)
    {
        if(i>=j)
        return 0;

        if(dp[i][j] != -1)
        return dp[i][j];

        if(s.charAt(i) == s.charAt(j))
        return dp[i][j] = 0 + solve(s, i+1, j-1);
        else 
        {
            return dp[i][j] = Math.min( (1 + solve(s, i+1, j)), (1 + solve(s, i, j-1)) );
        }
    }
}
