/*
LeetCode Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/?envType=daily-question&envId=2026-05-16
*/

class Solution {
    public int findMin(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele: nums)
        set.add(ele);
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }
}
