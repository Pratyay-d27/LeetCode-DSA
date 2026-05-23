/*
LeetCode Link: https://leetcode.com/problems/rotated-digits/?envType=daily-question&envId=2026-05-02
*/

class Solution {
    public int rotatedDigits(int n) {
       int count = 0;
       for(int i = 1; i<=n; i++)
       {
            String s = String.valueOf(i);
            if(s.indexOf('3') != -1 || s.indexOf('4') != -1 || s.indexOf('7') != -1 || i == 0 || i == 1 || i == 8)
            continue;

            //System.out.println(i);
            //main code 
            String str = "";
            int k = i;
            while(k>0)
            {
                int d = k%10;
                //cases
                if(d == 0 || d == 1 || d == 8)
                str = ((char)(d+'0')) + str;
                else if(d == 2)
                str = ((char)(5+'0')) + str;
                else if(d == 5)
                str = ((char)(2+'0')) + str;
                else if(d == 6)
                str = ((char)(9+'0')) + str;
                else if(d == 9)
                str = ((char)(6+'0')) + str;
                else 
                str = str;
                k = k/10;
            }
            if(!str.equals(s))
            count++;
       }
       return count;
    }
}
