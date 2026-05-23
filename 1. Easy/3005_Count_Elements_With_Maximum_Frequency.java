/*
LeetCode Link: https://leetcode.com/problems/count-elements-with-maximum-frequency/
*/

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++)
        arr[nums[i]]++;

        for(int ele: arr)
        if(ele != 0)
        list.add(ele);

        Collections.sort(list);
        int max = list.get(list.size()-1);
        int sum = 0;
        for(int i = 0; i<list.size(); i++)
        {
            if(list.get(i) == max)
            sum += list.get(i);
        }
        return sum;
    }
}
