/*
LeetCode Link: https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
*/

class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int rem = n * 5 / 100;
        Arrays.sort(arr);
        //remove 1st smallest rem elements
        for(int i = 0; i<rem; i++)
        {
            arr[i] = 0;
            arr[n-1-i] = 0;
        }
        int count = 0;
        for(int i = 0; i<n; i++)
        count += arr[i];
        return (double)count/(n-rem-rem);
    }
}
