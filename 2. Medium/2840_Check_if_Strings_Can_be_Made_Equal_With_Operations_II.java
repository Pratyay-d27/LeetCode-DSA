/*
LeetCode Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/description/?envType=daily-question&envId=2026-04-09
*/
class Solution {
    public boolean checkStrings(String s1, String s2) {
        int odd[] = new int[26];
        int even[] = new int[26];
        int n = s2.length();
        for(int i = 0; i<n; i++)
        {
            if(i % 2 == 0)
            {
                even[(s1.charAt(i) - 'a')]++;
                even[(s2.charAt(i) - 'a')]--;
            }
            else
            {
                odd[(s1.charAt(i) - 'a')]++;
                odd[(s2.charAt(i) - 'a')]--;
            }
        }
        for(int i = 0; i<even.length; i++)
        {
            if(even[i] != 0 || odd[i] != 0)
            return false;
        }
        return true;
    }
}
