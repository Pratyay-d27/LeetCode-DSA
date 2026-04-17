/*
LeetCode Link: https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/?envType=daily-question&envId=2026-04-17
*/

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            min = Math.min(min, (i - map.get(nums[i])));
            map.put(reverse(nums[i]), i);
        }
        return (min == Integer.MAX_VALUE)?-1:min;
    }
    static int reverse(int n)
    {
        int ans = 0;
        while(n>0)
        {
            int d = n%10;
            ans = ans*10 + d;
            n = n/10;
        }
        return ans;
    }
}
