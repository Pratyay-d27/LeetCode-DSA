/*
LeetCode Link: https://leetcode.com/problems/defuse-the-bomb/
*/

class Solution {
    public int[] decrypt(int[] code, int k) {
        //base case 
        if(k == 0)
        return new int[code.length];
        
        //rest of the code 
        int n = code.length;
        int arr[] = new int[code.length];
        for(int i = 0; i<arr.length; i++)
        {
            if(k>0)
            {
                for(int j = (i+1)%n, step = 0; step < k; j = (j+1)%n)
                {
                    arr[i] += code[j];
                    step++;
                }
            }
            else if(k<0)
            {
                for(int j = (i-1+n)%n, step = 0; step < Math.abs(k); j = (j-1+n)%n)
                {
                    arr[i] += code[j];
                    step++;
                }
            }
        }
        return arr;
    }
}
