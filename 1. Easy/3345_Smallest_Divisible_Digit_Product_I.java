class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i<=100; i++)
        {
            int prod = product(i);
            if(prod % t == 0)
            return i;
        }
        return -1;
    }
    int product(int n)
    {
        int prod = 1;
        while(n>0)
        {
            int d = n%10;
            prod *= d;
            n = n/10;
        }
        return prod;
    }
}
