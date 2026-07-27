//simple greedy approach 

class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0)
        return 0;

        int dig = (int) Math.pow(10, n) - 1;
        if(sum(dig) < s)
        return -1;
        while(dig >= 0)
        {
            if(sum(dig) == s)
            return dig;
            dig--;
        }
        return -1;
    }
    int sum(int n)
    {
        int ans = 0;
        while(n > 0)
        {
            int d = n % 10;
            ans += d;
            n = n / 10;
        }
        return ans;
    }
}
