/*
LeetCode Link: https://leetcode.com/problems/number-of-senior-citizens/
*/

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i<details.length; i++)
        {
            String s = "";
            s += details[i].charAt(11);
            s += details[i].charAt(12);
            int n = Integer.valueOf(s);
            if(n>60)
            count++;
        }
        return count;
    }
}
