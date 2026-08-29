class Solution {
    int dp[][] = new int[1002][1002]; //memoization 2D array initialization
    public int longestCommonSubsequence(String text1, String text2) {
        for(int i = 0; i<1002; i++)
        Arrays.fill(dp[i], -1);
        return solve(text1, text2, 0, 0);
    }
    int solve(String str1, String str2, int i, int j)
    {
        if(i >= str1.length() || j >= str2.length())
        return 0;

        if(dp[i][j] != -1)
        return dp[i][j];

        if(str1.charAt(i) == str2.charAt(j))
        return dp[i][j] = 1 + solve(str1, str2, i+1, j+1);
        else 
        return dp[i][j] = Math.max(solve(str1, str2, i+1, j), solve(str1, str2, i, j+1));
    }
}
