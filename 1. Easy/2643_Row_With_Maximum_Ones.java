// Brute Force Solut

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int ones = 0, numberOfOnes = -1, index = -1;
        for(int i = 0; i<m; i++)
        {
            ones = 0;
            for(int j = 0; j<n; j++)
            {
                if(mat[i][j] == 1)
                ones++;
            }
            if(ones > numberOfOnes)
            {
                index = i;
                numberOfOnes = ones;
            }
        }
        return new int[] {index, numberOfOnes};
    }
}
