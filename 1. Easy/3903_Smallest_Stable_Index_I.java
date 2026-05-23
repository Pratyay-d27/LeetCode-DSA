/*
LeetCode Link: https://leetcode.com/problems/smallest-stable-index-i/
*/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        int maxEle = Integer.MIN_VALUE, minEle = Integer.MAX_VALUE;
        //find max
        for(int i = 0; i<n; i++)
        {
            if(nums[i] > maxEle)
            {
                maxEle = nums[i];
            }
            max.add(maxEle);
        }
        //find min
        for(int i = n-1; i>=0; i--)
        {
            if(nums[i] < minEle)
            {
                minEle = nums[i];
            }
            min.add(minEle);
        }
        Collections.reverse(min);
        int ans = Integer.MAX_VALUE, d = -1;
        for(int i = 0; i<n; i++)
        {
            d = max.get(i) - min.get(i);
            if(d <= k)
            {
                ans = (i<ans)?i:ans;
            }
        }
        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}
