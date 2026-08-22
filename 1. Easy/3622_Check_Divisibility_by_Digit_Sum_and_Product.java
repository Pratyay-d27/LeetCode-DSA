class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1, key = n;
        while(n>0)
        {
            int d = n % 10;
            sum += d;
            prod *= d;
            n = n/10;
        }
        return (key % (sum+prod) == 0);
    }
}
