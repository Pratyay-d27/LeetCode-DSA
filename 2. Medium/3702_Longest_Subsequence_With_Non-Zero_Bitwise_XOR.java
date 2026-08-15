class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0, sum = 0;
        for(int ele: nums)
        {
            xor = ele ^ xor;
            sum += ele;
        }
        if(xor == 0 && sum == 0)
        return 0;
        else if(xor == 0 && sum != 0)
        return nums.length-1;
        else
        return nums.length;
    }
}
