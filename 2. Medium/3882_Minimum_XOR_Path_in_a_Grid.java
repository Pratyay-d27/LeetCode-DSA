// 

class Solution {
    int dp[][][];

    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m+1][n+1][1100];
        for(int i = 0; i<m+1; i++)
        {
            for(int j = 0; j<n+1; j++)
            {
                for(int k = 0; k<1100; k++)
                dp[i][j][k] = -1;
            }
        }

        return solve(0, 0, grid.length, grid[0].length, 0, grid);
    }

    int solve(int i, int j, int m, int n, int xor, int[][] grid)
    {
        if(i == m-1 && j == n-1)
        {
            return xor = xor ^ grid[i][j];
        }

        if(i > m-1 || j > n-1)//when out of bound
        return Integer.MAX_VALUE;

        if(dp[i][j][xor] != -1)
        return dp[i][j][xor];

        //go right
        int right = solve(i, j+1, m, n, xor ^ grid[i][j], grid);
        //go down
        int down = solve(i+1, j, m, n, xor ^ grid[i][j], grid);

        dp[i][j][xor] = Math.min(right, down);

        return dp[i][j][xor];
    }
}
