/*
LeetCode Link: https://leetcode.com/problems/rotate-image/?envType=daily-question&envId=2026-05-04
*/

class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        //transpose
        for(int i = 0; i<m; i++)
        {
            for(int j = i; j<n; j++)
            {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        //reverse each row
        for(int i = 0; i<m; i++)
        {
            reverse(matrix[i]);
        }
    }
    static void reverse(int arr[])
    {
        int i = 0, j = arr.length-1;
        while(i<j)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}

