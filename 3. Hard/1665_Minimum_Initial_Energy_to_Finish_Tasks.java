/*
LeetCode Link: https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/?envType=daily-question&envId=2026-05-12
*/

class Solution {
    public int minimumEffort(int[][] tasks) {
        //sort according to difference 
        Arrays.sort(tasks, (a, b) -> Integer.compare((b[1]-b[0]), (a[1]-a[0])));
 
        //sorting done. Now binary search and isPossible function 
        int l = 0, r = (int)Math.pow(10, 9), result = Integer.MAX_VALUE; 
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(isPossible(tasks, mid))
            {
                result = Math.min(result, mid);
                r = mid-1;
            }
            else 
            l = mid+1;
        }
        return result;
    }
    static boolean isPossible(int matrix[][], int tasks)
    {
        for(int i = 0; i<matrix.length; i++)
        {
            int actual = matrix[i][0], minimum = matrix[i][1];

            if (minimum > tasks)
            return false;

            tasks -= actual;
        }
        return true;
    }
}
