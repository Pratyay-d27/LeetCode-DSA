/*
LeetCode Link: https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/?envType=daily-question&envId=2026-04-10
*/
//Brute Force Approach
class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int matrix[][] = new int[n][3];
        for(int i = 0; i<n; i++)
        {
            matrix[i][0] = i;
            int j = i+1, k;
            while(j < n && nums[j] != nums[i])
            j++;
            if(j < n)
            matrix[i][1] = j;
            k = j+1;
            while(k < n && nums[k] != nums[i])
            k++;
            if(k < n)
            matrix[i][2] = k;
        }
        int min = Integer.MAX_VALUE;
        for(int p = 0; p<n; p++)
        {
            int i = matrix[p][0], j = matrix[p][1], k = matrix[p][2];
            if(matrix[p][1] != 0 && matrix[p][2] != 0)
            {
                int d = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                if(d < min)
                min = d;
            }
        }
        if(min != Integer.MAX_VALUE)
        return min;
        return -1;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
