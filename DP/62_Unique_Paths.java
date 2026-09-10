class Solution {
    int dp[][] = new int[102][102];
    public int uniquePaths(int m, int n) {
        for(int i = 0; i<102; i++)
        Arrays.fill(dp[i], -1);

        return solve(0, 0, m, n);
    }
    int solve(int i, int j, int m, int n)
    {
        //reached end of the matrix -- 1 path found
        if(i == m-1 && j == n-1)
        return 1;
        
        //case for out of bound
        if(i > m-1 || j > n-1)
        return 0;

        if(dp[i][j] != -1)
        return dp[i][j];

        int right = solve(i, j+1, m, n);
        int down = solve(i+1, j, m, n);

        return dp[i][j] = right + down;
    }
}
