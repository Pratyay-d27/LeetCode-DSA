/*
LeetCode Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/?envType=daily-question&envId=2026-05-23
*/

class Solution {
    public boolean check(int[] nums) {

        int n = nums.length, max = nums[0];
        for(int i = 1; i<n; i++)
        max = Math.max(max, nums[i]);
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int i = 0;
        while(i<n && nums[i] != max)
        {
            list.add(nums[i]);
            i++;
        }
        while(i<n && nums[i] == max)
        {
            list.add(nums[i]);
            i++;
        }
        while(i<n)
        {
            list2.add(nums[i]);
            i++;
        }
        //check ascending for list
        for(int k = 1; k<list.size(); k++)
        {
            if(list.get(k-1) > list.get(k))
            return false;
        }
        for(int k = 1; k<list2.size(); k++)
        {
            if(list2.get(k-1) > list2.get(k))
            return false;
        }
        if(list2.size()>0 && list.size()>0 && list2.get(list2.size()-1) > list.get(0) )
        return false;
        return true;
    }
}

