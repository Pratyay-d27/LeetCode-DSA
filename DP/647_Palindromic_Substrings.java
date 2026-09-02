class Solution {
    int dp[][] = new int[1001][1001];
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i; j<s.length(); j++)
            {
                if(check(s, i, j) == 1)
                count++;
            }
        }
        return count;
    }
    int check(String str, int i, int j)
    {
        if(i>j)
        return 1;

        if(dp[i][j] == 1 || dp[i][j] == -1)
        return dp[i][j]; 

        if(str.charAt(i) == str.charAt(j))
        return dp[i][j] = check(str, i+1, j-1);
        else 
        return dp[i][j] = -1;
    }
}
