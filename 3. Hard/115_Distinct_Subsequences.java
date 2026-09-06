class Solution {
    int dp[][] = new int[1002][1002];
    public int numDistinct(String s, String t) {
        for(int i = 0; i<1002; i++)
        Arrays.fill(dp[i], -1);

        //need to find all subsequences of s
        return solve(s, t, 0, 0);
    }
    int solve(String s, String t, int i, int j)
    {
        //base case 
        if(j == t.length())
        return 1;
        if(i == s.length())
        return 0;

        if(dp[i][j] != -1)
        return dp[i][j];

        if(s.charAt(i) == t.charAt(j))///character matches 
        {
            return dp[i][j] = solve(s, t, i+1, j+1) + solve(s, t, i+1, j);
        }
        else //when character dosent match the skip i
            return dp[i][j] = solve(s, t, i+1, j);
    }
}
