/*
LeetCode Link: https://leetcode.com/problems/concatenate-array-with-reverse/
*/

class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums)
        list.add(ele);
        Collections.reverse(list);

        int arr[] = new int[2*n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = nums[i];
            arr[n+i] = list.get(i);
        }
        return arr;
    }
}
