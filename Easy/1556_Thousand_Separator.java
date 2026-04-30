/*
LeetCode Link: https://leetcode.com/problems/thousand-separator/
*/

class Solution {
    public String thousandSeparator(int n) {
        if(n<1000)
        return String.valueOf(n);

        String str = "";
        int count = 0;
        while(n>0)
        {
            int d = n%10;
            char ch = (char)(d+'0');
            count++;
            if(count == 3)
            {
                str = ch+str;
                str = '.' + str;
                count = 0;
            }
            else 
            str = ch+str;
            n = n/10;
        }
        if(str.charAt(0) == '.')
        return str.substring(1);
        return str;
    }
}
