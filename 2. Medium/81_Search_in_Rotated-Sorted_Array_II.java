/*
LeetCOde Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
*/

class Solution {
    public boolean search(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums)
        list.add(ele);
        int d = list.indexOf(target);
        return (d != -1);
    }
}
