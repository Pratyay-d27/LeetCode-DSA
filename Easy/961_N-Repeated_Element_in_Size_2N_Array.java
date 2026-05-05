/*
LeetCode Link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
*/

class Solution {
    public int repeatedNTimes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums)
        {
            if(list.contains(ele))
            return ele;
            else 
            list.add(ele);
        }
        return -1;
    }
}
