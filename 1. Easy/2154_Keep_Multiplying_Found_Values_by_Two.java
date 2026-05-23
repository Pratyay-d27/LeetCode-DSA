/*
LeetCode Link: https://leetcode.com/problems/keep-multiplying-found-values-by-two/
*/
class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums)
        list.add(ele);
        if(list.contains(original) == false)
        return original;
        else 
        {
            while(list.contains(original) == true)
            original *= 2;
        }
        return original;
    }
}
