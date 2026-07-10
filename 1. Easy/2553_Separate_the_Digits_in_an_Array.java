/*
LeetCode Link: https://leetcode.com/problems/separate-the-digits-in-an-array/?envType=daily-question&envId=2026-05-11
*/

class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for(int ele: nums)
        s += String.valueOf(ele);
        int n = s.length();
        int arr[] = new int[n];
        int i = 0; 
        for(char ch: s.toCharArray())
        {
            arr[i] = ch - '0';
            i++;
        }
        return arr;
    }
}
