/*
LeetCode Link: https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/?envType=daily-question&envId=2026-05-21
*/

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>(); 
        for(int ele: arr1)
        {
            while(ele>0)
            {
                set1.add(ele);
                ele /= 10;
            }
        }
        int count = 0;
        for(int ele: arr2)
        {
            while(ele>0)
            {
                if(set1.contains(ele))
                {
                    int len = length(ele);
                    count = Math.max(count, len);
                }
                ele /= 10;
            }
        }
        return count;
    }
    static int length(int n)
    {
        String s = String.valueOf(n);
        return s.length();
    }
}
