class Solution {
    int max = 1;
    int dp[][] = new int[1002][1002];
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 1)
        return 1;

        return solve(s, 0, s.length()-1);
    }
    int solve(String str, int i, int j)
    {
        if(i > j)
        return 0;

        if(dp[i][j] != 0)
        return dp[i][j];

        if(str.charAt(i) == str.charAt(j))
        if(i == j)
        return dp[i][j] = 1 + solve(str, i+1, j-1);
        else 
        return dp[i][j] = 2 + solve(str, i+1, j-1);
        else 
        return dp[i][j] = Math.max(solve(str, i, j-1), solve(str, i+1, j));
    }
}
