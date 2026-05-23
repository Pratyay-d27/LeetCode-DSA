/*
LeetCode Link: https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/
*/

class Solution {
    public int sumOfPrimesInRange(int n) {
        int num = n;
        int rev = 0;
        while(n>0)
        {
            int d = n%10;
            rev = rev * 10 + d;
            n = n/10;
        }

        int num1 = Math.min(num, rev);
        int num2 = Math.max(num, rev);
        //the numbers are: num and rev

        int count = 0;
        for(int i = num1; i<= num2; i++)
        {
            if(prime(i) && i != 1)
            count += i;
        }
        return count;
    }
    static boolean prime(int n)
    {
        for(int i = 2; i<n/2+1; i++)
        {
            if(n % i == 0)
            return false;
        }
        return true;
    }
}
