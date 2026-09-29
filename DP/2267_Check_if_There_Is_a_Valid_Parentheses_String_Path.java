// Dynamic Programming Solution  
 
class Solution {
    int dp[][][]; //memoization 3D matrix
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m+1][n+1][m+n+1];

        for(int i = 0; i<=m; i++)
        {
            for(int j = 0; j<n+1; j++)
            {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, grid.length-1, grid[0].length-1, 0, grid);
    }
    boolean solve(int i, int j, int m, int n, int sum, char [][] grid)
    {
        if(i == m && j == n)
        {
            if(grid[i][j] == '(')
            sum += 1;
            else
            sum -= 1;

            if(sum == 0)
            return true;
            else 
            return false;
        }
        

        if(i > m || j > n || i < 0 || j < 0)
        return false;

        if(grid[i][j] == '(')
        sum += 1;
        else
        sum -= 1;
        
        if(sum < 0)
        {
            return false;
        }

        //memoization check
        if(dp[i][j][sum] != -1)
        if(dp[i][j][sum] == 1)
        return true;
        else 
        return false;

        //right
        boolean right = solve(i, j+1, m, n, sum, grid);
        //down
        boolean down = solve(i+1, j, m, n, sum, grid);

        boolean ans = right || down;
        if(ans)
        dp[i][j][sum] = 1;
        else 
        dp[i][j][sum] = 0;

        return ans;
    }
}
