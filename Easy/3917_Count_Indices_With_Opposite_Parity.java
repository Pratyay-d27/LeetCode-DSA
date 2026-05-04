/*
LeetCode Link: https://leetcode.com/problems/count-indices-with-opposite-parity/
*/

class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        //base case 
        if(n == 1)
        return arr;

        //rest of the code 
        for(int i = 0; i<n ;i++)
        {
            int count = 0;
            for(int j = i+1; j<n; j++)
            {
                if(nums[i] % 2 != nums[j] % 2)
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
