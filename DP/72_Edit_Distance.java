class Solution {
    int dp[][] = new int[502][502];
    public int minDistance(String word1, String word2) {
        for(int i = 0; i<502; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return solve(word1, word2, 0, 0);
    }
    int solve(String s1, String s2, int i, int j)
    {
        //base cases 
        if(i == s1.length() && j == s2.length())
        return 0;
        else if(j == s2.length())
        return s1.length() - i;
        else if(i == s1.length())
        return s2.length() - j;

        if(dp[i][j] != -1)
        return dp[i][j];        

        //rest of the code 
        if(s1.charAt(i) == s2.charAt(j))
        return dp[i][j] = solve(s1, s2, i+1, j+1);
        else 
        {
            int insert = 1 + solve(s1, s2, i, j+1);
            int delete = 1 + solve(s1, s2, i+1, j);
            int replace = 1 + solve(s1, s2, i+1, j+1);
            return dp[i][j] = Math.min(insert , Math.min(delete, replace));
        }
    }
}
