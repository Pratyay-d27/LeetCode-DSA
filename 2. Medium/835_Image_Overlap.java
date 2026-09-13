class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int max = 0;
        for(int i = -n+1; i<n; i++)
        {
            for(int j = -n+1; j<n; j++)
            {
                max = Math.max(max, solve(i, j, img1, img2));
            }
        }
        return max;
    }
    int solve(int row, int col, int[][] nums1, int[][] nums2)
    {
        int count = 0, n = nums1.length;
        for(int i = 0; i<nums1.length; i++)
        {
            for(int j = 0; j<nums1.length; j++)
            {
                int row_offset = i + row;
                int col_offset = j + col;
                if(row_offset < 0 || col_offset < 0 || row_offset >= n || col_offset >= n)
                continue;

                //count if 1 matches in both the matrices 
                if((nums1[i][j] & nums2[row_offset][col_offset]) == 1)
                count++;
            }
        }
        return count;
    }
}
