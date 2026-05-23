/*
LeetCode Link: https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/
*/
//Optimal Solution
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
            
            ArrayList<Integer> list = map.get(nums[i]);
            if(list.size() >= 3)
            {
                int k = list.get(list.size()-1);
                int p = list.get(list.size()-3);
                min = Math.min(min, 2 * (k - p));
            }
        }
        if(min != Integer.MAX_VALUE)
        return min;
        return -1;
    }
}
