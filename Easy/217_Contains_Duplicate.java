/*
LeetCode Link: https://leetcode.com/problems/contains-duplicate/?envType=problem-list-v2&envId=array
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        //base case 
        if(n == 1)
        return false;

        //rest of the code 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums)
        {
            if(map.containsKey(ele) == false)
            map.put(ele, 1);
            else
            {
                map.put(ele, map.get(ele)+1);
                if(map.get(ele) > 1)
                return true;
            } 
        }
        return false;
    }
}
