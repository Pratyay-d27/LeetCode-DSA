/*
LeetCode Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
*/

class Solution {
    public int search(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums)
        list.add(ele);
        return list.indexOf(target);
    }
}
