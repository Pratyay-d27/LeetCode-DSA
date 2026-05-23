/*
LeetCode Link: https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds/
*/

class Solution {
    public int numberOfChild(int n, int k) {
        //base case 
        if(k<n)
        return k;

        //rest of the code 
        int pointer = 0;
        boolean dir = false;
        while(k>0)
        {
            if(pointer == n-1)
            dir = true;
            else if(pointer == 0)
            dir = false;
            if(pointer < n && dir == false)//go forward
            pointer++;
            else if(pointer < n && dir == true)
            pointer--;
            
            k--;
        }
        return pointer;
    }
}
