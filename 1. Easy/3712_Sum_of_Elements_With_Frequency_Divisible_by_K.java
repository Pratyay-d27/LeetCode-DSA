/*
LeetCode Libk: https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/
*/

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int arr[] = new int[101];
        for(int i = 0; i<nums.length; i++)
        {
            arr[nums[i]]++;
        }
        int count = 0; 
        for(int i = 0; i<101; i++)
        {
            if(arr[i] != 0 && arr[i] % k == 0)
            count += i * arr[i];
        }
        return count;
    }
}
