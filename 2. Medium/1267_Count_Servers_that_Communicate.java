class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean row[] = new boolean[m];
        boolean column[] = new boolean[n];

        //first for row 
        for(int i = 0; i<m; i++)
        {
            int count = 0;
            for(int j = 0; j<n; j++)
            {
                //int row = i
                if(grid[i][j] == 1)
                count += 1;
                if(count >= 2)
                {
                    row[i] = true;
                    break;
                }
            }
        }
        
        //next for column 
        for(int i = 0; i<n; i++)
        {
            int count = 0;
            for(int j = 0; j<m; j++)
            {
                //int row = i
                if(grid[j][i] == 1)
                count += 1;
                if(count >= 2)
                {
                    column[i] = true;
                    break;
                }
            }
        }

        int count = 0; // 
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == 1)
                {
                    if(row[i] == true || column[j] == true)
                    count++;
                }
            }
        }
        return count;
    }
}
