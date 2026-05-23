/*
LeetCode Link: https://leetcode.com/problems/sum-of-unique-elements/
*/

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums)
        {
            if(map.containsKey(ele) == false)
            map.putIfAbsent(ele, 1);
            else 
            map.put(ele, map.get(ele)+1);
        }
        int sum = 0;
        for(var ele: map.entrySet())
        {
            if(ele.getValue() == 1)
            sum += ele.getKey();
        }
        return sum;
    }
}
