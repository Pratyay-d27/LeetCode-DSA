/*
LeetCode Link: https://leetcode.com/problems/find-the-degree-of-each-vertex/
*/

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[] = new int[matrix.length];
        for(int i = 0; i<matrix.length; i++)
        {
            int count = 0;
            for(int j = 0; j<matrix[i].length; j++)
            {
                if(matrix[i][j] == 1)
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
