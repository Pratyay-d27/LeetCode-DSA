class Solution {
    int dp[][] = new int[1001][1001]; //memoization array 
    public String longestPalindrome(String s) {
        for(int i = 0; i<1001; i++)
        Arrays.fill(dp[i], -1);

        String arr[] = new String[1];
        int max = -1;
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i; j<s.length(); j++)
            {
                if(solve(s, i, j) == 1)
                {
                    if(j-i > max)
                    {
                        max = j-i;
                        arr[0] = s.substring(i, j+1);
                    }
                }
            }
        }
        return arr[0];
    }
    int solve(String str, int i, int j)
    {
        if(i>j)
        return 1;

        if(dp[i][j] != -1) // memoization check 
        return dp[i][j];

        if(str.charAt(i) == str.charAt(j))
        return dp[i][j] = solve(str, i+1, j-1);
        else 
        return dp[i][j] = 0;
    }
}
