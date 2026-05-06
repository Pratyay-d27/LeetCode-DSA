/*
LeetCode Link: https://leetcode.com/problems/rotating-the-box/?envType=daily-question&envId=2026-05-06
*/

class Solution {
    static void print(char matrix[][])
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public char[][] rotateTheBox(char[][] boxGrid) {
        //reversing the matrix by 90 deg
        int m = boxGrid.length, n = boxGrid[0].length;
        char[][] matrix = new char[n][m];
        for(int i = 0; i<m; i++) 
        for(int j = 0; j<n; j++) 
        matrix[j][m-1-i] = boxGrid[i][j];
        
        //matrix reversed by 90deg
        for(int i = 0; i < matrix[0].length; i++)
        {
            for(int j = matrix.length-1; j>=0; j--)
            {
                // traverse matrix[j][i]
                if(matrix[j][i] == '.')
                {
                    int p = j-1, g = 0;
                    while(p >= 0)
                    {
                        if(matrix[p][i] == '#')
                        break;
                        else if(matrix[p][i] == '*')
                        {
                            g = -10;
                            break;
                        }
                        else 
                        p--;
                    }
                    //if obstacle encountered 
                    if(g == -10)
                    {
                        j = p;
                        continue;
                    }
                    
                    if(p == -1)
                    p++;
                    //else swap the p and j
                    char c = matrix[j][i];
                    matrix[j][i] = matrix[p][i];
                    matrix[p][i] = c;
                } 
            }
        }
        return matrix;
    }
}
