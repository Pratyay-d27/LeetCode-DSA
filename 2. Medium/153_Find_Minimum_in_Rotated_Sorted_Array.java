/*
LeetCode Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/?envType=daily-question&envId=2026-05-15
*/

//Method 1 -- usijg brute force 
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int ele: nums)
        min = Math.min(min, ele);
        return min; 
    }
}

//Method 2 -- Using TreeSet and ArrayList
class Solution {
    public int findMin(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele: nums)
        set.add(ele);
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }
}
