/*
LeetCode Link: https://leetcode.com/problems/reverse-words-in-a-string/
*/

class Solution {
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        String count = "";
        for(int i = str.length-1; i>=0; i--)
        {
            if(i == 0)
            {
                count = count + str[i];
                continue;
            }
            count = count + str[i] + " ";
        }
        return count.trim();
    }
}
